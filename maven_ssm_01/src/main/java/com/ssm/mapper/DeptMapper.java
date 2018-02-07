package com.ssm.mapper;

import java.util.List;

import com.ssm.entity.Dept;

public interface DeptMapper {
	//查询所有部门
	List<Dept> deptList();
	
	//添加部门
	void addDept(Dept dept);
	
	//删除部门
	void deleteDept(Integer did);
	
	//根据id查询部门，为了修改
	Dept getById(Integer did);
	
	//修改部门
	void updateDept(Dept dept);
	
}
