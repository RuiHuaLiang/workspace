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
	 * ��final���εķ���������д
	 * public void say(){
		
	}*/
	
	public void print (final int a){
		//a = 20;
		
		System.out.println("a="+a);
		
		final int b = 20; //���ξֲ�����
		
		class A{
			public void test(){
				System.out.println(b);
			}
		}
	}
	
	
}
