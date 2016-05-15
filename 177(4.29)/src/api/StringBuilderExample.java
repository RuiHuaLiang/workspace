package api;


public class StringBuilderExample {
	public static void main(String[] args) {
		//-----------创建StringBuilder的对象---------
		StringBuilder sb = new StringBuilder();   //char[] 是空的 可变
		
		//------------------StringBuilder API-----------
		System.out.println("追加方法调用之前:------"+sb+"----------");
		StringBuilder sb1 = sb.append("hello"); // char[]: hello  sb1 和sb:同一个对象
		System.out.println("追加方法调用之后:------"+sb+"----------"); //sb.toString()
		System.out.println("追加方法调用之后:sb1:------"+sb1+"----------");
		System.out.println("判断sb1和sb对象是否相等:------"+(sb1 == sb)+"----------");
		
		//插入到指定的位置  offset从0开始 
		sb.insert(0, "打印一个");
		System.out.println("插入方法调用之后:------"+sb+"----------");
		
		//删除从start到end之间的字符串 不包含end
		sb.delete(2, 4);
		System.out.println("删除方法调用之后:------"+sb+"----------");
	  //-------------------StringBuilder的方法可以连缀---
		StringBuilder sb2 = new StringBuilder();
		sb2.append("明教").append("张无忌").insert(2, "教主").delete(0, 2);
		System.out.println(sb2);
		
	 //-----------------String 与StringBuilder之间的转换-------------
		//a.将String转换成StringBuilder 
		StringBuilder sb3 = new StringBuilder("abc");
		
		//b.StringBuilder转换成String
		String s = sb3.toString();
		
	}

}
