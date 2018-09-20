package com.example.srpingBoot.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@RequestMapping("/{id}")
	private void getOrderInfo(@PathVariable("id") int orderNumber) {
		// TODO Auto-generated method stub

	}
}
