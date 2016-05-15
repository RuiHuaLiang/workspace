package api;

public class BoxExample {

	public static void main(String[] args) {
		
	//-----------------int不是Object的子类------------------------	
		 int i = 10;
		 /*1.i 是简单类型
		  *2.把i赋值给对象类型时， 会自动完成装箱操作
		  *3.将Integer的对象赋值给Object类型 （引用多态） 
		  * **/
		 Object o = i ;
	//----------------------装箱操作----------------
		 int  m = 10; //简单数据类型
		 //将int类型转换成对应的包装类的对象 (即Integer对象)
		 Integer  obj = new Integer(m);
		 System.out.println(obj);
		 Integer obj1 = m;   //等价于 Integer obj1 = new Integer(m);
		 System.out.println(obj1);
		 
		 Integer obj2 = 20;
		 
	//------------------拆箱操作----------------
		 Integer i1 = 30;
		 
		 /**
		  * 1.将Integer对象转化成int类型： 调用了 (int intValue()) 拆箱的方法。
		  * */
		 int  n = i1; //等价于 i1.intValue();
		 int  k = i1.intValue();
		 System.out.println("n="+n+",k="+k);
		 
		 
		 
		 
		 
	}

}
