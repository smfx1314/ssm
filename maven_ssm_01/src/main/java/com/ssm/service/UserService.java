package com.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.entity.User;
import com.ssm.mapper.UserMapper;

@Service
@Transactional
public class UserService {
	//注入mapper
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 查詢用戶信息
	 * @return list
	 */
	public List<User> listUser() {
		
		return userMapper.listUser();
	}
	/**
	 * 添加用戶
	 * @param user
	 */
	public void addUser(User user) {
		userMapper.addUser(user);
	}
	
	/**
	 * 删除用户
	 */
	public void deleteUser(Integer id) {
		userMapper.deleteUser(id);
	}
	
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public User getById(Integer id) {
		User user = userMapper.getById(id);
		return user;
	}
	
	/**
	 * 修改用户信息
	 */
	public void updateUser(User user) {
		System.out.println("zhixing l");
		userMapper.updateUser(user);
	}
}
