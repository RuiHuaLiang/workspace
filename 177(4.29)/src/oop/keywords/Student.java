package oop.keywords;


public class Student extends Person {
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;
	
	
	/*
	 * 被final修饰的方法不能重写
	 * public void say(){
		
	}*/
	
	public void print (final int a){
		//a = 20;
		
		System.out.println("a="+a);
		
		final int b = 20; //修饰局部变量
		
		class A{
			public void test(){
				System.out.println(b);
			}
		}
	}
	
	
}
