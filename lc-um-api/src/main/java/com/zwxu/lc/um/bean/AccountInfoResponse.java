package com.zwxu.lc.um.bean;

import java.io.Serializable;
import java.util.Date;


public class AccountInfoResponse extends BaseResult implements Serializable {

	private static final long serialVersionUID = -2134815484432644948L;

	private int id;
	private String loginname;
	private String password;

	private Date createTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
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
