package oop;

import java.util.Scanner;

public class TestUser {
	public static void main(String[] args){
		User u = new User("admin","88888888");
		
		System.out.println("请输入用户名:");
		Scanner sc = new Scanner(System.in);
		String userName = sc.nextLine();
		
		System.out.println("请输入密码:");
		Scanner sc1 = new Scanner(System.in);
		String password = sc1.nextLine();
		
		boolean isLogin = u.login(userName, password);
		if(isLogin){
			System.out.println("登录成功！");
		}else{
			System.out.println("登录失败！");
			
		}
		
	}
}
