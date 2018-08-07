package com.egoonet.springstarter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RolePojo implements Serializable {
    private Integer id;
    private String name;
    private int type;
    private int status;
    //private String remark;

}
