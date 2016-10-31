package cn.edu.nuc.ssm.service;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.ssm.BaseTest;
import cn.edu.nuc.ssm.entity.Student;
import cn.edu.nuc.ssm.service.interfaces.StudentService;

public class StudentServiceTest extends BaseTest {

	@Autowired
	private StudentService studentService;
	
	@Test
	public void testLogin() {

		Student stu = studentService.login("a", "a");
		
		Assert.assertNotNull(stu);
	}

}
