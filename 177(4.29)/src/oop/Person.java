package oop;

public class Person {
	private String idCard;//���֤
	private String name;//����
	private int  age;//����
	private boolean isGender;//�Ա�
	private double salary;//нˮ
	
	private Dog dog; // Dog��ı��������Է�ʽ������Person����
	
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
