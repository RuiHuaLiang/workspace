package api;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * ����: �û���6-20
       ^[a-zA-Z][\w_]{5,19}$
            ����:www@163.com   www@gmail.com.cn
       ^[a-zA-Z]\w{5,19}@\w{2,5}.[a-zA-Z]{2,4}[.]?([a-z]{2,4})?$
            �ֻ����� 1 34578 0123456789 
       ^[1][34578]\d{9}$ 
            ����: 1:����[5,10] ��  2:����&��ĸ ��  3.������ĸ_#*
 */
public class UserReg {
	 public static void main(String []args){; 
		
		 
		 //2.У���û���  ��������ʽ����
		/* 
		  System.out.println("�������û���");
		 Scanner sc =new Scanner(System.in);
		 String userName = sc.nextLine(); 
		  String regex = "^[a-zA-Z][\\w_]{5,19}$";
		 boolean isValidate = userName.matches(regex);
		 System.out.println(isValidate);*/
		 /*boolean isUserName = ValidateUtils.isUserName(userName);
		 if(isUserName){
			 System.out.println("У��ɹ���");
		 }else{			 
			 System.out.println("�Ƿ��û�����");
		 }*/
	 
		 
	    //-------------------Pattern ����������� ��Matcher��  ƥ��������ʽ���ַ��� --------------	
		 //1.�����û���
		 System.out.println("����������");
		 Scanner sc =new Scanner(System.in);
		 String email = sc.nextLine();
		 //��ȡ������ʽ�Ķ���
		 Pattern p = Pattern.compile("^[a-zA-Z]\\w{2,19}@\\w{2,5}.[a-zA-Z]{2,4}[.]?([a-z]{2,4})?$");
		 //���ַ������뵽���������  ��ȡһ��Matcher
		 Matcher m = p.matcher(email);
		 
		 boolean isRes = m.matches();
		 System.out.println(isRes);
		 
		 
		 
	 }
}
