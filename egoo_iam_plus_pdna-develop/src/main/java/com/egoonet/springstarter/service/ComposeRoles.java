package com.egoonet.springstarter.service;

import com.egoonet.springstarter.utils.Constants;
import com.genesyslab.gskm.services.GetRolesResponse;
import com.microsoft.schemas._2003._10.serialization.ObjectFactory;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.datacontract.schemas._2004._07.gskm_services.ArrayOfRole;
import org.datacontract.schemas._2004._07.gskm_services.Role;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetRolesRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Log4j
@Slf4j
@Service
public class ComposeRoles {

    @Autowired
    private RoleServiceMBean roleServiceMBean;

    public List<Map<String,Object>> getRoles(Integer tenantId){
        //定义返回数据类型
        List<Map<String,Object>> rolePojoMaps = new ArrayList<>();

        //将接受到的tenantId封装到GetRolesRequest中
        GetRolesRequest rolesRequest = new GetRolesRequest();
        rolesRequest.setTenantID(tenantId);

/*
        GetRolesResponse getRolesResponse = roleServiceMBean.getRoles(rolesRequest);
        org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetRolesResponse response;
        response = getRolesResponse.getGetRolesResult().getValue();
*/

        //自定义数据测试
        ObjectFactory of = new ObjectFactory();
        List<Role> roleList = new ArrayList<>();
        Role role1 = new Role();
        role1.setID(110);
        role1.setName(of.createString("角色1"));
        roleList.add(role1);
        Role role2 = new Role();
        role2.setID(111);
        role2.setName(of.createString("角色2"));
        roleList.add(role2);
        ArrayOfRole arrayOfRole = new ArrayOfRole();
        arrayOfRole.setRole(roleList);
        org.datacontract.schemas._2004._07.gskm_services.ObjectFactory objectFactory = new org.datacontract.schemas._2004._07.gskm_services.ObjectFactory();
        //GetRolesResponse getRolesResponse = new GetRolesResponse();
        org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetRolesResponse response =new org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetRolesResponse();
        //response = getRolesResponse.getGetRolesResult().getValue();
        response.setRoleList(objectFactory.createArrayOfRole(arrayOfRole));

        //对得到的数据进行解析，转换成List<Role>类型
        //if(getRolesResponse != null){
        if(response != null){
            List<Role> roles = response.getRoleList().getValue().getRole();
            for(Role role : roles){
                Map<String,Object> rolePojoMap = new HashMap<>();
                rolePojoMap.put("id",role.getID());
                rolePojoMap.put("name",role.getName().getValue());
                rolePojoMap.put("type",Constants.ROLE_TYPE_STATIC);
                rolePojoMap.put("status",Constants.ROLE_STATUS_ENABLE);

                rolePojoMaps.add(rolePojoMap);
            }
        } else {
            log.info("连接PDNA失败！");
            return null;
        }
        return rolePojoMaps;
    }
}
