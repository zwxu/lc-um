package com.zwxu.lc.um.bean;

import java.io.Serializable;
import java.util.Date;


public class UserInfo implements Serializable {

	private static final long serialVersionUID = -2134815484432644948L;

	private int id;
	private String username;
	private String password;

	private Date createTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	

}
