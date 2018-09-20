package com.example.srpingBoot.order.dao;

import com.example.srpingBoot.order.model.Items;

public interface ItemsMapping {
    int deleteByPrimaryKey(Integer id);

    int insert(Items record);

    int insertSelective(Items record);

    Items selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKey(Items record);
}