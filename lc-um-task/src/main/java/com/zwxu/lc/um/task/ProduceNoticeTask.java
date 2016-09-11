package com.zwxu.lc.um.task;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import com.zwxu.lc.um.service.ProxyJMSProducer;

public class ProduceNoticeTask {

	@Autowired
	ProxyJMSProducer messageSender;
	
	private static Logger logger = Logger.getLogger(ProduceNoticeTask.class);

	public void run() throws IOException {
		logger.info("start produceNotice");

		messageSender.sendInfo();
		
		logger.info("end produceNotice");
	}
}
