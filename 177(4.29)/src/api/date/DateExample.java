package api.date;

import java.util.Date;
public class DateExample {

	public static void main(String[] args) {
		//----------------日期类----------------
		 //1.创建日期的对象
		 Date d = new Date();
		 System.out.println("当前时间:"+d);
       //------------------API----------------------
		//2016年4月16日 10:57:50 
		 
		/*
		 * 1900: 人为规定计算机记录时间的起点。
		 * 1970年1月1日 00:00:00  计算机的公元元年
		 * **/ 
		int year = d.getYear(); 
		System.out.println("year:"+(1900+year));
		
		int month = d.getMonth();
		System.out.println("month:"+(month+1));
		
		int day = d.getDate();
		System.out.println("day:"+day);
		
		int week = d.getDay(); //6:  +1  
		System.out.println("week:"+week);
		
		int hour = d.getHours();
		System.out.println("hour:"+hour);
		int min = d.getMinutes();
		System.out.println("min:"+min);		
		int second = d.getSeconds();
		System.out.println("second:"+second);
		
		System.out.println((year+1900)+"年"+(month+1)+"月 "+day+"日"+ hour+":"+min+":"+second);
		 
	}

}
