package com.egoonet.springstarter.controller;

import com.egoonet.springstarter.entity.UserPojo;
import com.egoonet.springstarter.service.ComposeRoles;
import com.egoonet.springstarter.utils.Constants;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
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
@RequestMapping(value = "/RolesController",produces = "application/json;charset=UTF-8")
@Api(value = "培训统一权限和参数配置管理", tags = "RolesController", description = "培训统一权限和参数配置管理")
public class RolesController {

    @Autowired
    private ComposeRoles composeRoles;

    @PostMapping("/getRoles")
    @ApiOperation("用户/角色数据推送接口")
    public Map<String, Object> getRoles(@RequestBody Map<String, Object> parameter){
        //请求数据的头信息
        Map<String, String> head = (Map<String, String>) parameter.get("head");
        String reqId = head.get("reqId");
        String layerId = head.get("layerId");
        String seqId = head.get("seqId");
        String times = head.get("times");
        String compId = head.get("compId");

        //请求数据的info信息
        Map<String, Object> info = (Map<String, Object>) parameter.get("info");

        ArrayList userpPojos = (ArrayList) info.get("data");//获取User列表

        //查询到的角色加入到这里
        List<List<Map<String, Object>>> roles = new ArrayList<>();
        if(userpPojos != null && userpPojos.size() > 0){
            UserPojo userPojo = new UserPojo();//多线程？？
            for (int i = 0; i<userpPojos.size(); i++) {
                //将数据转换成 UserPojo 类型，并获取tenantId
                LinkedHashMap<String, Object> mapUserPojo = (LinkedHashMap<String, Object>) userpPojos.get(i);
                JSONObject jsonObject = JSONObject.fromObject(mapUserPojo);
                Gson gson = new Gson();
                userPojo = gson.fromJson(jsonObject.toString(), UserPojo.class);
                Integer tenantId = userPojo.getTenantId();

                List<Map<String, Object>> rolesRe = composeRoles.getRoles(tenantId);
                roles.add(rolesRe);
            }
        }else{
            log.info("接收的数据没有'data'或'data'数据里面没有数据");
        }

        /**
         * 返回数据
         */
        Map<String,Object> resultHead = new HashMap<>();
        resultHead.put("tenantId",Constants.tenantId);
        resultHead.put("ver",Constants.vers);
        resultHead.put("reqId", reqId);
        resultHead.put("layerId",layerId);
        resultHead.put("seqId",seqId);
        resultHead.put("times", times);
        resultHead.put("compId", compId);

        Map<String,Object> result = new HashMap<>();
        result.put("head", resultHead);
        result.put("data", roles);

        return result;
    }

}
