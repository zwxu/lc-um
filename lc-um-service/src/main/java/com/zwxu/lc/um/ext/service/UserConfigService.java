/*package com.zwxu.lc.um.ext.service;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.zwxu.lc.um.cache.CacheTemplate;
import com.zwxu.lc.um.common.enums.CacheType;


public class UserConfigService implements InitializingBean {

	@Autowired
	private CacheTemplate template;
	private static final int EXPIRE_TIME = 300;
	private Map<Integer, String> userNameMap;

	
	public String getAuthName(int access) {
		
	    String key = String.valueOf(access);
	    String obj = (String) template.get(CacheType.FCOUPON, key);
	    if (obj != null) {
	      
	      System.out.println("template-cache==" + obj);
	      return obj;
	    }
	   
	      String name = userNameMap.get(access);
	      template.put(CacheType.FCOUPON, key, name, EXPIRE_TIME);
	     
		
		return name;
	}
	

	@Override
	public void afterPropertiesSet() throws Exception {
		userNameMap = new HashMap<Integer, String>();
		userNameMap.put(1, "普通会员");
		userNameMap.put(0, "管理员");
		
	}


}
*/