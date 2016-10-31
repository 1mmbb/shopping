package cn.edu.nuc.ssm.dao;

import cn.edu.nuc.ssm.entity.MbUser;

public interface MbUserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(MbUser record);

    int insertSelective(MbUser record);

    MbUser selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(MbUser record);

    int updateByPrimaryKey(MbUser record);
}