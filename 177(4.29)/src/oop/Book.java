package oop;

public class Book {
	String name;//书名
	String author;//作者
	int bookNumber; //书号
	int number;//编号
	
	//无参构造器
	public Book(){
		
	}
	
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}


	//有参构造器
	public Book(String name,String author ,int bookNumber,int number){
		this.name= name;
		this.author= author;
		this.bookNumber = bookNumber;
		this.number = number;
	}
	

}
