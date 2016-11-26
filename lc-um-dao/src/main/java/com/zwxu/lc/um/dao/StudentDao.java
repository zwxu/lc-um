package com.zwxu.lc.um.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.zwxu.lc.um.model.Student;


public class StudentDao {
	@Autowired
    private JdbcTemplate jdbcTemplate;
	

	public List<Student> queryAll()
	{
		String sql="select * from t_student ";
		List<Student> list=jdbcTemplate.query(sql, new BeanPropertyRowMapper(Student.class));
		return list;
	}
	

	public int count()
	{
		String sql="select count(*) from t_student ";
		int count = jdbcTemplate.queryForInt(sql);
		return count;
	}

	
}
