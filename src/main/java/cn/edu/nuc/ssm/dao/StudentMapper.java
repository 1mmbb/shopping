package cn.edu.nuc.ssm.dao;

import cn.edu.nuc.ssm.entity.Student;

public interface StudentMapper {
	int deleteByPrimaryKey(Integer stuId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer stuId);
    
    Student selectByName(String name);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}