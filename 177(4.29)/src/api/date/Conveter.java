package api.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Conveter {

	public static void main(String[] args) throws Exception {
		//-----------���ַ���ת�������ڶ���(Date)---------------
		 System.out.println("����������:yyyy��MM��dd��hh:mm:ss");
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine();
		 //String str = "2016��4��16��11:35:13";
		 //1.ָ����ʽ���Ķ��� ָ����ʽ
		 SimpleDateFormat sd = new SimpleDateFormat("yyyy��MM��dd��hh:mm:ss");
		 
		 //2.���÷���ת���ɣ��ַ���--->Date��
		 Date d = sd.parse(str);
		 System.out.println(d);
		 
		 
		//-----------�����ڶ���ת���ɶ�Ӧ���ַ���    04/16/2016-------------------
		 //a.ָ��ת������ʽ
		 SimpleDateFormat sd1 = new SimpleDateFormat("MM/dd/yyyy");
		 
		 //b.������ת�����ַ���
		 String rs = sd1.format(d);
		 System.out.println(rs);
		 
		 
		 
		 
		 
		 
	}

}
