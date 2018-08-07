package com.egoonet.springstarter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountPojo implements Serializable {
    private String id;
    private String loginName;
    private int userId;
    private int agentId;
    private int status;
    private List<RolePojo> roles;
    private List<GroupPojo> groups;
    private String remark;

}
