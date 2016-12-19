package com.zwxu.lc.um.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zwxu.lc.um.dao.StudentDao;




public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/META-INF/spring/applicationContext.xml");
		//StudentDao dao = (StudentDao) context.getBean("studentDao1");
		try
		{
			StudentDao dao = (StudentDao) context.getBean("studentDao1");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("welcome system");
		
			
		}

}
