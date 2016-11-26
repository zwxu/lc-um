package com.zwxu.lc.um.api;

import java.util.List;
import javax.jws.WebService;
import com.zwxu.lc.um.bean.QueryStudentResult;
import com.zwxu.lc.um.bean.AccountInfoResponse;


@WebService
public interface AccountQueryService {

	List<AccountInfoResponse> query(int tid);
	QueryStudentResult queryPage(int start,int pageSize);
	boolean checkAccount(String loginname);
}
