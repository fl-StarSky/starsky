package com.example.srpingBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.srpingBoot.model.Student;

@RestController
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
	
}
