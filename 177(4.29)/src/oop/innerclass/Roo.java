package oop.innerclass;
/*
 * 注意：匿名内部类的定义依赖于 接口,抽象类,类
 * **/
public class Roo {
	
	public void test(){
		
		//匿名内部类
		A a = new A(){
			private int i; //属性
			public void t1(){ //方法
				System.out.println("---------t1方法--------");
			}
		};
		
		a.t1(); //方法的调用
	}
	
	
	public static void main(String []args){
		Roo r = new Roo();
		r.test();
	}
}

interface A{
	public abstract void t1();
}


