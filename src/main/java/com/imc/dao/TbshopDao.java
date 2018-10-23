package com.imc.dao;

import com.imc.model.TbshopPo;

public interface TbshopDao {
    int deleteByPrimaryKey(Integer shopId);

    int insert(TbshopPo record);

    int insertSelective(TbshopPo record);

    TbshopPo selectByPrimaryKey(Integer shopId);

    int updateByPrimaryKeySelective(TbshopPo record);

    int updateByPrimaryKey(TbshopPo record);
}