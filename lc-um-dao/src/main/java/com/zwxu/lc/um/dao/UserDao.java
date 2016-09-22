package com.zwxu.lc.um.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.zwxu.lc.um.mapper.UserMapper;
import com.zwxu.lc.um.model.User;
import com.zwxu.lc.um.model.UserExample;

public class UserDao {

	
	@Autowired
    private UserMapper userMapper;


	public User insert(User card) {
		userMapper.insert(card);
		
		return card;
	}
	
	public List<User> query(int access)
	{
		UserExample example = new UserExample();
		example.createCriteria().andAccessEqualTo(access);
		List<User> list = userMapper.selectByExample(example);
		return list;
	}

	
}
