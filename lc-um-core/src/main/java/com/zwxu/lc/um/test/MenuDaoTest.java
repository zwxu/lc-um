package com.zwxu.lc.um.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.zwxu.lc.um.dao.MenuDao;
import com.zwxu.lc.um.model.Menu;
import com.zwxu.lc.um.service.Hello;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/applicationContext.xml")
public class MenuDaoTest {
	   @Autowired
	   MenuDao menuDao;
	    
	   @Autowired
	   Hello hello;
	    
	    @Test
	    public void findByRoleId() {
	        
	        List<Menu> list=  menuDao.selectMenu(1);
	        for(Menu i:list)
	        {
	        	System.out.println(i.getMenuName());
	        }
	    }
	    
	    @Test
	    void find()
	    {
	    	hello.print();
	    }
	
}
