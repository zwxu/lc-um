package com.zwxu.lc.um.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.zwxu.lc.um.api.TeacherQueryService;
import com.zwxu.lc.um.bean.QueryTeacherResult;
import com.zwxu.lc.um.bean.TeacherInfoResponse;
import com.zwxu.lc.um.dao.TeacherDao;
import com.zwxu.lc.um.model.Teacher;



public class TeacherQueryServiceImpl implements TeacherQueryService{
	@Autowired
	TeacherDao teacherDao;

	private TeacherInfoResponse createTeacherInfoResponse(Teacher s) {
		TeacherInfoResponse info = new TeacherInfoResponse();
		BeanUtils.copyProperties(s, info);
		return info;
	}
	
	public QueryTeacherResult queryAll() {
		int count = teacherDao.count();
		List<Teacher> list = teacherDao.queryAll();
		QueryTeacherResult result = new QueryTeacherResult();
		List<TeacherInfoResponse> teacherList = new ArrayList<TeacherInfoResponse>();
		if(null == list || list.isEmpty()) {
			return null;
		}
		
		for(Teacher u : list) {
			teacherList.add(createTeacherInfoResponse(u));
		}
		result.setCount(count);
		result.setInfo(teacherList);
		return result;
	}



}
