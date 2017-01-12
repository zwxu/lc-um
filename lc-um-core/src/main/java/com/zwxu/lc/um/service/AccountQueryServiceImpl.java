package com.zwxu.lc.um.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.zwxu.lc.um.bean.AccountInfoResponse;
import com.zwxu.lc.um.bean.QueryAccountResult;
import com.zwxu.lc.um.api.AccountQueryService;
import com.zwxu.lc.um.dao.AccountDao;
import com.zwxu.lc.um.model.Account;



public class AccountQueryServiceImpl implements AccountQueryService{
	@Autowired
	AccountDao accountDao;

	private AccountInfoResponse createAccountInfoResponse(Account s) {
		AccountInfoResponse info = new AccountInfoResponse();
		BeanUtils.copyProperties(s, info);
		return info;
	}
	
	public QueryAccountResult queryAll() {
		int count = accountDao.count();
		List<Account> list = accountDao.queryAll();
		QueryAccountResult result = new QueryAccountResult();
		List<AccountInfoResponse> accountList = new ArrayList<AccountInfoResponse>();
		if(null == list || list.isEmpty()) {
			return null;
		}
		
		for(Account a : list) {
			accountList.add(createAccountInfoResponse(a));
		}
		result.setCount(count);
		result.setInfo(accountList);
		return result;
	}

	public AccountInfoResponse queryById(int id) {
		Account a = accountDao.queryById(id);
		
		return createAccountInfoResponse(a);
	}
	
	public List<AccountInfoResponse> queryByPage(int start,int pageSize) {
		List<Account> list = accountDao.query(start, pageSize);
		List<AccountInfoResponse> infoList = new ArrayList<AccountInfoResponse>();
		for(Account a:list)
		{
			infoList.add(createAccountInfoResponse(a));
		}
		return infoList;
	}

	public int queryByUserName(String username) {
		int rid = accountDao.queryRidByUserName(username);
		return rid;
	}



}
