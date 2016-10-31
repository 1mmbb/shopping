package cn.edu.nuc.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.nuc.ssm.entity.Student;
import cn.edu.nuc.ssm.service.interfaces.StudentService;


@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login2(){
		
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(Student student, HttpSession session){
		
		try {
			Student stu = studentService.login(student.getStuname(), student.getAddress());
			session.setAttribute("stu", stu);
			
			return "redirect:/";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:login";
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index(){
		
		return "index2";
	}

}
