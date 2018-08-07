package com.egoonet.springstarter.service;

import com.genesyslab.gskm.services.GetRolesResponse;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetRolesRequest;

public interface RoleServiceMBean {
    GetRolesResponse getRoles(GetRolesRequest rolesRequest);
}
