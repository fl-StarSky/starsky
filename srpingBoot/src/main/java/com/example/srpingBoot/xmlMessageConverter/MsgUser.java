package com.example.srpingBoot.xmlMessageConverter;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;



@JacksonXmlRootElement(localName="MsgUser")
public class MsgUser {
	
	@JacksonXmlProperty(localName="name")
	private String name;
	
	@JacksonXmlProperty(localName="age")
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
