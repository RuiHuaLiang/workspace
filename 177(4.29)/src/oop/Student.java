package oop;

public class Student {
	 private String name;//����
	 private int age;//����
	 private double score;//�ɼ�
	 
	 public Student(){
		 
	 }

	 public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	 }
	
	
	 public void study(){
		 System.out.println("����ѧϰ....");
	 }
	 
	 
	 //�ṩ������ʵ��ȡֵ�͸�ֵ
	 
	 //1.��ֵ
	 public void  setScore(double score){
		 this.score = 10;
	 }
	 
	 //2.ȡֵ
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
