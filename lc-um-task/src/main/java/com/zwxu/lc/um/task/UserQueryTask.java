package com.zwxu.lc.um.task;

import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import com.zwxu.lc.um.api.UserQueryService;
import com.zwxu.lc.um.bean.UserInfo;
import com.zwxu.lc.um.ext.service.SysConfig;


public class UserQueryTask {
	/**
	   * 4,5,6,7,8,9出现的概率为15%
	   */
		private static double rate0 = 0.15;
		/**
	   * 10出现的概率为10%
	   */
		private static double rate1 = 0.10;
		private static double rate2 = 0.70;
		private static double rate3 = 0.30;
	
	@Autowired
    private UserQueryService uqService;
	/*@Autowired
    private SysConfig sysConfig;*/

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
	
	

	private int OldPercentageRandom()
	 {
		 double randomNumber;
		 randomNumber = Math.random();
		 if (randomNumber >= 0 && randomNumber <= rate2)
		 {
			 return 2;
		 }
		 else if (randomNumber >= rate2  && randomNumber <= rate2+rate3 )
		 {
			 return 3;
		 }

		 return 2;
	 }

		
	 private int NewPercentageRandom()
	 {
		 double randomNumber;
		 randomNumber = Math.random();
		 if (randomNumber >= 0 && randomNumber <= rate0)
		 {
			 return 4;
		 }
		 else if (randomNumber >= rate0  && randomNumber <= 2*rate0 )
		 {
			 return 5;
		 }
		 else if (randomNumber >= 2*rate0
				 && randomNumber <= 3*rate0)
		 {
			 return 6;
		 }
		 else if (randomNumber >= 3*rate0
				 && randomNumber <= 4*rate0)
		 {
			 return 7;
		 }
		 else if (randomNumber >= 4*rate0
				 && randomNumber <= 5*rate0)
		 {
			 return 8;
		 }
		 else if (randomNumber >= 5*rate0
				 && randomNumber <= 6*rate0)
		 {
			 return 9;
		 }
		 else if (randomNumber >= 6*rate0
			    && randomNumber <= 6*rate0+rate1)
		 {
			 return 10;
		 }
		 return 4;
	 }

	
}
