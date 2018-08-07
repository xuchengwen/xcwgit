package com.egoonet.springstarter.service;

import com.genesyslab.gskm.services.CreateUsersResponse;
import com.genesyslab.gskm.services.DeleteUsersResponse;
import com.genesyslab.gskm.services.UpdateUsersResponse;
import com.genesyslab.gskm.services.GetUsersResponse;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.CreateUsersRequest;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.DeleteUsersRequest;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetUsersRequest;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.UpdateUsersRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserServiceMBean {

    CreateUsersResponse create(CreateUsersRequest request);

    DeleteUsersResponse delete(DeleteUsersRequest request);

    UpdateUsersResponse update(UpdateUsersRequest request);

    GetUsersResponse getUsers(GetUsersRequest request);

}
