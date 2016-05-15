package api;

import java.util.Arrays;
import java.util.Scanner;

public class MoblieExample {
	public static void main(String[] args) {
		boolean isSuccess = addMoney();
		if(isSuccess){
			System.out.println("充值成功！");
		}else{
			System.out.println("充值失败！");
		}
	}
	
	
	
	public static   boolean addMoney(){
		System.out.println("充值话费的格式:充值卡卡号#充值卡密码#充值的手机号码");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();//用户输入的充值卡 充值密码 手机号码
		
		//1.第一种:切割
		/*String[] rs = str.split("#");
 		System.out.println(Arrays.toString(rs));
*/		
		//2.第二种根据下标查找
		int last = str.lastIndexOf("#");
		if(last != -1){
			String tel = str.substring(last+1);
			System.out.println("手机号码为:"+tel+"是否充值 充值请按[1]");
			Scanner sc1 =new Scanner(System.in);
			int num = sc1.nextInt();
			if(num == 1){
				return true;
			}
		}
		
		return false;
	}

}
