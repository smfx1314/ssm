package com.ssm.entity;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	//多对一
	private Dept dept;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
}
