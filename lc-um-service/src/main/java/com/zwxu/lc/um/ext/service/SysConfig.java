package com.zwxu.lc.um.ext.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;

public class SysConfig implements InitializingBean{
	
/**
   * 4,5,6,7,8,9出现的概率为15%
   */
	private static double rate0 = 0.15;
	/**
   * 10出现的概率为10%
   */
	private static double rate1 = 0.10;
	private static double rate2 = 0.70;
	private static double rate3 = 0.30;
	
	private Map<Integer,Integer> randomMap;

	public int getRadom(int i)
	{
		return randomMap.get(i);
	}
	public void afterPropertiesSet() throws Exception {
		{
			randomMap = new HashMap<Integer,Integer>();
			randomMap.put(1, NewPercentageRandom());
		}
		System.out.println("random is: ");
	}
	
	private int OldPercentageRandom()
	 {
		 double randomNumber;
		 randomNumber = Math.random();
		 if (randomNumber >= 0 && randomNumber <= rate2)
		 {
			 return 2;
		 }
		 else if (randomNumber >= rate2  && randomNumber <= rate2+rate3 )
		 {
			 return 3;
		 }

		 return 2;
	 }

		
	 private int NewPercentageRandom()
	 {
		 double randomNumber;
		 randomNumber = Math.random();
		 if (randomNumber >= 0 && randomNumber <= rate0)
		 {
			 return 4;
		 }
		 else if (randomNumber >= rate0  && randomNumber <= 2*rate0 )
		 {
			 return 5;
		 }
		 else if (randomNumber >= 2*rate0
				 && randomNumber <= 3*rate0)
		 {
			 return 6;
		 }
		 else if (randomNumber >= 3*rate0
				 && randomNumber <= 4*rate0)
		 {
			 return 7;
		 }
		 else if (randomNumber >= 4*rate0
				 && randomNumber <= 5*rate0)
		 {
			 return 8;
		 }
		 else if (randomNumber >= 5*rate0
				 && randomNumber <= 6*rate0)
		 {
			 return 9;
		 }
		 else if (randomNumber >= 6*rate0
			    && randomNumber <= 6*rate0+rate1)
		 {
			 return 10;
		 }
		 return 4;
	 }

}
