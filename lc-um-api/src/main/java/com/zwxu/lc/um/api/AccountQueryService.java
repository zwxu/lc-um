package com.zwxu.lc.um.api;


import java.util.List;

import javax.jws.WebService;

import com.zwxu.lc.um.bean.AccountInfoResponse;
import com.zwxu.lc.um.bean.QueryAccountResult;




@WebService
public interface AccountQueryService {


	QueryAccountResult queryAll();
	AccountInfoResponse queryById(int id);
	int queryByUserName(String username);
	public List<AccountInfoResponse> queryByPage(int start,int pageSize);

}
