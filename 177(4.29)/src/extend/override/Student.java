package extend.override;

/**
 * Student是子类
 * */
public class Student extends Person{
	public Student(){
		
	}
	
	/*
	 * 重写
	 * */
	public void say(){
		System.out.println("特二");
	}
	
	
	public void study(String bookName){
		System.out.println("学习"+bookName);
	}
}
