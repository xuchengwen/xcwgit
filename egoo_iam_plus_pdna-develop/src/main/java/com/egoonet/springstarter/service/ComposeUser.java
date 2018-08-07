package com.egoonet.springstarter.service;

import com.egoonet.springstarter.entity.FieldPojo;
import com.egoonet.springstarter.entity.RolePojo;
import com.egoonet.springstarter.entity.UserPojo;
import com.egoonet.springstarter.utils.Constants;
import com.genesyslab.gskm.services.CreateUsersResponse;
import com.genesyslab.gskm.services.UpdateUsersResponse;
import com.genesyslab.gskm.services.DeleteUsersResponse;
import com.genesyslab.gskm.services.GetUsersResponse;
import com.microsoft.schemas._2003._10.serialization.ObjectFactory;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import lombok.extern.slf4j.Slf4j;
import org.datacontract.schemas._2004._07.gskm_services.ArrayOfField;
import org.datacontract.schemas._2004._07.gskm_services.ArrayOfRole;
import org.datacontract.schemas._2004._07.gskm_services.ArrayOfUser;
import org.datacontract.schemas._2004._07.gskm_services.Field;
import org.datacontract.schemas._2004._07.gskm_services.Role;
import org.datacontract.schemas._2004._07.gskm_services.User;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.CreateUsersRequest;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.DeleteUsersRequest;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetUsersRequest;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.UpdateUsersRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class ComposeUser {

    @Autowired
    private UserServiceMBean userServiceMBean;

    //可将user转换成ArrayOfUser
    private org.datacontract.schemas._2004._07.gskm_services_datatransfer.ObjectFactory factoryUsers =
                new org.datacontract.schemas._2004._07.gskm_services_datatransfer.ObjectFactory();

    public Integer saveUser(UserPojo userPojo){

        //查询PDNA中是否存在这个用户数据
        Boolean flag = getUsers(userPojo);
        //如果PDNA中有User，则不进行增加操作返回失败，没有则进行增加操作
        if(!flag){
            //将UserPojo转换成User，再讲User转换成ArrayOfUser
            User user = transUser(userPojo);
            ArrayOfUser arrayOfUser = transArrayOfUser(user);

            //将ArrayOfUser转换成CreateUsersRequest(方法的参数)
            CreateUsersRequest createUsersRequest = new CreateUsersRequest();
            createUsersRequest.setUsers(factoryUsers.createCreateUsersRequestUsers(arrayOfUser));
            CreateUsersResponse createUsersResponse;

            //定义返回类型
            Map<String,Object> receive = new HashMap<>();
            Boolean isSuccess = false;
            String message = "";

/*            //调用增加方法，并转换格式
            createUsersResponse = userServiceMBean.create(createUsersRequest);
            org.datacontract.schemas._2004._07.gskm_services_datatransfer.CreateUsersResponse response;
            response = createUsersResponse.getCreateUsersResult().getValue();

            if(createUsersResponse != null){
                isSuccess = response.isSuccess();
                message = response.getMessage().getValue();
            }else {
                //receive.put("error","PDNA连接异常");
                log.info("连接PDNA失败");
            }*/

        isSuccess = true;
        message = "成功";

            receive.put("isSuccess",isSuccess);
            receive.put("message",message);

            return responseToCode(receive);
        }else {
            log.info("PDNA中含有此User，不能进行增加操作！！");
            //返回errorCode = 1
            return Constants.errorCode_code;
        }
    }
    public Integer updateUser(UserPojo userPojo){

        Boolean flag = getUsers(userPojo);
        //如果PDNA中没有User，则不进行更新操作返回失败，有则进行更新操作
        if(flag) {

            User user = transUser(userPojo);
            ArrayOfUser arrayOfUser = transArrayOfUser(user);

            UpdateUsersRequest updateUsersRequest = new UpdateUsersRequest();
            UpdateUsersResponse updateUsersResponse;

            updateUsersRequest.setUserList(factoryUsers.createUpdateUsersRequestUserList(arrayOfUser));

            Map<String,Object> receive = new HashMap<>();
            Boolean isSuccess = false;
            String message = "";

/*
        updateUsersResponse = userServiceMBean.update(updateUsersRequest);
        org.datacontract.schemas._2004._07.gskm_services_datatransfer.UpdateUsersResponse response;
        response = updateUsersResponse.getUpdateUsersResult().getValue();


        if(updateUsersResponse != null){
            isSuccess = response.isSuccess();
            message = response.getMessage().getValue();
        }else {
            //receive.put("error","PDNA连接异常");
            log.debug("连接PDNA失败");
            log.info("连接PDNA失败");
            //return receive;
        }
*/

            isSuccess = true;
            message = "成功";

            receive.put("isSuccess",isSuccess);
            receive.put("message",message);

            return responseToCode(receive);
        }else {
            log.info("PDNA中没有此User，不能进行更新操作或者调用方法失败。。");
            return Constants.errorCode_code;
        }
    }
    public Integer deleteUser(UserPojo userPojo){

        Boolean flag = getUsers(userPojo);
        //如果PDNA中没有User，则不进行删除操作返回失败，有则进行删除操作
        if(flag) {
            User user = transUser(userPojo);
            ArrayOfUser arrayOfUser = transArrayOfUser(user);

            DeleteUsersRequest deleteUsersRequest = new DeleteUsersRequest();
            DeleteUsersResponse deleteUsersResponse;

            deleteUsersRequest.setUserList(factoryUsers.createDeleteUsersRequestUserList(arrayOfUser));

            Map<String,Object> receive = new HashMap<>();
            Boolean isSuccess = false;
            String message = "";

/*
            //调用方法并转化格式
            deleteUsersResponse = userServiceMBean.delete(deleteUsersRequest);
            org.datacontract.schemas._2004._07.gskm_services_datatransfer.DeleteUsersResponse response;
            response = deleteUsersResponse.getDeleteUsersResult().getValue();

            if(deleteUsersResponse != null){
                isSuccess = response.isSuccess();
                message = response.getMessage().getValue();
            }else {
                //receive.put("error","PDNA连接异常");
                log.info("连接PDNA失败");
                //return receive;
            }
*/
            isSuccess = false;
            message = "数据类型错误";

            receive.put("isSuccess",isSuccess);
            receive.put("message",message);

            return responseToCode(receive);
        }else {
            log.info("PDNA中没有此User，不能进行删除操作或者调用方法失败。。");
            return Constants.errorCode_code;
        }
    }

    //转换数据格式，将UserPojo转换成User
    private static User transUser(UserPojo userPojo){
        //可存放String等类型
        ObjectFactory of = new ObjectFactory();
        //可存放ArrayOfField等类型
        org.datacontract.schemas._2004._07.gskm_services.ObjectFactory factory =
                new org.datacontract.schemas._2004._07.gskm_services.ObjectFactory();
        /**
         * 将数据加入到User中
         */
        User user = new User();
        //获取需要的数据，并将数据加入到User中
        Integer editingUserID = userPojo.getEditingUserID();
        user.setEditingUserID(editingUserID);
        String firstName = userPojo.getFirstName();
        user.setFirstName(of.createString(firstName));
        Integer id = userPojo.getId();
        user.setID(id);
        Boolean isArchived = userPojo.getIsArchived();
        user.setIsArchived(isArchived);
        String lastName = userPojo.getLastName();
        user.setLastName(of.createString(lastName));
        String loginName = userPojo.getLoginName();
        user.setLoginName(of.createString(loginName));
        Integer managerID = userPojo.getManagerID();
        user.setManagerID(managerID);
        Integer tenantId = userPojo.getTenantId();
        user.setTenantId(tenantId);
        String userPassword = userPojo.getUserPassword();
        user.setUserPassword(of.createString(userPassword));
        String wfmUserId = userPojo.getWfmUserId();
        user.setWfmUserId(of.createString(wfmUserId));

        List<FieldPojo> fieldPojos = userPojo.getFields();
        //对于有多个Field，但是有部分Field没有数据的情况，还没处理
        //fieldPojos !=null 要放在fieldPojos.size() != 0的前面，否则fieldPojos=null时会报错
        if(fieldPojos !=null && fieldPojos.size() != 0){
            List<Field> fieldList = new ArrayList<>();
            for (FieldPojo fieldPojo : fieldPojos) {
                Field field = new Field();

                if(fieldPojo.getName() != null && fieldPojo.getValue() != null){
                    field.setName(of.createString(fieldPojo.getName()));
                    field.setValue(of.createString(fieldPojo.getValue()));
                    fieldList.add(field);
                }else {
                    log.info("Field里面没有数据");
                }
            }

            if(fieldList.size() > 0){
                ArrayOfField arrayOfField = new ArrayOfField();
                arrayOfField.setField(fieldList);
                user.setFields(factory.createArrayOfField(arrayOfField));
            }

        }

        //将Roles加入到User中
        List<RolePojo> rolePojos = userPojo.getRoles();
        if(rolePojos !=null && rolePojos.size() != 0){
            List<Role> roles = new ArrayList<>();
            for(RolePojo rolePojo : rolePojos){
                Role role = new Role();
                if(rolePojo.getId()!=null && rolePojo.getName()!=null){
                    role.setID(rolePojo.getId());
                    role.setName(of.createString(rolePojo.getName()));

                    roles.add(role);
                }else {
                    log.info("Role里面缺少数据");
                }
            }
            if(roles.size() > 0){
                ArrayOfRole arrayOfRole = new ArrayOfRole();
                arrayOfRole.setRole(roles);
                user.setRoles(factory.createArrayOfRole(arrayOfRole));
            }
        }

        return user;
    }

    //将User封装到ArrayOfUser中(可以与上面方法合并，分开写更好理解)
    private static ArrayOfUser transArrayOfUser(User user){
        //将User封装到arrayOfUser中
        ArrayOfUser arrayOfUser = new ArrayOfUser();
        List<User> list = new ArrayList<>();
        list.add(user);
        arrayOfUser.setUser(list);
        return  arrayOfUser;
    }

    //将isSuccess，message转换成errorCode和errorMessage
    private static Integer responseToCode(Map<String,Object> resp){

        Boolean isSuccess = (Boolean) resp.get("isSuccess");
        String message = (String) resp.get("message");

        if(isSuccess){
            return Constants.errorCode_success;
        }else if(Constants.errorMessage_code.equals(message)){
            return Constants.errorCode_code;
        }else if(Constants.errorMessage_type.equals(message)){
            return Constants.errorCode_type;
        }else if(Constants.errorMessage_refused.equals(message)){
            return Constants.errorCode_refused;
        }else{
            log.debug("没有得到交易返回码和相关信息，其他错误");
            //暂时返回 1
            return Constants.errorCode_code;
        }
    }

    //获取firstName和lastName
    private static Map<String, String> getName(String name) {
        Map<String, String> map = new HashMap<>();
        String firstName = "";
        String lastName = "";
        String[] bai = {"欧阳", "太史", "上官", "端木", "司马", "东方", "独孤", "南宫", "万俟", "闻人", "夏侯", "诸葛", "尉迟", "公羊", "赫连", "澹台", "皇甫", "宗政", "濮阳", "公冶", "太叔", "申屠", "公孙", "慕容", "仲孙", "钟离", "长孙", "宇文", "司徒", "鲜于", "司空", "闾丘", "子车", "亓官", "司寇", "巫马", "公西", "颛孙", "壤驷", "公良", "漆雕", "乐正", "宰父", "谷梁", "拓跋", "夹谷", "轩辕", "令狐", "段干", "百里", "呼延", "东郭", "南门", "羊舌", "微生", "公户", "公玉", "公仪", "梁丘", "公仲", "公上", "公门", "公山", "公坚", "左丘", "公伯", "西门", "公祖", "第五", "公乘", "贯丘", "公皙", "南荣", "东里", "东宫", "仲长", "子书", "子桑", "即墨", "达奚", "褚师", "吴铭"};
        String name2 = name.substring(0, 2);
        boolean flag = false;
        for (int i = 0; i < bai.length; i++) {
            if (name2.equals(bai[i])) {
                flag = true;
                lastName = name.substring(0, 2);
                firstName = name.substring(2, name.length());
                break;
            }
        }
        if (!flag) {
            lastName = name.substring(0, 1);
            firstName = name.substring(1, name.length());
        }
        map.put("lastName", lastName);
        map.put("firstName", firstName);
        return map;
    }

    //查询PDNA中的User
    private Boolean getUsers(UserPojo userPojo){
        Integer tenantId = userPojo.getTenantId();
        String loginName = userPojo.getLoginName();
        GetUsersRequest request = new GetUsersRequest();
        //可存放ArrayOfString等类型
        com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory toArrayOfString
                = new com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory();
        ArrayOfstring arrayOfstring = new ArrayOfstring();
        List<String> list = new ArrayList<>();
        list.add(loginName);
        arrayOfstring.setString(list);

        request.setLoginIDs(toArrayOfString.createArrayOfstring(arrayOfstring));
        request.setTenantID(tenantId);

        Boolean flag = false;
        GetUsersResponse users = userServiceMBean.getUsers(request);

        if(users != null)
            flag = true;

        return flag;
    }

}
