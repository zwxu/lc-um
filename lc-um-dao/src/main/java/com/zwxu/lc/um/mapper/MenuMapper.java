package com.zwxu.lc.um.mapper;

import com.zwxu.lc.um.model.Menu;
import java.util.List;



public interface MenuMapper {
	List<Menu> selectMenuByRoleId(int roleId);
}