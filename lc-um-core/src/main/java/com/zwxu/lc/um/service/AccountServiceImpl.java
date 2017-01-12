package com.zwxu.lc.um.service;


import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.zwxu.lc.um.bean.AccountInfoResponse;
import com.zwxu.lc.um.bean.BaseResult;
import com.zwxu.lc.um.api.AccountService;
import com.zwxu.lc.um.dao.AccountDao;
import com.zwxu.lc.um.model.Account;




public class AccountServiceImpl implements AccountService{
	private static Logger logger = Logger.getLogger(AccountServiceImpl.class);
	@Autowired
	AccountDao accountDao;

	public BaseResult create(AccountInfoResponse bean) {
		BaseResult result = new BaseResult();
		try
		{
			accountDao.insert(convertToAccount(bean));
		}
		catch(Exception e)
		{
			logger.info("create fail!!!");
			result.setSuccess(false);
		}
		result.setSuccess(true);
		return result;
	}

	public BaseResult modify(AccountInfoResponse bean) {
		BaseResult result = new BaseResult();
		int count = accountDao.updateAccount(convertToAccount(bean));
		if(count == 0)
		{
			result.setSuccess(false);
			return result;
		}
		result.setSuccess(true);
		return result;
	}

	public BaseResult delete(AccountInfoResponse bean) {
		BaseResult result = new BaseResult();
		int count = accountDao.deleteAccount(convertToAccount(bean));
		if(count == 0)
		{
			result.setSuccess(false);
			return result;
		}
		result.setSuccess(true);
		return result;
	}
	
	private Account convertToAccount(AccountInfoResponse s) {
		Account target = new Account();
		BeanUtils.copyProperties(s, target);
		return target;
	}

	public BaseResult check(AccountInfoResponse bean) {
		BaseResult result = new BaseResult();
		boolean flag = accountDao.checkAccount(convertToAccount(bean));
		if(flag == false)
		{
			result.setSuccess(false);
			return result;
		}
		result.setSuccess(true);
		return result;
	}

	

}
