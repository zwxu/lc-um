package com.zwxu.lc.um.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.zwxu.lc.um.bean.QueryMenuResult;
import com.zwxu.lc.um.bean.MenuInfoResponse;
import com.zwxu.lc.um.api.MenuQueryService;
import com.zwxu.lc.um.dao.AccountDao;
import com.zwxu.lc.um.dao.MenuDao;
import com.zwxu.lc.um.model.Menu;



public class MenuQueryServiceImpl implements MenuQueryService{
	@Autowired
	MenuDao menuDao;
	@Autowired
	AccountDao accountDao;

	private MenuInfoResponse createMenuInfoResponse(Menu s) {
		MenuInfoResponse info = new MenuInfoResponse();
		BeanUtils.copyProperties(s, info, new String[]{"status"});
		if(s.getDeleteFlag().equals("1"))
		{
			info.setStatus(true);
		}
		else
		{
			info.setStatus(false);
		}
		return info;
	}
	

	public QueryMenuResult queryAllByUserName(String username) {
		int roleId = accountDao.queryRidByUserName(username);
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
