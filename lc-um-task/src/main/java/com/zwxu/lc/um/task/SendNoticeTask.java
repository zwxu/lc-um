package com.zwxu.lc.um.task;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.zwxu.lc.um.service.ProxyJMSConsumer;
import com.zwxu.lc.um.service.ProxyJMSProducer;

public class SendNoticeTask {

	@Autowired
	ProxyJMSProducer messageSender;
	@Autowired
	ProxyJMSConsumer messageReceiver;
	private static Logger logger = Logger.getLogger(SendNoticeTask.class);

	public void run() throws IOException {
		logger.info("start sendNotice");

		//messageSender.sendInfo();
		//String message = messageReceiver.receive();
		//logger.info("get message is "+message);
		logger.info("end sendNotice");
	}
}
