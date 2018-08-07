package com.egoonet.springstarter.controller;

import lombok.extern.log4j.Log4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT
)
@Rollback
@Transactional
@Log4j
public class URLTest {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;
    private MockHttpSession session;

    @Before
    public void setupMockMvc(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
        this.session = new MockHttpSession();
    }

    //测试User接口的第一种方法。。
    @Test
    public void testUser() throws Exception {
        log.info("--------- testUser    start ----------");
        String cont = "{\n" +
                "  \"head\": {\n" +
                "    \"reqId\" : \"001\",\n" +
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
                "        \"fields\": [\n" +
                "          {\n" +
                "            \"name\": \"name1\",\n" +
                "            \"value\": \"value1\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"name2\",\n" +
                "            \"value\": \"value2\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"roles\": [\n" +
                "        ],\n" +
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
        String responseString = mockMvc.perform(
                post("/UserController/operateUser")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .content(cont)
        ).andExpect(status().isOk())
                .andDo(print())
                .andReturn().getResponse().getContentAsString();

        log.info(responseString);

        log.info("--------- testUser    end ----------");
    }

    //测试Binding接口(与User接口合并)
    @Test
    public void testBinding() throws Exception {
        log.info("--------- testBinding    start ----------");
        String cont = "{\n" +
                "  \"head\": {\n" +
                "    \"reqId\" : \"001\",\n" +
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
                "        \"fields\": [\n" +
                "          {\n" +
                "            \"name\": \"name1\",\n" +
                "            \"value\": \"value1\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"name2\",\n" +
                "            \"value\": \"value2\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"roles\": [\n" +
                "          {\n" +
                "            \"id\": \"555\",\n" +
                "            \"name\": \"role1\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": \"5552\",\n" +
                "            \"name\": \"role2\"\n" +
                "          }\n" +
                "        ],\n" +
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
        String responseString = mockMvc.perform(
                post("/UserController/operateUser")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .content(cont)
        ).andExpect(status().isOk())
                .andDo(print())
                .andReturn().getResponse().getContentAsString();

        log.info(responseString);

        log.info("--------- testBinding    end ----------");
    }

    //测试Roles接口
    @Test
    public void testRoles() throws Exception {
        log.info("--------- testRoles    start ----------");
        String cont = "{\n" +
                "  \"head\": {\n" +
                "    \"reqId\" : \"001\",\n" +
                "    \"layerId\": \"101\",\n" +
                "    \"seqId\": \"201\",\n" +
                "    \"times\": \"2017-06-19 11:11:11\",\n" +
                "    \"compId\": \"301\"\n" +
                "  },\n" +
                "  \"data\": {\n" +
                "  \t\"tenantId\":\"21\"\n" +
                "  }\n" +
                "}";
        String responseString = mockMvc.perform(
                post("/RolesController2/getRoles")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .content(cont)
        ).andExpect(status().isOk())
                .andDo(print())
                .andReturn().getResponse().getContentAsString();

        log.info(responseString);

        log.info("--------- testRoles    end ----------");
    }


/*
    //测试User接口的第二种方法（数据是封装到JavaBean中的）
    @Test
    public void testUser2() throws Exception {
        log.info("--------- testDatapush2    start ----------");

        RequestVM requestVM = new RequestVM();//定义的JavaBean
        RequestHead head = new RequestHead();//定义的JavaBean
        Body body = new Body();//定义的JavaBean

        body.setDataType("3");
        body.setOpType("1");

        List<Object> data = new ArrayList<>();

        DepartmentPojo departmentPojo = new DepartmentPojo();//定义的JavaBean
        departmentPojo.setId("8888");
        departmentPojo.setName("8888");
        departmentPojo.setCode("8888");
        departmentPojo.setRemark("8888");

        data.add(departmentPojo);
        body.setData(data);

        requestVM.setHead(head);
        requestVM.setBody(body);

        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        String jsonContent = (ow.writeValueAsString(requestVM));

        String responseString = mockMvc.perform(
                post("/smartbi/api/datapush")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .content(jsonContent)
        ).andExpect(status().isOk())
                .andDo(print())
                .andReturn().getResponse().getContentAsString();

        log.info(responseString);
        log.info("--------- testDatapush2    end ----------");
    }
*/

}
