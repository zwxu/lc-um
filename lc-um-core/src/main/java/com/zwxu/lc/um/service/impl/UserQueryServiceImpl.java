package com.zwxu.lc.um.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.zwxu.lc.um.api.UserQueryService;
import com.zwxu.lc.um.bean.UserInfo;
import com.zwxu.lc.um.dao.UserDao;
import com.zwxu.lc.um.model.User;

public class UserQueryServiceImpl implements UserQueryService{
	@Autowired
	UserDao userDao;

	public List<UserInfo> query(int access) {
		List<User> list = userDao.query(access);
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

}
