package oop;

public class Book {
	String name;//����
	String author;//����
	int bookNumber; //���
	int number;//���
	
	//�޲ι�����
	public Book(){
		
	}
	
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}


	//�вι�����
	public Book(String name,String author ,int bookNumber,int number){
		this.name= name;
		this.author= author;
		this.bookNumber = bookNumber;
		this.number = number;
	}
	

}
