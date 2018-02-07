package com.ssm.controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.entity.User;
import com.ssm.service.UserService;


@Controller(value="userController")
public class UserController {
	@Autowired
//	@Resource(name="userServiceImpl")
	private UserService userService;
	
	//查询所有用户
	@RequestMapping("/listUser.do")
	public String listUser( Model model){
		List<User> list= userService.list();
		model.addAttribute("list",list);
		return "list";
	}
	//根据用户名查询
	@RequestMapping(value="/userList.do")
	public String userList(User user,Model model){
		List<User> list=userService.findByName(user);
		model.addAttribute("list", list);
		return "list";
	}
	//跳转到增加页面
	@RequestMapping(value="/addPage.do")
	public String addPage(){
		
		return "addUser";
	}
	//增加用户
	@RequestMapping(value="/addUser.do")
	public String addUser(User user){
		userService.save(user);
		return "redirect:/listUser.do";
	}
	//修改用户
	//先查询用户信息到修改页面
	@RequestMapping(value="/updatePage.do")
	public String updatePage(User user, Model model){
		
		int id=user.getId();
		User u=userService.findById(id);
		model.addAttribute("u", u);
		return "updatePage";
	}
	//修改用户
	@RequestMapping(value="/update.do")
	public String update(User user){
		userService.update(user);
		return "redirect:/listUser.do"; 
	}
	
	//删除用户
	@RequestMapping(value="deleteUser.do")
	public String deleteUser(User user){
		int id=user.getId();
		User u=userService.findById(id);
		userService.deleteUser(u);
		return "redirect:/listUser.do";
	}

}
