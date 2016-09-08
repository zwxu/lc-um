package com.tiantian.test;

import java.util.concurrent.TimeoutException;  

import net.rubyeye.xmemcached.MemcachedClient;  
import net.rubyeye.xmemcached.exception.MemcachedException;  

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class MemcachedSpringTest {  
  
    private static ApplicationContext app;  
    private static MemcachedClient memcachedClient;  
  
 
    public static void main(String[] args) {
    	app = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");  
        memcachedClient = (MemcachedClient) app.getBean("zmemcachedClient");  
        try {  
            // 设置/获取  
            memcachedClient.set("zlex", 36000, "set/get");  
            memcachedClient.set("name", 36000, "zwxu");  

            memcachedClient.replace("zlex", 36000, "replace");  
            System.out.println(memcachedClient.get("username"));
  
            // 移除  
            //memcachedClient.delete("zlex");  
           
        } catch (TimeoutException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } catch (InterruptedException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } catch (MemcachedException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    }  
}  
