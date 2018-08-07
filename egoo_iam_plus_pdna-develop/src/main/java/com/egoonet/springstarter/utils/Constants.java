package com.egoonet.springstarter.utils;

public class Constants {
    /**
     * 操作类型
     */
    //新增
    public final static String OP_TYPE_ADD = "1";
    //修改
    public final static String OP_TYPE_EDIT = "2";
    //删除
    public final static String OP_TYPE_DELETE = "3";

    /**
     * 交易返回码errorCode
     */
    //成功
    public final static Integer errorCode_success = 0;
    //系统编号错误
    public final static Integer errorCode_code = 1;
    //数据类型错误
    public final static Integer errorCode_type = 2;
    //无权限访问该数据
    public final static Integer errorCode_refused = 3;


    /**
     * errorMessage
     */
    public final static String errorMessage_success = "成功";
    public final static String errorMessage_code = "系统编号错误";
    public final static String errorMessage_type = "数据类型错误";
    public final static String errorMessage_refused = "无权限访问该数据";

    /**
     * 消息头部信息
     */
    //中行固定boc
    public final static String tenantId = "boc";
    //版本信息
    public final static String vers = "1.0";

    /**
     * 角色类型和状态
     */
    public final static Integer ROLE_TYPE_STATIC = 1;
    public final static Integer ROLE_TYPE_DYNAMIV = 2;

    public final static Integer ROLE_STATUS_ENABLE = 1;
    public final static Integer ROLE_STATUS_DISABLE = 2;


    /**
     * 账号状态
     */
    //启用
    public final static String USER_STATUS_ENABLE = "1";
    //停用
    public final static String USER_STATUS_DISABLE = "0";
}
