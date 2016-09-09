package com.zwxu.lc.um.dao;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import com.zwxu.lc.um.mapper.UserMapper;
import com.zwxu.lc.um.model.User;

public class UserDao {

	
	@Autowired
    private UserMapper userMapper;


	public User insert(User card) {
		userMapper.insert(card);
		
		return card;
	}

	
}
