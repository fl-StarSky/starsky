package com.example.srpingBoot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.srpingBoot.model.Student;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	public String index(){
		return "Hello World!";
	}
	
	@Autowired
	private Student student;
	
	@RequestMapping("/hello2")
	public String index2(){
		return student.getName()+"  "+student.getAge();
	}
	
	@RequestMapping("/getStudent")
	@ResponseBody
	public Student getStudent() {
		Student st = new Student();
		st.setAge(11);
		st.setName("fuli");
		return st;
	}
	
	@RequestMapping("/getStudentByName")
	@ResponseBody
	public Student getStudentByName(String name) {
		System.out.println(name);
		Student st = new Student();
		st.setAge(11);
		st.setName(name);
		return st;
	}
	
	@RequestMapping("/saveStudent")
	@ResponseBody
	public Student saveStudent(@RequestBody Student student) {
		System.out.println(student);
		return student;
	}
	
	@RequestMapping("/")
	public String index(ModelMap map){
		map.addAttribute("name", "kevin");
        map.put("sex",1);//0 男 1 女 其他
        List<String> userList=new ArrayList<String>();
        userList.add("hubbert");
        userList.add("cai");
        userList.add("xu");
        map.addAttribute("userList", userList);
        return "index";
	}
	
}
