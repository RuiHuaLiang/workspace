package oop;

import java.util.Scanner;

public class TestUser {
	public static void main(String[] args){
		User u = new User("admin","88888888");
		
		System.out.println("�������û���:");
		Scanner sc = new Scanner(System.in);
		String userName = sc.nextLine();
		
		System.out.println("����������:");
		Scanner sc1 = new Scanner(System.in);
		String password = sc1.nextLine();
		
		boolean isLogin = u.login(userName, password);
		if(isLogin){
			System.out.println("��¼�ɹ���");
		}else{
			System.out.println("��¼ʧ�ܣ�");
			
		}
		
	}
}
