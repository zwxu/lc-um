package com.zwxu.lc.um.test;
import java.io.File;


/*
 * File directory = new File("..");
directory.getCanonicalPath(); //�õ�����C:\
directory.getAbsolutePath();    //�õ�����C:\test\..
 * 
 */
public class ReadPropertiesUtil {
	//String path = System.getProperty("user.dir");   ���Ƽ�����ͬ������·����ͬ
	 public static void main(String[] args) {
	        File directory = new File("");//�趨Ϊ��ǰ�ļ���
	        System.out.println(directory.getAbsolutePath());//��ȡ����·��
	        System.out.println(directory.getPath()); //���new File()ʱ�趨��·��
	        //System.out.println(System.getProperties());
	        
	        /**
	         * class.getClassLoader().getResourceAsStream($path), ����$pathĬ����srcԴ·����maven��Ŀһ�������˶��Դ·��
	         * ���磺maven��Ŀ��Դ·��Ϊ��src/main/java��src/main/resources,src/test/java,src/test/resources,�ڴ��ĸ�Դ
	         * ·���µ��ļ�����ֱ��д�ļ������ɶ�ȡ
	         */
	        System.out.println(Thread.currentThread().getContextClassLoader().getResource("config/json.txt").getPath());
	       System.out.println(ReadPropertiesUtil.class.getClassLoader().getResource("config/json.txt"));
	       /* System.out.println(Thread.currentThread().getContextClassLoader().getResource("src/test/java/file1.properties"));
	        System.out.println(Thread.currentThread().getContextClassLoader().getResource("file2.properties"));
	        System.out.println(Thread.currentThread().getContextClassLoader().getResource("file3.properties"));*/
	        
	        
	    }
}
