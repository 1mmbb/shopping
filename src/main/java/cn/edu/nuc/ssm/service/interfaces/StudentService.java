package cn.edu.nuc.ssm.service.interfaces;

import cn.edu.nuc.ssm.entity.Student;

public interface StudentService {
	
	/**
	 * 用户登录
	 * @param account 帐号
	 * @param password 密码
	 * @return Account
	 */
	Student login(String name, String address);

}
