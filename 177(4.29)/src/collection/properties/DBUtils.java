package collection.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBUtils {
	private static Properties pro = new Properties();
	private static String driver;
	private static String username;
	private static String password;
	private static String url;
	static{
		//2.将文件加载到Properties中
		//a.获取文件的路径     PropertiesExample.class.getResource("").getPath()获取PropertiesExample Class文件所在
		//的路径
		String path = DBUtils.class.getResource("").getPath()+"db.properties";	
		System.out.println(path);
		//b.通过IO流加载文件
		InputStream is;
		try {
			is = new FileInputStream(path);
			//3.加载文件到内存中
			pro.load(is);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//4.通过key获取value 
		driver = pro.getProperty("driver");
		username = pro.getProperty("userName");
		password = pro.getProperty("password");
		url = pro.getProperty("url");	
	}
	
	public static void main(String [] agrs){
		
	}
}
