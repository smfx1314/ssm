package com.ssm.service;

import java.util.List;

import com.ssm.entity.User;

public interface UserService {

	List<User> list();

	void save(User user);
	//根据id查询
	User findById(int id);

	void update(User user);

	List<User> findByName(User user);

	void deleteUser(User u);

}
