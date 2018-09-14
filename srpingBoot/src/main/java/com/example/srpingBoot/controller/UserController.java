package com.example.srpingBoot.controller;

import javax.validation.Valid;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.srpingBoot.HttpAspect;
import com.example.srpingBoot.model.User;

@RestController
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@PostMapping("/register")
	public User register(@Valid User user,BindingResult bindingResult){
		logger.trace("这是trace日志...");
		logger.debug("这是debug日志...");
		logger.info("这是info日志...");
		logger.warn("这是warn日志...");
		logger.error("这是error日志...");
		if (bindingResult.hasErrors()) {
			System.out.println(bindingResult.getFieldError().getDefaultMessage());
			return null;
		}
		return user;
	}
}
