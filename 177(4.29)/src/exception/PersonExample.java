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
			System.out.println("------����-----");
	}
	
	public static void test()throws Exception{ //�׳��쳣
		System.out.println("�������Ա�[1]�� [2]Ů");
		Scanner sc = new Scanner(System.in);
		int gender  = sc.nextInt();
		if(gender != 1 || gender !=2){
			throw new IOException("�Ա��ֵ���ڷ�Χ��");  //�����쳣
		}
		System.out.println("------test------");
	}
}
