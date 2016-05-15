package api;

import java.util.Arrays;
import java.util.Scanner;


public class TestAPI {
	public static void main(String[] args) {
		
		//------------toLowerCase 和toUpperCase  大小写转换------------
		String str ="ABCDEFGBCDG";
		String str1 = str;
		str = str.toLowerCase();
		System.out.println(str);
		System.out.println("比较地址:"+(str == str1));
		
		str = str.toUpperCase();
		System.out.println(str);
		
		
		//------------length字符串的长度--------------
		int length = str.length();
		System.out.println("字符串的长度"+length);
		
		//------------charAt(int index) 获取字符---------
		for(int index = 0 ; index < length ; index ++ ){
			char c = str.charAt(index);
			System.out.println(c);
		}
		
		//--------------int indexOf(String subStr) 查找子串在字符串中的位置------------
		String subStr =  "BC";
		
		int index = str.indexOf(subStr);
		
		System.out.println("index下标:"+index);
				
		int secondIndex  = str.indexOf(subStr, index+1);
		System.out.println("index下标:"+secondIndex);
		
		
		//------------------int lastIndexOf(String subStr) 反向查找----------------------
		String subStr1 = "CF";
		int indx = str.lastIndexOf(subStr1);
		System.out.println("indx下标:"+indx);
		
		
		//------------------String subString(int index) 截取子串 index指定位置 从0开始-------
		String str2 ="FG";
		//获取FG所在的位置然后截取它之后的字符串
		index = str.indexOf(str2);
		//根据这个位置截取对应子串
		String result = str.substring(index+str2.length());
		System.out.println("截取的子串:"+result);
		
		//----String substring(int index,int end) 截取子串从index开始到end结束的子串------
		
		String str3="EF";
		index = str.indexOf(str3);
		
		int begin = index+str3.length();
		result = str.substring(begin,begin+2);
		System.out.println("截取的子串:"+result);
		
		
		//---------------字符数组和字符串之间的转换-------------
		//把字符串转换成数组
		char[] arr = str.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		
		//把数组转换成字符串
		String str5 = new String(arr);
		System.out.println(str5);
		
		//-------------------match 匹配字符串---------------
		 //String str9 = "abc";
		 /*Scanner sc = new Scanner(System.in);
		 System.out.println("请输入字符串:");
		 String str9 = sc.nextLine();
		 boolean isSuccess = str9.matches("bc");
		 System.out.println("匹配的结果："+isSuccess);*/
		 
       //-----------------切割字符串split--------------------------	
		 /*Scanner sc1 = new Scanner(System.in);
		 System.out.println("请输入字符串:");
		 String str10 = sc1.nextLine();
		 String rs[] = str10.split("b");
		 System.out.println("切割的结果为:"+Arrays.toString(rs));
*/		 
	   //----------------replaceAll替换字符串-------------------------------
		 /*Scanner sc1 = new Scanner(System.in);
		 System.out.println("请输入字符串:");
		 String str10 = sc1.nextLine();
		 String rs = str10.replaceAll("bc", "**");
		 System.out.println("切割的结果为:"+rs);*/
		 
	  //--------------------startWith匹配字符串以什么开头---------
		 String prefix = "abc";
		 String str11 = "abddefg";
		 boolean isStart = str11.startsWith(prefix);		 
		 System.out.println("isStart:"+isStart);
	   
	}

}
