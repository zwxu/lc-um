package com.zwxu.lc.um.api;

import javax.jws.WebService;
import com.zwxu.lc.um.bean.QueryTeacherResult;




@WebService
public interface TeacherQueryService {

	QueryTeacherResult queryAll();
}
