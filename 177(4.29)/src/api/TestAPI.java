package api;

import java.util.Arrays;
import java.util.Scanner;


public class TestAPI {
	public static void main(String[] args) {
		
		//------------toLowerCase ��toUpperCase  ��Сдת��------------
		String str ="ABCDEFGBCDG";
		String str1 = str;
		str = str.toLowerCase();
		System.out.println(str);
		System.out.println("�Ƚϵ�ַ:"+(str == str1));
		
		str = str.toUpperCase();
		System.out.println(str);
		
		
		//------------length�ַ����ĳ���--------------
		int length = str.length();
		System.out.println("�ַ����ĳ���"+length);
		
		//------------charAt(int index) ��ȡ�ַ�---------
		for(int index = 0 ; index < length ; index ++ ){
			char c = str.charAt(index);
			System.out.println(c);
		}
		
		//--------------int indexOf(String subStr) �����Ӵ����ַ����е�λ��------------
		String subStr =  "BC";
		
		int index = str.indexOf(subStr);
		
		System.out.println("index�±�:"+index);
				
		int secondIndex  = str.indexOf(subStr, index+1);
		System.out.println("index�±�:"+secondIndex);
		
		
		//------------------int lastIndexOf(String subStr) �������----------------------
		String subStr1 = "CF";
		int indx = str.lastIndexOf(subStr1);
		System.out.println("indx�±�:"+indx);
		
		
		//------------------String subString(int index) ��ȡ�Ӵ� indexָ��λ�� ��0��ʼ-------
		String str2 ="FG";
		//��ȡFG���ڵ�λ��Ȼ���ȡ��֮����ַ���
		index = str.indexOf(str2);
		//�������λ�ý�ȡ��Ӧ�Ӵ�
		String result = str.substring(index+str2.length());
		System.out.println("��ȡ���Ӵ�:"+result);
		
		//----String substring(int index,int end) ��ȡ�Ӵ���index��ʼ��end�������Ӵ�------
		
		String str3="EF";
		index = str.indexOf(str3);
		
		int begin = index+str3.length();
		result = str.substring(begin,begin+2);
		System.out.println("��ȡ���Ӵ�:"+result);
		
		
		//---------------�ַ�������ַ���֮���ת��-------------
		//���ַ���ת��������
		char[] arr = str.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		
		//������ת�����ַ���
		String str5 = new String(arr);
		System.out.println(str5);
		
		//-------------------match ƥ���ַ���---------------
		 //String str9 = "abc";
		 /*Scanner sc = new Scanner(System.in);
		 System.out.println("�������ַ���:");
		 String str9 = sc.nextLine();
		 boolean isSuccess = str9.matches("bc");
		 System.out.println("ƥ��Ľ����"+isSuccess);*/
		 
       //-----------------�и��ַ���split--------------------------	
		 /*Scanner sc1 = new Scanner(System.in);
		 System.out.println("�������ַ���:");
		 String str10 = sc1.nextLine();
		 String rs[] = str10.split("b");
		 System.out.println("�и�Ľ��Ϊ:"+Arrays.toString(rs));
*/		 
	   //----------------replaceAll�滻�ַ���-------------------------------
		 /*Scanner sc1 = new Scanner(System.in);
		 System.out.println("�������ַ���:");
		 String str10 = sc1.nextLine();
		 String rs = str10.replaceAll("bc", "**");
		 System.out.println("�и�Ľ��Ϊ:"+rs);*/
		 
	  //--------------------startWithƥ���ַ�����ʲô��ͷ---------
		 String prefix = "abc";
		 String str11 = "abddefg";
		 boolean isStart = str11.startsWith(prefix);		 
		 System.out.println("isStart:"+isStart);
	   
	}

}
