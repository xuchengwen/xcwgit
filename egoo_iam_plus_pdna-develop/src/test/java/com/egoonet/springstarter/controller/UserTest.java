package com.egoonet.springstarter.controller;

import test.BaseTestCase;

public class UserTest extends BaseTestCase {

    /*@Autowired
    private UserController userController;

    @Test
    public void test(){

        //String jsonStr = "{\"head\":{\"reqId\":\"001\",\"layerId\":\"101\",\"seqId\":\"201\",\"times\":\"2017-06-19 11:11:11\",\"compId\":\"301\"},\"info\":{\"dataType\":\"1\",\"opType\":\"1\",\"data\":[{\"id\":\"303\",\"name\":\"李华\",\"gender\":\"1\",\"employeeId\":\"401\",\"jobId\":\"501\",\"jobName\":\"程序员1\",\"phone\":\"13344445555\",\"email\":\"lh@163.com\",\"parentId\":\"601\",\"parentName\":\"李华华\",\"hireDate\":\"2017-06-10\",\"orgId\":\"701\",\"employeeType\":\"110\",\"status\":\"1\",\"date\":\"2017-07-10 10:10:10\",\"remark\":\"员工李华\",\"editingUserID\":\"10001\",\"fields\":[{\"name\":\"name1\",\"value\":\"value1\"},{\"name\":\"name1\",\"value\":\"value1\"}],\"firstName\":\"风华\",\"lastName\":\"欧阳\",\"isArchived\":\"true\",\"loginName\":\"ouyangfenghua\",\"managerID\":\"10002\",\"tenantId\":\"10003\",\"userPassword\":\"123456\",\"wfmUserId\":\"10004\"}]}}";
        //Field为null
        String jsonStr = "{\n" +
                "  \"head\": {\n" +
                "    \"reqId\": \"001\",\n" +
                "    \"layerId\": \"101\",\n" +
                "    \"seqId\": \"201\",\n" +
                "    \"times\": \"2017-06-19 11:11:11\",\n" +
                "    \"compId\": \"301\"\n" +
                "  },\n" +
                "  \"info\": {\n" +
                "    \"dataType\": \"1\",\n" +
                "    \"opType\": \"1\",\n" +
                "    \"data\": [\n" +
                "      {\n" +
                "        \"id\": \"303\",\n" +
                "        \"name\": \"李华\",\n" +
                "        \"gender\": \"1\",\n" +
                "        \"employeeId\": \"401\",\n" +
                "        \"jobId\": \"501\",\n" +
                "        \"jobName\": \"程序员1\",\n" +
                "        \"phone\": \"13344445555\",\n" +
                "        \"email\": \"lh@163.com\",\n" +
                "        \"parentId\": \"601\",\n" +
                "        \"parentName\": \"李华华\",\n" +
                "        \"hireDate\": \"2017-06-10\",\n" +
                "        \"orgId\": \"701\",\n" +
                "        \"employeeType\": \"110\",\n" +
                "        \"status\": \"1\",\n" +
                "        \"date\": \"2017-07-10 10:10:10\",\n" +
                "        \"remark\": \"员工李华\",\n" +
                "        \"editingUserID\": \"10001\",\n" +
                "        \"firstName\": \"风华\",\n" +
                "        \"lastName\": \"欧阳\",\n" +
                "        \"isArchived\": \"true\",\n" +
                "        \"loginName\": \"ouyangfenghua\",\n" +
                "        \"managerID\": \"10002\",\n" +
                "        \"tenantId\": \"10003\",\n" +
                "        \"userPassword\": \"123456\",\n" +
                "        \"wfmUserId\": \"10004\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}";

        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        Map compose = userController.operateUser(jsonObject);

        System.out.println(compose.get("head"));
    }*/
}
