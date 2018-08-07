package com.egoonet.springstarter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResourcePojo implements Serializable {
    private int id;
    private int parentId;
    private String name;
    private String enName;
    private String iconName;
    private String type;
    private String status;
    private String url;
    private int sort;
    private String remark;

}
