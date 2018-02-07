package com.ssm.mapper;
 
import java.util.List;

import com.ssm.entity.User;
 
public interface UserMapper {//UserMapper相当于dao
               
    public void delete(int id);  
         
    public User get(int id);  
     //更新用户信息    
    public int update(User user);   
    
    public int count();
    //查询所有用户
	public List<User> list();
	//添加用户
	public void save(User user);
	//根据id查询
	public User findById(int id);
	//根据用户名查询
	public List<User> findByName(User user);

	public void deleteUser(User u);  
 
}