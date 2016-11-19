package com.zwxu.lc.um.test;

import java.util.Iterator;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zwxu.lc.um.dao.UserDao;
import com.zwxu.lc.um.model.User;
import com.zwxu.lc.um.model.UserExample;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/META-INF/spring/applicationContext.xml");
		
		UserDao	userDao=(UserDao) context.getBean("userDao");
			
			List<User> list=userDao.query(1);
			Iterator it=list.iterator();
			while(it.hasNext()){
			User user=(User) it.next();
			System.out.println(user.getUsername());
			}
		}

}
