package com.zwxu.lc.um.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.zwxu.lc.um.api.UserQueryService;
import com.zwxu.lc.um.bean.QueryResult;
import com.zwxu.lc.um.bean.UserInfo;
import com.zwxu.lc.um.dao.UserDao;
import com.zwxu.lc.um.model.User;


public class UserQueryServiceImpl implements UserQueryService{
	@Autowired
	UserDao userDao;

	public List<UserInfo> query(int tid) {
		List<User> list = userDao.query(tid);
		List<UserInfo> result = new ArrayList<UserInfo>();
		if(null == list || list.isEmpty()) {
			return result;
		}
		
		for(User u : list) {
			result.add(createUserInfo(u));
		}
		return result;
	}

	private UserInfo createUserInfo(User u) {
		UserInfo info = new UserInfo();
		info.setUsername(u.getUsername());
		info.setPassword(u.getPassword());
		return info;
	}
	
	public QueryResult queryPage(int start, int pageSize) {
		int count = userDao.count();
		List<User> list = userDao.query(start,pageSize);
		QueryResult result = new QueryResult();
		List<UserInfo> userResult = new ArrayList<UserInfo>();
		if(null == list || list.isEmpty()) {
			return null;
		}
		
		for(User u : list) {
			userResult.add(createUserInfo(u));
		}
		result.setCount(count);
		result.setInfo(userResult);
		return result;
	}

}
