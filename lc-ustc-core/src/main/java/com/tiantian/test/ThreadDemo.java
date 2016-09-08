package com.tiantian.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

class Count
{
	private static Count instance;
	private  Count(){}
	public static synchronized Count getInstance()
	{
		if(instance == null)
		{
			instance = new Count();
		}
		return instance;
	}
	int i=0;

	
	public void say() {
		// TODO Auto-generated method stub
		while(i<50)
		{
			System.out.println(Thread.currentThread().getName()+"-----"+i++);
		}
	}
}

class Task implements Runnable
{


	public void run() {
		// TODO Auto-generated method stub
		//new Count().say();
		Count.getInstance().say();
	}
	
}

public class ThreadDemo {
	
  private static ThreadPoolTaskExecutor threadPool;
	
	public void setThreadPool(ThreadPoolTaskExecutor threadPool) {
		this.threadPool = threadPool;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[] { "META-INF/spring/applicationContext.xml" });
		ThreadPoolTaskExecutor threadPool =  
	            (ThreadPoolTaskExecutor)ctx.getBean("threadPool"); 

		Task task = new Task();
		threadPool.execute(new Thread(task));
		threadPool.execute(new Thread(task));
		threadPool.execute(new Thread(task));
	}

}
