package com.zwxu.lc.um.api;

import javax.jws.WebService;
import com.zwxu.lc.um.bean.QueryMenuResult;




@WebService
public interface MenuQueryService {

	QueryMenuResult queryAllByUserName(String username);
}
