package com.zwxu.lc.um.api;

import javax.jws.WebService;
import com.zwxu.lc.um.bean.QueryStudentResult;




@WebService
public interface StudentQueryService {

	QueryStudentResult queryAll();
}
