package com.zwxu.lc.um.test;

import java.util.Iterator;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zwxu.lc.um.dao.AccountDao;
import com.zwxu.lc.um.dao.StudentDao;
import com.zwxu.lc.um.model.Account;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/META-INF/spring/applicationContext.xml");
		
		StudentDao	userDao=(StudentDao) context.getBean("studentDao");
		System.out.println(userDao.count());
			
		}

}
