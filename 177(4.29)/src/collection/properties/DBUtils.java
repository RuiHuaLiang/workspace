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
		//2.���ļ����ص�Properties��
		//a.��ȡ�ļ���·��     PropertiesExample.class.getResource("").getPath()��ȡPropertiesExample Class�ļ�����
		//��·��
		String path = DBUtils.class.getResource("").getPath()+"db.properties";	
		System.out.println(path);
		//b.ͨ��IO�������ļ�
		InputStream is;
		try {
			is = new FileInputStream(path);
			//3.�����ļ����ڴ���
			pro.load(is);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//4.ͨ��key��ȡvalue 
		driver = pro.getProperty("driver");
		username = pro.getProperty("userName");
		password = pro.getProperty("password");
		url = pro.getProperty("url");	
	}
	
	public static void main(String [] agrs){
		
	}
}
