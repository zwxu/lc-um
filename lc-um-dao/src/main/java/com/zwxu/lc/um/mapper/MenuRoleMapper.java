package com.zwxu.lc.um.mapper;

import java.util.List;
import com.zwxu.lc.um.model.MenuRole;


public interface MenuRoleMapper {
	MenuRole selectByUrlAndUsername(String menuUrl);

	List<Integer> selectMenuByRoleId(int roleId);
}