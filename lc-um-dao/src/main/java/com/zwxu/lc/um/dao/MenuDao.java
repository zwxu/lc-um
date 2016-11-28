package com.zwxu.lc.um.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.zwxu.lc.um.mapper.MenuMapper;
import com.zwxu.lc.um.model.Menu;


public class MenuDao {
	
	@Autowired
	MenuMapper menuMapper;
	
	public List<Menu> selectMenu(int roleId)
	{
		List<Menu> list = menuMapper.selectMenuByRoleId(roleId);
		return list;
	}
	

}
