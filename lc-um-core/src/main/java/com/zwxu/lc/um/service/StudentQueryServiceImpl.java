package com.zwxu.lc.um.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.zwxu.lc.um.bean.QueryStudentResult;
import com.zwxu.lc.um.bean.StudentInfoResponse;
import com.zwxu.lc.um.api.StudentQueryService;
import com.zwxu.lc.um.dao.StudentDao;
import com.zwxu.lc.um.model.Student;


public class StudentQueryServiceImpl implements StudentQueryService{
	@Autowired
	StudentDao studentDao;

	private StudentInfoResponse createStudentInfoResponse(Student s) {
		StudentInfoResponse info = new StudentInfoResponse();
		info.setUsername(s.getUsername());
		info.setNumber(s.getNumber());
		info.setSchool(s.getSchool());
		info.setGroupid(s.getGroupid());
		info.setPassCount(s.getPassCount());
		info.setRejectCount(s.getRejectCount());
		info.setStatus(s.getStatus());
		return info;
	}
	
	public QueryStudentResult queryAll() {
		int count = studentDao.count();
		List<Student> list = studentDao.queryAll();
		QueryStudentResult result = new QueryStudentResult();
		List<StudentInfoResponse> studentList = new ArrayList<StudentInfoResponse>();
		if(null == list || list.isEmpty()) {
			return null;
		}
		
		for(Student u : list) {
			studentList.add(createStudentInfoResponse(u));
		}
		result.setCount(count);
		result.setInfo(studentList);
		return result;
	}



}
