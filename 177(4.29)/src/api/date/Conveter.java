package api.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Conveter {

	public static void main(String[] args) throws Exception {
		//-----------将字符串转换成日期对象(Date)---------------
		 System.out.println("请输入日期:yyyy年MM月dd日hh:mm:ss");
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine();
		 //String str = "2016年4月16日11:35:13";
		 //1.指定格式化的对象 指定格式
		 SimpleDateFormat sd = new SimpleDateFormat("yyyy年MM月dd日hh:mm:ss");
		 
		 //2.调用方法转换成（字符串--->Date）
		 Date d = sd.parse(str);
		 System.out.println(d);
		 
		 
		//-----------将日期对象转换成对应的字符串    04/16/2016-------------------
		 //a.指定转换个格式
		 SimpleDateFormat sd1 = new SimpleDateFormat("MM/dd/yyyy");
		 
		 //b.将日期转换成字符串
		 String rs = sd1.format(d);
		 System.out.println(rs);
		 
		 
		 
		 
		 
		 
	}

}
