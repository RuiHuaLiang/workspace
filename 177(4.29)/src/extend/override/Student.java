package extend.override;

/**
 * Student������
 * */
public class Student extends Person{
	public Student(){
		
	}
	
	/*
	 * ��д
	 * */
	public void say(){
		System.out.println("�ض�");
	}
	
	
	public void study(String bookName){
		System.out.println("ѧϰ"+bookName);
	}
}
