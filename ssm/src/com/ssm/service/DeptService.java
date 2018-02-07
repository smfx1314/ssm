package com.ssm.service;

import java.util.List;

import com.ssm.entity.Dept;

public interface DeptService {

	/**
	 * 查询所有部门信息
	 */
	List<Dept> listDept();
	/**
	 * 增加部门
	 */
	void addDept(Dept dept);
}
