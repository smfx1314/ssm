package com.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ssm.entity.Dept;
import com.ssm.mapper.DeptMapper;

@Service
@Transactional
public class DeptService {
	//注入mapper
	@Autowired
	private DeptMapper deptMapper;
	
	/**
	 * 查詢部门信息
	 * @return list
	 */
	public List<Dept> deptList() {
		
		return deptMapper.deptList();
	}
	/**
	 * 添加部门
	 * @param user
	 */
	public void addDept(Dept dept) {
		deptMapper.addDept(dept);
	}
	
	/**
	 * 删除部门
	 */
	public void deleteDept(Integer did) {
		deptMapper.deleteDept(did);
	}
	
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public Dept getById(Integer did) {
		Dept dept = deptMapper.getById(did);
		return dept;
	}
	
	/**
	 * 修改部门信息
	 */
	public void updateDept(Dept dept) {
		deptMapper.updateDept(dept);
	}
}
