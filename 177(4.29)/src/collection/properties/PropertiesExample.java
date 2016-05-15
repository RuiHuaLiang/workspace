package collection.properties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args)throws Exception {
		
		//1.����һ��Properties����
		Properties pro = new Properties();
		
		//2.���ļ����ص�Properties��
		//a.��ȡ�ļ���·��     PropertiesExample.class.getResource("").getPath()��ȡPropertiesExample Class�ļ�����
		//��·��
		String path = PropertiesExample.class.getResource("").getPath()+"db.properties";
		
		System.out.println(path);
		//b.ͨ��IO�������ļ�
		InputStream is = new FileInputStream(path);
		
		//3.�����ļ����ڴ���
		pro.load(is);
		
		//4.ͨ��key��ȡvalue 
		String driver = pro.getProperty("driver");
		String username = pro.getProperty("userName");
		String password = pro.getProperty("password");
		String url = pro.getProperty("url");
		
		System.out.println(driver+","+username+","+ password+","+url);
	}

}
