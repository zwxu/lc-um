package com.zwxu.lc.um.test;
import java.io.File;


/*
 * File directory = new File("..");
directory.getCanonicalPath(); //得到的是C:\
directory.getAbsolutePath();    //得到的是C:\test\..
 * 
 */
public class ReadPropertiesUtil {
	//String path = System.getProperty("user.dir");   不推荐，不同机器改路径不同
	 public static void main(String[] args) {
	        File directory = new File("");//设定为当前文件夹
	        System.out.println(directory.getAbsolutePath());//获取绝对路径
	        System.out.println(directory.getPath()); //获得new File()时设定的路径
	        //System.out.println(System.getProperties());
	        
	        /**
	         * class.getClassLoader().getResourceAsStream($path), 其中$path默认是src源路径，maven项目一般配置了多个源路径
	         * 例如：maven项目的源路径为：src/main/java，src/main/resources,src/test/java,src/test/resources,在此四个源
	         * 路径下的文件可以直接写文件名即可读取
	         */
	        System.out.println(Thread.currentThread().getContextClassLoader().getResource("config/json.txt").getPath());
	       System.out.println(ReadPropertiesUtil.class.getClassLoader().getResource("config/json.txt"));
	       /* System.out.println(Thread.currentThread().getContextClassLoader().getResource("src/test/java/file1.properties"));
	        System.out.println(Thread.currentThread().getContextClassLoader().getResource("file2.properties"));
	        System.out.println(Thread.currentThread().getContextClassLoader().getResource("file3.properties"));*/
	        
	        
	    }
}
