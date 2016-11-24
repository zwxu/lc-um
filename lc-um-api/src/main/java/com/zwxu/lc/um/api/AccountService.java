package com.zwxu.lc.um.api;

import javax.jws.WebService;

import com.zwxu.lc.um.bean.AccountInfoResponse;


@WebService
public interface AccountService {

	AccountInfoResponse create(AccountInfoResponse bean);

	AccountInfoResponse modify(AccountInfoResponse bean);

	boolean delete(int id);

}
