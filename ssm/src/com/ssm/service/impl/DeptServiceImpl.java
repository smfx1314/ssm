package com.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.entity.Dept;
import com.ssm.entity.User;
import com.ssm.mapper.DeptMapper;
import com.ssm.mapper.UserMapper;
import com.ssm.service.DeptService;
import com.ssm.service.UserService;

@Service
@Transactional
public class DeptServiceImpl implements DeptService{
	//主任DeptMapper
	@Autowired
	private DeptMapper deptMapper;
	@Override
	public List<Dept> listDept() {
		List<Dept> list = deptMapper.listDept();
		return list;
	}

	@Override
	public void addDept(Dept dept) {
		deptMapper.addDept(dept);
	}
}
