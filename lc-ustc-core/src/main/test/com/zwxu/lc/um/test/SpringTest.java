package com.zwxu.lc.um.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zwxu.lc.um.dao.UserDao;
import com.zwxu.lc.um.model.User;

public class SpringTest {

	 public static void main(String[] args) {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("context/context-service.xml");
		 UserDao userDao = (UserDao) ctx.getBean("userDao");
		 User record = new User();
		 record.setUsername("haha");
		 record.setPassword("123456");
		 record.setAccess(1);
		 record.setCreateTime(new Date());
		 User newUser = userDao.insert(record);
		 System.out.println(newUser);
	 }
}
