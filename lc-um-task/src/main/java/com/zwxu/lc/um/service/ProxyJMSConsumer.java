package com.zwxu.lc.um.service;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.JmsUtils;

/**
* JMS消费者
* 消息题的内容定义
* 消息对象 接收消息对象后： 接收到的消息体
*/
public class ProxyJMSConsumer implements MessageListener{
	

	public ProxyJMSConsumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private JmsTemplate jmsTemplate;
   /**
    * 监听到消息目的有消息后自动调用onMessage(Message message)方法
    */

	public void onMessage(Message message) {
		 try {
	         System.out.println(((TextMessage)message).getStringProperty("lastName"));
	     } catch (JMSException e) {
	         throw JmsUtils.convertJmsAccessException(e);
	     }
	}



}
