package cn.edu.nuc.ssm.dao;

import cn.edu.nuc.ssm.entity.MbGoods;

public interface MbGoodsMapper {
    int deleteByPrimaryKey(Integer number);

    int insert(MbGoods record);

    int insertSelective(MbGoods record);

    MbGoods selectByPrimaryKey(Integer number);

    int updateByPrimaryKeySelective(MbGoods record);

    int updateByPrimaryKey(MbGoods record);
}