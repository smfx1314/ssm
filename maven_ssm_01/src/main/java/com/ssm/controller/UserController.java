package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssm.entity.Dept;
import com.ssm.entity.User;
import com.ssm.service.DeptService;
import com.ssm.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	//注入用户service
	@Autowired
	private UserService userService;
	
	//注入部门service
	@Autowired
	private DeptService deptService;
	/**
	 * 查询所有用户
	 */
	@RequestMapping(value="/userList",method=RequestMethod.GET)
	public String userList(ModelMap map){
		List<User> list = userService.listUser();
		System.out.println(list);
		map.addAttribute("list", list);
		return "userList";
	}
	/**
	 * @ModelAttribute
	 */
	@ModelAttribute("deptList")
	public List<Dept> deptList(){
		
		return deptService.deptList();
	}
	/**
	 * 跳转到添加页面
	 */
	@RequestMapping(value=("/addUserPage"),method=RequestMethod.GET)
	public String addUserPage(){
		
		return "addUserPage";
	}
	/**
	 * 添加用戶
	 * @param user 
	 */
	@RequestMapping(value=("/addUser"),method=RequestMethod.POST)
	public String addUser(User user){
		userService.addUser(user);
		return "redirect:/user/userList";
	}
	/**
	 * 删除用户
	 * @param id 
	 */
	@RequestMapping(value=("/deleteUser"),method=RequestMethod.GET)
	public String deleteUser(Integer id) {
		userService.deleteUser(id);
		return "redirect:/user/userList";
	}
	
	/**
	 * 跳转到修改用户界面
	 * @param id 
	 */
	@RequestMapping(value=("/updatePage"),method=RequestMethod.GET)
	public String updatePage(Integer id,ModelMap map){
		User user = userService.getById(id);
		map.addAttribute("user", user);
		return "updatePage";
	}
	
	/**
	 *修改用户 
	 */
	@RequestMapping(value=("/updateUser"),method=RequestMethod.POST)
	public String updateUser(User user){
		userService.updateUser(user);
		return "redirect:/user/userList";
	}
}

