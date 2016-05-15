package collection.properties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args)throws Exception {
		
		//1.创建一个Properties对象
		Properties pro = new Properties();
		
		//2.将文件加载到Properties中
		//a.获取文件的路径     PropertiesExample.class.getResource("").getPath()获取PropertiesExample Class文件所在
		//的路径
		String path = PropertiesExample.class.getResource("").getPath()+"db.properties";
		
		System.out.println(path);
		//b.通过IO流加载文件
		InputStream is = new FileInputStream(path);
		
		//3.加载文件到内存中
		pro.load(is);
		
		//4.通过key获取value 
		String driver = pro.getProperty("driver");
		String username = pro.getProperty("userName");
		String password = pro.getProperty("password");
		String url = pro.getProperty("url");
		
		System.out.println(driver+","+username+","+ password+","+url);
	}

}
