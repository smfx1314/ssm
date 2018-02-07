package com.ssm.mapper;

import java.util.List;



import com.ssm.entity.User;

public interface UserMapper {
	//查询所有用户
	List<User> listUser();
	
	//添加用戶
	void addUser(User user);
	
	//删除用户
	void deleteUser(Integer id);
	
	//根据id查询用户
	User getById(Integer id);
	
	//修改用户
	void updateUser(User user);
	
}
