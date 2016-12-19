package com.zwxu.lc.um.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zwxu.lc.um.cache.CacheType;
import com.zwxu.lc.um.cache.MemeryCacheClient;


public class Hello {
	
	private static ApplicationContext app;  

    
	public void print()
	{
		System.out.println("hello world");	
	}

	public static void main(String[] args) {
		app = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");  
		MemeryCacheClient client = (MemeryCacheClient) app.getBean("memeryCacheClient");
		//client.put(CacheType.APP_SETTING, "name", "reply", 1000);
		System.out.println(client.get(CacheType.APP_SETTING, "name"));
	}

}
