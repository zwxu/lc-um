package com.zwxu.lc.um.api;

import java.util.List;

import javax.jws.WebService;

import com.zwxu.lc.um.bean.QueryResult;
import com.zwxu.lc.um.bean.AccountInfoResponse;
import com.zwxu.lc.um.bean.BaseResult;

@WebService
public interface AccountQueryService {

	List<AccountInfoResponse> query(int tid);
	QueryResult queryPage(int start,int pageSize);
	boolean checkAccount(String loginname);
}
