package cn.edu.nuc.ssm.dao;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.ssm.BaseTest;
import cn.edu.nuc.ssm.entity.Student;

public class StudentMapperTest extends BaseTest {

	@Autowired
	private StudentMapper studentMapper;
	
	@Test
	public void testSelectByPrimaryKey(){
		
		Student stu = studentMapper.selectByPrimaryKey(1);
		
		System.out.println( stu );
		
		Assert.assertNotNull( stu );
	}
}
