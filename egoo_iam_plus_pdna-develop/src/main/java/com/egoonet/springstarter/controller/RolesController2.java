package com.egoonet.springstarter.controller;

import com.egoonet.springstarter.service.ComposeRoles;
import com.egoonet.springstarter.utils.Constants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping(value = "/RolesController2",produces = "application/json;charset=UTF-8")
@Api(value = "培训统一权限和参数配置管理", tags = "RolesController2", description = "培训统一权限和参数配置管理")
public class RolesController2 {

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

        //请求数据的info信息，获取其中的tenantId
        Map<String, Object> data = (Map<String, Object>) parameter.get("data");
        String tenantIdStr = (String) data.get("tenantId");

        //接收查询到的角色
        List<Map<String, Object>> roles = new ArrayList<>();
        if (tenantIdStr!=null && !("".equals(tenantIdStr))) {
            roles = composeRoles.getRoles(Integer.valueOf(tenantIdStr));
        }else{
            log.info("接收的数据没有tenantId !!");
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
