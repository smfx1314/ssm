package com.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.entity.User;
import com.ssm.mapper.UserMapper;
import com.ssm.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
//	@Resource(name="userMapper")
	private UserMapper userMapper;
	//查询所有用户
	@Override
	public List<User> list() {
		
		return userMapper.list();
	}
	//根据用户名查询
	@Override
	public List<User> findByName(User user) {
		if(user !=null && user.getName() !=null && !user.getName().equals("")){
			user.setName("%"+user.getName()+"%");
		}
		return userMapper.findByName(user);
	}
	//添加用户
	@Override
	public void save(User user) {
		userMapper.save(user);
	}
	//根据id查询
	@Override
	public User findById(int id) {
		
		return userMapper.findById(id);
	}
	//修改用户
	@Override
	public void update(User user) {
		
		userMapper.update(user);
	}
	//删除用户
	@Override
	public void deleteUser(User u) {
		userMapper.deleteUser(u);
	}
	
	

}
