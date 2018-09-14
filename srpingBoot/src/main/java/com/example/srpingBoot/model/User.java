package com.example.srpingBoot.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class User {
	@NotNull(message = "名字不能为空")
	private String name;
	
	@Min(value = 0,message = "不能低于0岁")
	private int age;
	
	@NotNull(message = "性别不能为空")
	private String sex;
	
	@NotNull(message = "地址不能为空")
	private String address;

	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", address=" + address + "]";
	}

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
