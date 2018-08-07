package com.egoonet.springstarter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPojo implements Serializable {

    private Integer editingUserID;
    private List<FieldPojo> fields;
    private String firstName;
    private Integer id;
    private Boolean isArchived;
    private String lastName;
    private String loginName;
    private Integer managerID;
    private List<RolePojo> roles;
    private Integer tenantId;
    private String userPassword;
    private String wfmUserId;

}
