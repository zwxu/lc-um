package com.zwxu.lc.um.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zwxu.lc.um.mapper.MenuRoleMapper;
import com.zwxu.lc.um.model.MenuRole;

public class MenuRoleDao {
	
	@Autowired
	MenuRoleMapper menuRoleMapper;
	
	public List<Integer> selectMenuByRoleId(int roleId)
	{
		List<Integer> list = menuRoleMapper.selectMenuByRoleId(roleId);
		return list;
	}
	
	public boolean hasRoleByUrl(String url)
	{
		MenuRole mr = menuRoleMapper.selectByUrlAndUsername(url);
		if(mr != null)
		{
			return true;
		}
		return false;
	}
	

}
