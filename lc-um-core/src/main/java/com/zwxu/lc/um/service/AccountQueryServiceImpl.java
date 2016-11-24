package com.zwxu.lc.um.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.zwxu.lc.um.bean.QueryResult;
import com.zwxu.lc.um.api.AccountQueryService;
import com.zwxu.lc.um.bean.AccountInfoResponse;
import com.zwxu.lc.um.bean.BaseResult;
import com.zwxu.lc.um.dao.AccountDao;
import com.zwxu.lc.um.model.Account;


public class AccountQueryServiceImpl implements AccountQueryService{
	@Autowired
	AccountDao accountDao;

	public List<AccountInfoResponse> query(int tid) {
		List<Account> list = accountDao.query(tid);
		List<AccountInfoResponse> result = new ArrayList<AccountInfoResponse>();
		if(null == list || list.isEmpty()) {
			return result;
		}
		
		for(Account u : list) {
			result.add(createAccountInfoResponse(u));
		}
		return result;
	}

	private AccountInfoResponse createAccountInfoResponse(Account u) {
		AccountInfoResponse info = new AccountInfoResponse();
		info.setLoginname(u.getLoginname());
		info.setPassword(u.getPassword());
		return info;
	}
	
	public QueryResult queryPage(int start, int pageSize) {
		int count = accountDao.count();
		List<Account> list = accountDao.query(start,pageSize);
		QueryResult result = new QueryResult();
		List<AccountInfoResponse> AccountResult = new ArrayList<AccountInfoResponse>();
		if(null == list || list.isEmpty()) {
			return null;
		}
		
		for(Account u : list) {
			AccountResult.add(createAccountInfoResponse(u));
		}
		result.setCount(count);
		result.setInfo(AccountResult);
		return result;
	}

	public boolean checkAccount(String loginname) {
		
		boolean flag = accountDao.checkAccount(loginname);
		
		return flag;
	}

}
