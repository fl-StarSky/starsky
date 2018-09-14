package com.example.srpingBoot.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.srpingBoot.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

//指定使用的单元测试执行类
@RunWith(SpringRunner.class)
@SpringBootTest
//测试环境使用，表示测试环境使用的ApplicationContext将是WebApplicationContext类型的
@WebAppConfiguration
public class HelloWorldControllerTest {
	private MockMvc mvc;

	@Before
	public void setUp() throws Exception {
		//初始化
		mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
	}
	
	@Test
	public void test1() throws Exception{
		System.out.println("测试get请求无参数......");
 
		//mock进行模拟
		mvc.perform(MockMvcRequestBuilders.get("/getStudent")//调用接口
				.accept(MediaType.APPLICATION_JSON))	//接收类型
				.andExpect(MockMvcResultMatchers.status().isOk())	//判断接收到的状态是否为200
				.andDo(MockMvcResultHandlers.print())	//打印内容
				.andReturn();
		System.out.println("测试get请求无参数结束......");
	}
 
	@Test
	public void test2() throws Exception{
		System.out.println("测试get请求带参数......");
 
		String myName="debug-steadyjack-大圣";
		//mock进行模拟
		mvc.perform(MockMvcRequestBuilders.get("/getStudentByName")//调用接口
				.contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)	//接收类型
				.param("name",myName))	//传入需要添加的参数
				.andExpect(MockMvcResultMatchers.status().isOk())	//判断接收到的状态是否为200
				.andDo(MockMvcResultHandlers.print())	//打印内容
				.andReturn();
		System.out.println("测试get请求带参数结束......");
	}
 
 
	@Test
	public void test3() throws Exception{
		System.out.println("测试post请求带参数......");
		Student student = new Student();
		student.setAge(33);
		student.setName("staring");
		System.out.println("post 参数： {"+student+"}");
 
		ObjectMapper objectMapper=new ObjectMapper();
		String requestJson=objectMapper.writeValueAsString(student);
 
		//mock进行模拟
		mvc.perform(MockMvcRequestBuilders.post("/saveStudent")
				.accept(MediaType.APPLICATION_JSON_UTF8_VALUE)
				.contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
				.content(requestJson))	//传入添加的参数
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andDo(MockMvcResultHandlers.print())
				.andReturn();
		System.out.println("测试post请求带参数结束......");
	}


//	@Test
//	public void hello() throws Exception {
//		String url = "/hello2";//访问url
//	
//		String expectedResult = "Hello World!";//预期返回结果
//	
//		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(url).accept(MediaType.APPLICATION_JSON)).andReturn();
//	
//		//访问返回状态
//		int status = mvcResult.getResponse().getStatus();
//	
//		//接口返回结果
//		String content = mvcResult.getResponse().getContentAsString();
//	
//		//打印结果和状态
//		System.out.println(status);
//		System.out.println(content);
//	
//		//断言预期结果和状态
//		Assert.assertTrue("正确", status == 200);
//		Assert.assertFalse("错误", status != 200);
//		Assert.assertTrue("数据一致", expectedResult.equals(content));
//		Assert.assertFalse("数据不一致", !expectedResult.equals(content));
//
//	}
}
