package com.egoonet.springstarter.service;

import com.genesyslab.gskm.services.CreateUsersResponse;
import com.genesyslab.gskm.services.DeleteUsersResponse;
import com.genesyslab.gskm.services.GetUsersResponse;
import com.genesyslab.gskm.services.IPermissionManagement;
import com.genesyslab.gskm.services.PermissionManagement;
import com.genesyslab.gskm.services.UpdateUsersResponse;
import lombok.extern.slf4j.Slf4j;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.CreateUsersRequest;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.DeleteUsersRequest;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetUsersRequest;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.UpdateUsersRequest;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService implements UserServiceMBean {

    @Override
    public CreateUsersResponse create(CreateUsersRequest request) {
        CreateUsersResponse response;
        try {
            response = getIPermissionManagement().createUsers(request);
            return response;
        }catch (Exception e) {
            log.info("调用增加用户方法失败！！",e.getCause());
            return null;
        }
    }

    @Override
    public UpdateUsersResponse update(UpdateUsersRequest request) {
        UpdateUsersResponse response;
        try {
            response = getIPermissionManagement().updateUsers(request);
            return response;
        }catch (Exception e){
            log.info("调用更新用户方法失败！！",e.getCause());
            return null;
        }
    }

    @Override
    public DeleteUsersResponse delete(DeleteUsersRequest request) {
        DeleteUsersResponse response;
        try {
            response = getIPermissionManagement().deleteUsers(request);
            return response;
        }catch (Exception e){
            log.info("调用删除用户方法失败！！",e.getCause());
            return null;
        }
    }

    @Override
    public GetUsersResponse getUsers(GetUsersRequest request){
        GetUsersResponse response;
        try {
            response = getIPermissionManagement().getUsers(request);
            return response;
        }catch (Exception e){
            log.info("调用获取用户方法失败！！",e.getCause());
            return null;
        }
    }

    //获取服务接口
    private static IPermissionManagement getIPermissionManagement(){
        PermissionManagement permissionManagement = new PermissionManagement();
        return permissionManagement.getWSHttpBindingIPermissionManagement();
    }
}
