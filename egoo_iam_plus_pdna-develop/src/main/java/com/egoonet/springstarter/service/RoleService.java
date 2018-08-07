package com.egoonet.springstarter.service;

import com.genesyslab.gskm.services.GetRolesResponse;
import com.genesyslab.gskm.services.GetUsersResponse;
import com.genesyslab.gskm.services.IPermissionManagement;
import com.genesyslab.gskm.services.PermissionManagement;
import lombok.extern.slf4j.Slf4j;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetRolesRequest;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetUsersRequest;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RoleService implements RoleServiceMBean {
    @Override
    public GetRolesResponse getRoles(GetRolesRequest rolesRequest) {
        GetRolesResponse getRolesResponse;
        try {
            getRolesResponse = getIPermissionManagement().getRoles(rolesRequest);
            return getRolesResponse;
        }catch (Exception e){
            log.info("调用获取角色方法失败！！",e.getCause());
            return null;
        }
    }

    //获取服务接口
    private static IPermissionManagement getIPermissionManagement(){
        PermissionManagement permissionManagement = new PermissionManagement();
        return permissionManagement.getWSHttpBindingIPermissionManagement();
    }
}
