package api;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 案例: 用户名6-20
       ^[a-zA-Z][\w_]{5,19}$
            邮箱:www@163.com   www@gmail.com.cn
       ^[a-zA-Z]\w{5,19}@\w{2,5}.[a-zA-Z]{2,4}[.]?([a-z]{2,4})?$
            手机号码 1 34578 0123456789 
       ^[1][34578]\d{9}$ 
            密码: 1:数字[5,10] 低  2:数字&字母 中  3.数字字母_#*
 */
public class UserReg {
	 public static void main(String []args){; 
		
		 
		 //2.校验用户名  和正则表达式关联
		/* 
		  System.out.println("请输入用户名");
		 Scanner sc =new Scanner(System.in);
		 String userName = sc.nextLine(); 
		  String regex = "^[a-zA-Z][\\w_]{5,19}$";
		 boolean isValidate = userName.matches(regex);
		 System.out.println(isValidate);*/
		 /*boolean isUserName = ValidateUtils.isUserName(userName);
		 if(isUserName){
			 System.out.println("校验成功！");
		 }else{			 
			 System.out.println("非法用户名！");
		 }*/
	 
		 
	    //-------------------Pattern 创建正则对象 和Matcher类  匹配正则表达式和字符串 --------------	
		 //1.输入用户名
		 System.out.println("请输入邮箱");
		 Scanner sc =new Scanner(System.in);
		 String email = sc.nextLine();
		 //获取正则表达式的对象
		 Pattern p = Pattern.compile("^[a-zA-Z]\\w{2,19}@\\w{2,5}.[a-zA-Z]{2,4}[.]?([a-z]{2,4})?$");
		 //将字符串加入到正则对象中  获取一个Matcher
		 Matcher m = p.matcher(email);
		 
		 boolean isRes = m.matches();
		 System.out.println(isRes);
		 
		 
		 
	 }
}
