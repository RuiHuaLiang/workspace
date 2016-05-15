package api;

public class TestString {
	final static String ONE ="c";
	public static void main(String []args){
		//1.创建一个字符串 str:String    "abc" 字符串的字面量: String
		String str = "abc";
		System.out.println(str.hashCode());
		
		String str4= str; //str4 地址就是str的地址
		str = str.concat("c");  //concat(): 字符串连接: abcc String对象的内容不可变  必须也只能创建一个新的对象
		
		//判断str4的地址和str的地址是否相等
		System.out.println(str4 == str);
		
		
		//------------String创建对象的方式-----------------
		String str2  = new String("abcdef"); //等价于 String str2 = "abcdef";
		
		//优化之后的"abc"保存在常量池中
		String str3 ="abc";
		String str31 ="a"+"bc";
		System.out.println("str3和str31比较:"+(str3==str31));
		
		String str32 = "ab"+"c";
		System.out.println("str3和str32比较:"+(str3==str32));
		
		String str33 ="a" +"b"+"c";
		System.out.println("str3和str32比较:"+(str3==str33));
		
		String str34 = "a"+"b"+ONE;
		System.out.println("str3和str32比较:"+(str3==str34));
		
		String str21 = "ab";
		String str35 = str21 + "c"; //存在变量所以不能被优化成"abc"
		System.out.println("str3和str32比较:"+(str3==str35));
		
		
		
	}
}
