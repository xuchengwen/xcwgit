package com.egoonet.springstarter.controller;

import com.egoonet.springstarter.entity.RolePojo;
import com.egoonet.springstarter.entity.UserPojo;
import com.egoonet.springstarter.service.ComposeUser;
import com.egoonet.springstarter.utils.Constants;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping(value = "/UserController",produces = "application/json;charset=UTF-8")
@Api(value = "培训统一权限和参数配置管理", tags = "UserController", description = "培训统一权限和参数配置管理")
public class UserController {

    @Autowired
    private ComposeUser composeUser;

    @PostMapping("/operateUser")
    @ApiOperation("用户/角色数据推送接口")
    public Map<String, Object> operateUser(@RequestBody Map<String, Object> parameter){

        //请求数据的头信息
        Map<String, String> head = (Map<String, String>) parameter.get("head");
        String reqId = head.get("reqId");
        String layerId = head.get("layerId");
        String seqId = head.get("seqId");
        String times = head.get("times");
        String compId = head.get("compId");

        //请求数据的info信息
        Map<String, Object> info = (Map<String, Object>) parameter.get("info");
        String dataType = (String) info.get("dataType");//数据类型
        String opType = (String) info.get("opType");//操作类型

        ArrayList userPojos = (ArrayList) info.get("data");//存放数据的对象

        //将所有返回的errorCode都加入到这里，然后在后面判断如果都是errorCode=0返回0，有其他值则返回1
        List<Integer> errorCodes = new ArrayList<>();

        if(userPojos != null && userPojos.size() > 0){
            UserPojo userPojo = new UserPojo();//多线程？？
            for (int i = 0; i<userPojos.size(); i++) {
                //将数据转换成 UserPojo 类型
                LinkedHashMap<String, Object> mapUserPojo = (LinkedHashMap<String, Object>) userPojos.get(i);
                JSONObject jsonObject = JSONObject.fromObject(mapUserPojo);
                Gson gson = new Gson();
                userPojo = gson.fromJson(jsonObject.toString(), UserPojo.class);

                /**
                 *  判断Roles是否有数据，有数据调用更新方法，没数据根据opType调用增删改方法
                 */
                List<RolePojo> rolePojos = userPojo.getRoles();
                //对于有多个Field，但是有部分Field没有数据的情况，还没处理
                //rolePojos !=null要在rolePojos.size() != 0的前面，否则fieldPojos=null时会报空指针异常
                if(rolePojos !=null && rolePojos.size() > 0){
                    log.info("*******调用的是接口3.....");
                    Integer errorCode = composeUser.updateUser(userPojo);
                    errorCodes.add(errorCode);
                }else {
                    log.info("*******调用的是接口1.....");
                    if(Constants.OP_TYPE_ADD.equals(opType)){
                        Integer errorCode = composeUser.saveUser(userPojo);
                        errorCodes.add(errorCode);
                    }else if(Constants.OP_TYPE_EDIT.equals(opType)){
                        Integer errorCode = composeUser.updateUser(userPojo);
                        errorCodes.add(errorCode);
                    }else if(Constants.OP_TYPE_DELETE.equals(opType)){
                        Integer errorCode = composeUser.deleteUser(userPojo);
                        errorCodes.add(errorCode);
                    }else{
                        log.info("接收的opType值有误，未对用户进行增删改操作");
                        //如果opType是其他值则errorCode = 1
                        errorCodes.add(Constants.errorCode_code);
                    }
                }
            }
        }else{
            log.info("接收的数据没有'data'或'data'数据里面没有数据");
            errorCodes.add(Constants.errorCode_code);
        }

        //赋值默认值0和成功，如果返回的数据中errorCode有不等于0的再将值改成1
        Map<String,Object> errorMap = new HashMap<>();
        errorMap.put("errorCode",Constants.errorCode_success);
        errorMap.put("errorMessage",Constants.errorMessage_success);
        if(errorCodes!=null && errorCodes.size() > 0){
            for(Integer errorCode : errorCodes){
                if(errorCode != 0){
                    errorMap.remove("errorCode");
                    errorMap.remove("errorMessage");
                    errorMap.put("errorCode",Constants.errorCode_code);
                    errorMap.put("errorMessage",Constants.errorMessage_code);
                    break;
                }
            }
        }


        // 返回数据类型
        //返回头信息
        Map<String,Object> resultHead = new HashMap<>();
        resultHead.put("tenantId",Constants.tenantId);
        resultHead.put("ver",Constants.vers);
        resultHead.put("reqId", reqId);
        resultHead.put("layerId",layerId);
        resultHead.put("seqId",seqId);
        resultHead.put("times", times);
        resultHead.put("compId", compId);
        resultHead.put("errorCode",errorMap.get("errorCode"));
        resultHead.put("errorMessage",errorMap.get("errorMessage"));

        //返回info信息
        Map<String, Object> resultInfo = new HashMap<>();
        resultInfo.put("dataType",dataType);
        resultInfo.put("opType", opType);//1  新增   2  修改  3  删除
        resultInfo.put("data", "");

        //返回数据
        Map<String,Object> result = new HashMap<>();
        result.put("head", resultHead);
        result.put("info", resultInfo);
        return result;
    }

}
