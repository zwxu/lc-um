package com.zwxu.lc.um.api;

import javax.jws.WebService;






@WebService
public interface MenuRoleQueryService {

	boolean hasRoleByUrl(String url);
}
