package exception;

import java.io.IOException;
import java.util.Scanner;

public class PersonExample {
	public static void main(String[] agrs){
			try {
				test();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("-----------main------");
			System.out.println("------结束-----");
	}
	
	public static void test()throws Exception{ //抛出异常
		System.out.println("请输入性别[1]男 [2]女");
		Scanner sc = new Scanner(System.in);
		int gender  = sc.nextInt();
		if(gender != 1 || gender !=2){
			throw new IOException("性别的值不在范围内");  //产生异常
		}
		System.out.println("------test------");
	}
}
