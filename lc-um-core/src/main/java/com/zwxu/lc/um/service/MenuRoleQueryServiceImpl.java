package com.zwxu.lc.um.service;


import org.springframework.beans.factory.annotation.Autowired;
import com.zwxu.lc.um.api.MenuRoleQueryService;
import com.zwxu.lc.um.dao.MenuRoleDao;




public class MenuRoleQueryServiceImpl implements MenuRoleQueryService{
	@Autowired
	MenuRoleDao menuRoleDao;

	public boolean hasRoleByUrl(String url) {
		
		return menuRoleDao.hasRoleByUrl(url);
	}

	

}
