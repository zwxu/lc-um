package com.zwxu.lc.um.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.zwxu.lc.um.model.Student;
import com.zwxu.lc.um.model.Teacher;


public class TeacherDao {
	@Autowired
    private JdbcTemplate jdbcTemplate;
	

	public List<Teacher> queryAll()
	{
		String sql="select * from t_teacher ";
		List<Teacher> list=jdbcTemplate.query(sql, new BeanPropertyRowMapper(Teacher.class));
		return list;
	}
	

	public int count()
	{
		String sql="select count(*) from t_teacher ";
		int count = jdbcTemplate.queryForInt(sql);
		return count;
	}

	
}
