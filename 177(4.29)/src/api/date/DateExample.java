package api.date;

import java.util.Date;
public class DateExample {

	public static void main(String[] args) {
		//----------------������----------------
		 //1.�������ڵĶ���
		 Date d = new Date();
		 System.out.println("��ǰʱ��:"+d);
       //------------------API----------------------
		//2016��4��16�� 10:57:50 
		 
		/*
		 * 1900: ��Ϊ�涨�������¼ʱ�����㡣
		 * 1970��1��1�� 00:00:00  ������Ĺ�ԪԪ��
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
		
		System.out.println((year+1900)+"��"+(month+1)+"�� "+day+"��"+ hour+":"+min+":"+second);
		 
	}

}
