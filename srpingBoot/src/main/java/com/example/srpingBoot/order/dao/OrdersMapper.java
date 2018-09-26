package com.example.srpingBoot.order.dao;


import org.apache.ibatis.annotations.Mapper;

import com.example.srpingBoot.order.model.Orders;

@Mapper
public interface OrdersMapper {
    int deleteByPrimaryKey(Integer ordernumber);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer ordernumber);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKeyWithBLOBs(Orders record);

    int updateByPrimaryKey(Orders record);
}