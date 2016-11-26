package com.zwxu.lc.um.bean;

import java.util.List;

public class QueryStudentResult {
	private int count;
	private List<StudentInfoResponse> info;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<StudentInfoResponse> getInfo() {
		return info;
	}
	public void setInfo(List<StudentInfoResponse> info) {
		this.info = info;
	}
	
	
	

}
