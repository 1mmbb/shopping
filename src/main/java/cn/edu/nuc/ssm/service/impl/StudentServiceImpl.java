package cn.edu.nuc.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nuc.ssm.dao.StudentMapper;
import cn.edu.nuc.ssm.entity.Student;
import cn.edu.nuc.ssm.service.interfaces.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	public Student login(String name, String address) {
		
		Student stu = studentMapper.selectByName(name);
		
		if( stu == null ){
			throw new RuntimeException("用户名或密码不正确");
		} else if( ! address.equals( stu.getAddress() ) ){
			throw new RuntimeException("用户名或密码不正确");
		}
		
		return stu;
	}

}
