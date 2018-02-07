package com.ssm.mapper;

import java.util.List;

import com.ssm.entity.Dept;

public interface DeptMapper {//DeptMapper相当于dao
               
   //查询
	List<Dept> listDept();
	//增加
	void addDept(Dept dept);
 
}