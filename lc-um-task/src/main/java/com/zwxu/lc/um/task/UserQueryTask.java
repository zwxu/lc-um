package com.zwxu.lc.um.task;

import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import com.zwxu.lc.um.api.UserQueryService;
import com.zwxu.lc.um.bean.UserInfo;


public class UserQueryTask {

	
	@Autowired
    private UserQueryService uqService;

	private static Logger logger = Logger.getLogger(UserQueryTask.class);

	public void run() throws IOException {
		logger.info("start userQuery");
		
		List<UserInfo> list = uqService.query(0);
		for(UserInfo info:list)
		{
			System.out.println(info.getUsername());
		}
		logger.info("end userQuery");
	}
	
	

	
	
}
