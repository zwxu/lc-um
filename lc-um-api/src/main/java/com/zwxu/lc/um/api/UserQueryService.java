package com.zwxu.lc.um.api;

import java.util.List;

import javax.jws.WebService;

import com.zwxu.lc.um.bean.UserInfo;

@WebService
public interface UserQueryService {

	List<UserInfo> query(int tid);
	List<UserInfo> queryPage(int start,int pageSize);
}
