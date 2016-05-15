package oop;

public class Person {
	private String idCard;//身份证
	private String name;//姓名
	private int  age;//年龄
	private boolean isGender;//性别
	private double salary;//薪水
	
	private Dog dog; // Dog类的变量以属性方式出现在Person类中
	
	public Person (){
		
	}
	
	public Person(String idCard,String name,int age,boolean isGender,double salary){
		this.idCard = idCard;
		this.name = name;
		this.age = age;
		this.isGender = isGender;
		this.salary = salary;
	}
	public Person(String idCard,String name,int age,boolean isGender,double salary,Dog dog){
		this.idCard = idCard;
		this.name = name;
		this.age = age;
		this.isGender = isGender;
		this.salary = salary;
		this.dog = dog;
	}
	
	
	public void setIdCard(String idCard ){
		this.idCard = idCard;
	}
	
	public String getIdCard(){
		return this.idCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return isGender;
	}

	public void setGender(boolean isGender) {
		this.isGender = isGender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
	
	
	
	
}
