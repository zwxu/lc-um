package com.zwxu.lc.um.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zwxu.lc.um.mapper.UserMapper;
import com.zwxu.lc.um.model.User;
import com.zwxu.lc.um.model.UserExample;

public class UserDao {

	
	@Autowired
    private UserMapper userMapper;
	@Autowired
    private JdbcTemplate jdbcTemplate;


	public User insert(User card) {
		userMapper.insert(card);
		
		return card;
	}
	
	
	public List<User> query(int tid)
	{
		UserExample example = new UserExample();
		example.createCriteria().andIdEqualTo(tid);
		List<User> list = userMapper.selectByExample(example);
		return list;
	}
	
	public List<User> query()
	{
		String sql="select * from t_user";
		List<User> list=jdbcTemplate.query(sql, new BeanPropertyRowMapper(User.class));
		return list;
	}

	
}
