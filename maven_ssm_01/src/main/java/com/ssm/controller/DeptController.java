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
@RequestMapping(value="/dept")
public class DeptController {
	//依赖注入deptService
	@Autowired
	private DeptService deptService;
	/**
	 * 查询部门信息列表
	 */
	@RequestMapping(value="/deptList",method=RequestMethod.GET)
	public String deptList(ModelMap map){
		List<Dept> deptList = deptService.deptList();
		map.addAttribute("deptList", deptList);
		return "deptList";
	}
	
	/**
	 * 增加部门页面
	 */
	@RequestMapping(value="/addDeptPage",method=RequestMethod.GET)
	public String addDeptPage(){
		
		return "addDeptPage";
	} 
	/**
	 * 添加部门
	 */
	@RequestMapping(value="/addDept",method=RequestMethod.POST)
	public String addDept(Dept dept){
		deptService.addDept(dept);
		return "redirect:/dept/deptList";
	}
	/**
	 * 跳转到修改部门页面
	 */
	@RequestMapping(value="/updateDeptPage",method=RequestMethod.GET)
	public String updateDeptPage(Integer did,ModelMap map){
		Dept dept = deptService.getById(did);
		System.out.println(dept);
		map.addAttribute("dept", dept);
		return "updateDeptPage";
	}
	/**
	 * 修改部门信息
	 */
	@RequestMapping(value="/updateDept",method=RequestMethod.POST)
	public String updateDept(Dept dept){
		deptService.updateDept(dept);
		return "redirect:/dept/deptList";
	}
	/**
	 * 删除部门信息
	 */
	@RequestMapping(value="/deleteDept",method=RequestMethod.GET)
	public String deleteDept(Integer did){
		deptService.deleteDept(did);
		return "redirect:/dept/deptList";
	}
}
