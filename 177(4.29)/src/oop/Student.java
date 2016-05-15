package oop;

public class Student {
	 private String name;//姓名
	 private int age;//年龄
	 private double score;//成绩
	 
	 public Student(){
		 
	 }

	 public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	 }
	
	
	 public void study(){
		 System.out.println("正在学习....");
	 }
	 
	 
	 //提供方法来实现取值和赋值
	 
	 //1.赋值
	 public void  setScore(double score){
		 this.score = 10;
	 }
	 
	 //2.取值
	 public double getScore(){
		 return this.score;
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
	 
	 
	 
}
