package com.zwxu.lc.um.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zwxu.lc.um.ext.service.UserConfigService;


public class SpringTest {

	 public static void main(String[] args) {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");
		 UserConfigService userConfigService = (UserConfigService) ctx.getBean("userConfigService");
		 
		 System.out.println(userConfigService.getAuthName(0));
	 }
}
