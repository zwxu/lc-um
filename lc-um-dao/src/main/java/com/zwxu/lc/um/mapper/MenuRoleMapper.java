package com.zwxu.lc.um.mapper;

import java.util.List;

public interface MenuRoleMapper {
	List<Integer> selectMenuByRoleId(int roleId);
}