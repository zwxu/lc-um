package com.zwxu.lc.um.test;

import java.util.Iterator;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zwxu.lc.um.dao.AccountDao;
import com.zwxu.lc.um.model.Account;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/META-INF/spring/applicationContext.xml");
		
		AccountDao	userDao=(AccountDao) context.getBean("accountDao");
		System.out.println(userDao.checkAccount("haha"));
			List<Account> list=userDao.query(1,10);
			Iterator it=list.iterator();
			while(it.hasNext()){
				Account user=(Account) it.next();
				System.out.println(user.getLoginname());
			}
		}

}
