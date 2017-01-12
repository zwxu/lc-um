package com.zwxu.lc.um.api;

import javax.jws.WebService;

import com.zwxu.lc.um.bean.AccountInfoResponse;
import com.zwxu.lc.um.bean.BaseResult;


@WebService
public interface AccountService {

	BaseResult create(AccountInfoResponse bean);

	BaseResult modify(AccountInfoResponse bean);

	BaseResult delete(AccountInfoResponse bean);
	
	BaseResult check(AccountInfoResponse bean);

}
