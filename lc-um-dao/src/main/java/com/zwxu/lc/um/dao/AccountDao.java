package com.zwxu.lc.um.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zwxu.lc.um.mapper.AccountMapper;
import com.zwxu.lc.um.model.Account;
import com.zwxu.lc.um.model.AccountExample;


public class AccountDao {
	
	@Autowired
    private AccountMapper accountMapper;
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	
	public Account insert(Account card) {
		accountMapper.insert(card);
		
		return card;
	}
	
	
	public List<Account> query(int tid)
	{
		AccountExample example = new AccountExample();
		example.createCriteria().andIdEqualTo(tid);
		List<Account> list = accountMapper.selectByExample(example);
		return list;
	}
	
	public List<Account> query(int start ,int pageSize)
	{
		String sql="select * from t_account ";
		String final_sql = sql + String.format(" limit %d, %d ", start-1, pageSize);
		List<Account> list=jdbcTemplate.query(final_sql, new BeanPropertyRowMapper(Account.class));
		return list;
	}
	
	public boolean checkAccount(String username)
	{
		AccountExample example = new AccountExample();
		example.createCriteria().andLoginnameEqualTo(username);
		List<Account> list = accountMapper.selectByExample(example);
		if(list !=null)
		{
			return true;
		}
		return false;
	}
	
	public int count()
	{
		String sql="select count(*) from t_account ";
		int count = jdbcTemplate.queryForInt(sql);
		return count;
	}

	
}
