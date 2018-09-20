package com.example.srpingBoot.order.dao;

import com.example.srpingBoot.order.model.Items1;

public interface ItemsMapping1 {
    int deleteByPrimaryKey(Integer id);

    int insert(Items1 record);

    int insertSelective(Items1 record);

    Items1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Items1 record);

    int updateByPrimaryKey(Items1 record);
}