package com.zwxu.lc.um.dao;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.zwxu.lc.um.mapper.AccountMapper;
import com.zwxu.lc.um.mapper.StudentMapper;
import com.zwxu.lc.um.mapper.TeacherMapper;
import com.zwxu.lc.um.model.Account;
import com.zwxu.lc.um.model.AccountExample;
import com.zwxu.lc.um.model.Student;
import com.zwxu.lc.um.model.Teacher;


public class AccountDao {
	
	@Autowired
    private AccountMapper accountMapper;
	@Autowired
    private TeacherMapper teacherMapper;
	@Autowired
    private StudentMapper studentMapper;
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Transactional
	public void insert(Account card) {
		card.setCreateTime(new Date());
		card.setDeleteFlag("1");
		
		if(card.getRid().equals("3"))
		{
			card.setSource("student");
			accountMapper.insert(card);
			Student s = new Student();
			s.setAid(card.getId());
			s.setUsername(card.getLoginname());
			studentMapper.insert(s);
		}

		else
		{
			card.setSource("teacher");
			accountMapper.insert(card);
			Teacher t = new Teacher();
			t.setAid(card.getId());
			t.setUsername(card.getLoginname());
			t.setDeleteFlag("1");
			t.setCreatedTime(new Date());
			teacherMapper.insert(t);

		}
		
	}
	
	
	public Account queryById(int id)
	{
		Account a = accountMapper.selectByPrimaryKey(id);
		return a;
	}
	
	public int updateAccount(Account a)
	{
		AccountExample example = new AccountExample();
		example.createCriteria().andIdEqualTo(a.getId());
		int count = accountMapper.updateByExampleSelective(a, example);

		return count;
	}
	
	public int deleteAccount(Account a)
	{
		AccountExample example = new AccountExample();
		example.createCriteria().andIdEqualTo(a.getId());
		int count = accountMapper.deleteByExample(example);

		return count;
	}
	
	public List<Account> query(int start ,int pageSize)
	{
		String sql="select * from t_account ";
		String final_sql = sql + String.format(" limit %d, %d ", start, pageSize);
		List<Account> list=jdbcTemplate.query(final_sql, new BeanPropertyRowMapper(Account.class));
		return list;
	}
	
	public boolean checkAccount(Account a)
	{
		AccountExample example = new AccountExample();
		example.createCriteria().andLoginnameEqualTo(a.getLoginname()).andPasswordEqualTo(a.getPassword());
		List<Account> list = accountMapper.selectByExample(example);
		if(!list.isEmpty())
		{
			return true;
		}
		return false;
	}
	
	public List<Account> queryAll()
	{
		String sql="select * from t_account ";
		List<Account> list=jdbcTemplate.query(sql, new BeanPropertyRowMapper(Account.class));
		return list;
	}
	
	public int count()
	{
		String sql="select count(*) from t_account ";
		int count = jdbcTemplate.queryForInt(sql);
		return count;
	}
	
	public int queryRidByUserName(String username)
	{
		String sql="select rid from t_account where loginname = ?";
		int rid=jdbcTemplate.queryForObject(sql, new Object[]{username}, Integer.class);
		return rid;
	}

	
}
