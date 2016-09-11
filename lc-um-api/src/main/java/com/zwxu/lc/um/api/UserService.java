package com.zwxu.lc.um.api;

import javax.jws.WebService;

import com.zwxu.lc.um.bean.UserInfo;


@WebService
public interface UserService {

	UserInfo create(UserInfo bean);

	UserInfo modify(UserInfo bean);

	boolean delete(int id);

}
