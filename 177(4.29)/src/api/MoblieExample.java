package api;

import java.util.Arrays;
import java.util.Scanner;

public class MoblieExample {
	public static void main(String[] args) {
		boolean isSuccess = addMoney();
		if(isSuccess){
			System.out.println("��ֵ�ɹ���");
		}else{
			System.out.println("��ֵʧ�ܣ�");
		}
	}
	
	
	
	public static   boolean addMoney(){
		System.out.println("��ֵ���ѵĸ�ʽ:��ֵ������#��ֵ������#��ֵ���ֻ�����");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();//�û�����ĳ�ֵ�� ��ֵ���� �ֻ�����
		
		//1.��һ��:�и�
		/*String[] rs = str.split("#");
 		System.out.println(Arrays.toString(rs));
*/		
		//2.�ڶ��ָ����±����
		int last = str.lastIndexOf("#");
		if(last != -1){
			String tel = str.substring(last+1);
			System.out.println("�ֻ�����Ϊ:"+tel+"�Ƿ��ֵ ��ֵ�밴[1]");
			Scanner sc1 =new Scanner(System.in);
			int num = sc1.nextInt();
			if(num == 1){
				return true;
			}
		}
		
		return false;
	}

}
