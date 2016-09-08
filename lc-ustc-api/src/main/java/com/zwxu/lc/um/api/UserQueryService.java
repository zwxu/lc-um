package com.zwxu.lc.um.api;

import java.util.List;

import javax.jws.WebService;

import com.zwxu.lc.um.bean.User;

@WebService
public interface UserQueryService {

	List<User> query(int access);
}
