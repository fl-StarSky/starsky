package com.example.srpingBoot.order.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.srpingBoot.order.dao.OrdersMapper;
import com.example.srpingBoot.order.model.Orders;

@Service
public class OrderService {
	
	@Resource
	private OrdersMapper ordersMapper;
	
	public int deleteById(int orderNumber) {
		return ordersMapper.deleteByPrimaryKey(orderNumber);
	}
	
	public int insert(Orders record) {
		return ordersMapper.insert(record);
	}
	
	public int insertSelective(Orders record) {
		return ordersMapper.insertSelective(record);
	}
	
	public Orders selectById(int orderNumer) {
		return ordersMapper.selectByPrimaryKey(orderNumer);
	}
	
	public int updateByIdSelective(Orders record) {
		return ordersMapper.updateByPrimaryKeySelective(record);
	}
	
	public int updateById(Orders record) {
		return ordersMapper.updateByPrimaryKey(record);
	}
}
