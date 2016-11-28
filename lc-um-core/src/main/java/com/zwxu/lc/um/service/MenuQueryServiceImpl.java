package com.zwxu.lc.um.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.zwxu.lc.um.bean.QueryMenuResult;
import com.zwxu.lc.um.bean.MenuInfoResponse;
import com.zwxu.lc.um.api.MenuQueryService;
import com.zwxu.lc.um.dao.MenuDao;
import com.zwxu.lc.um.model.Menu;



public class MenuQueryServiceImpl implements MenuQueryService{
	@Autowired
	MenuDao menuDao;

	private MenuInfoResponse createMenuInfoResponse(Menu s) {
		MenuInfoResponse info = new MenuInfoResponse();
		info.setMenuId(s.getId());
		info.setMenuName(s.getMenuName());
		info.setMenuUrl(s.getMenuUrl());
		info.setParentId(s.getParentId());
		if(s.getStatus().equals("1"))
		{
			info.setStatus(true);
		}
		else
		{
			info.setStatus(false);
		}
		return info;
	}
	

	public QueryMenuResult queryAllByRoleId(int roleId) {
		List<Menu> list = menuDao.selectMenu(roleId);
		QueryMenuResult result = new QueryMenuResult();
		List<MenuInfoResponse> MenuList = new ArrayList<MenuInfoResponse>();
		if(null == list || list.isEmpty()) {
			return null;
		}
		
		for(Menu u : list) {
			MenuList.add(createMenuInfoResponse(u));
		}
		result.setInfo(MenuList);
		return result;
	}



}
