package com.ssm.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssm.entity.Dept;
import com.ssm.service.DeptService;


@Controller
@RequestMapping(value=("/dept"))
public class DeptController {
	
	//注入DeptService
	@Autowired
	private DeptService deptService;
	/**
	 * 查询所有部门列表
	 */
	@RequestMapping(value=("/deptList"),method=RequestMethod.GET)
	public String listDept(ModelMap map){
		List<Dept> listDept = deptService.listDept();
		map.addAttribute("listDept", listDept);
		return "deptList";
	}
	/**
	 * 跳转到添加部门页面
	 */
	@RequestMapping(value=("/addDeptPage"),method=RequestMethod.GET)
	public String addDeptPage(){
		
		return "addDeptPage";
	}
	
	/**
	 * 添加部门
	 */
	@RequestMapping(value=("/addDept"),method=RequestMethod.POST)
	public String addDept(Dept dept){
		deptService.addDept(dept);
		return "redirect:/dept/deptList";
	}
}
