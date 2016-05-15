package exception;

import java.util.Scanner;

public class UserStart {
	public static void main(String[] agrs){
		UserSystem sys = new UserSystem();
		
		//从控制台获取一个用户名
		System.out.println("请输入用户名:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		//从控制台获取一个密码
		System.out.println("请输入密码:");
		Scanner sc1 = new Scanner(System.in);
		String pwd = sc1.nextLine();
		
		try {
			sys.login(name, pwd);  //登录成功
			System.out.println("登录成功！");
		} catch (UserNameException e) {
			e.printStackTrace(); //用户名错误
		} catch (PasswordException e) {
			e.printStackTrace(); //密码错误
		}
	}
}
