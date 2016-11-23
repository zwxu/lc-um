package com.zwxu.lc.um.api;

import java.util.List;

import javax.jws.WebService;

import com.zwxu.lc.um.bean.QueryResult;
import com.zwxu.lc.um.bean.UserInfo;

@WebService
public interface UserQueryService {

	List<UserInfo> query(int tid);
	QueryResult queryPage(int start,int pageSize);
}
