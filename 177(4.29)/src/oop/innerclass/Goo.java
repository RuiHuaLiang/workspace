package oop.innerclass;
/*
 * Goo:外部类
 * */
public class Goo {
	static private int i = 10;  
	
	
	public static void print(){
		System.out.println("----打印方法--------");
	}
	
	public void t1(){
		System.out.println("----打印t1方法--------");
	}
	
	public void t2(){
		Foo f = new Foo();
	}
	//1.静态内部类 Foo
	public static class Foo{
		public void test(){
			System.out.println(i);//访问外部的属性
			print();  //访问外部的方法
			Goo g = new Goo();
			g.t1();
		}
		
	}
}
