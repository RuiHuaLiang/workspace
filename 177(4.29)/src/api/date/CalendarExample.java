package api.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarExample {

	public static void main(String[] args) {
		//---------------获取日历对象---------------
		Calendar c  = Calendar.getInstance();
		System.out.println(c);
		//---------------Calendar的API---------------
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DATE);
		
		int hour = c.get(Calendar.HOUR);
		int min  = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(year+"年"+(month+1)+"月"+day+"日"+hour+":"+min+":"+second);
		
		int week  = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("星期:"+week);
		
		//---------------Calendar Date  long之间的转换----------
		  //1.Calendar与Date之间的转换  void set(Date)将Date转换成 Calendar
		
		  Date d = c.getTime(); //将Calendar转换成Date  
		  System.out.println(d);
		 
		  //2.Date和long之间的转换
		  long i =d.getTime(); //将Date转换成long
		  System.out.println(i);
		  
		  d.setTime(i);  //将long转换成Date
		  System.out.println(d);
	}
	

}
