package oop.innerclass;

public class Hoo {
	private int i = 10;
	private static int j = 20;
	public void t1(){
		System.out.println("--------t1-------");
	}
	
	public Joo getJoo(){
		return new Joo();
	}
	
	//成员内部类
	public class Joo extends Too{
		public void print(){
			System.out.println(Hoo.this.i);
			System.out.println(i+j);
			t1();
			Hoo.this.t1();
		}
		
		public void t3(){
			
		}
	}
	
	public abstract class Too{
		public abstract void t3();
	}
	
	
}
