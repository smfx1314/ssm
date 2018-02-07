package com.ssm.entity;

import java.io.Serializable;
import java.util.List;

public class Dept implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer did;
	private String dname;
	private List<User> user;
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + ", user=" + user + "]";
	}
	
	

}
