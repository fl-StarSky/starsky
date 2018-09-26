package com.example.srpingBoot.order.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.srpingBoot.order.model.Orders;
import com.example.srpingBoot.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Resource
	private OrderService orderService;
	
	@RequestMapping("/{id}")
	private Orders getOrderInfo(@PathVariable("id")
			int orderNumber) {
		// TODO Auto-generated method stub
		return orderService.selectById(orderNumber);
	}
}
