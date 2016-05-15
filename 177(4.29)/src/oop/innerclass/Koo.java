package oop.innerclass;

public class Koo {
    private int m = 20;
	
	public void test(){
		//局部变量
		final int i = 10;
		
		//局部内部类  作用范围只限于当前方法中。
		class Aoo{
			public void s1(){
				//访问局部变量
				System.out.println(i);
				//访问属性
				System.out.println(m);
				
			}
		}
		
		
		Aoo a = new Aoo();
	}
}
