package com.zwxu.lc.um.api;

import javax.jws.WebService;

import com.zwxu.lc.um.bean.User;


@WebService
public interface UserService {

	User create(User bean);

	User modify(User bean);

	boolean delete(int id);

}
