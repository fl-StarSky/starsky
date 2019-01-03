package com.hand.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	/** 安全性列表 */
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("/allLogin");
		List<User> list = userService.queryPage();
		modelAndView.addObject("username",list.get(0).getUsername());
		modelAndView.addObject("password",list.get(0).getPassword());
		return modelAndView;
		
	}
}
