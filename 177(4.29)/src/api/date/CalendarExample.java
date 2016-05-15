package api.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarExample {

	public static void main(String[] args) {
		//---------------��ȡ��������---------------
		Calendar c  = Calendar.getInstance();
		System.out.println(c);
		//---------------Calendar��API---------------
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DATE);
		
		int hour = c.get(Calendar.HOUR);
		int min  = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(year+"��"+(month+1)+"��"+day+"��"+hour+":"+min+":"+second);
		
		int week  = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("����:"+week);
		
		//---------------Calendar Date  long֮���ת��----------
		  //1.Calendar��Date֮���ת��  void set(Date)��Dateת���� Calendar
		
		  Date d = c.getTime(); //��Calendarת����Date  
		  System.out.println(d);
		 
		  //2.Date��long֮���ת��
		  long i =d.getTime(); //��Dateת����long
		  System.out.println(i);
		  
		  d.setTime(i);  //��longת����Date
		  System.out.println(d);
	}
	

}
