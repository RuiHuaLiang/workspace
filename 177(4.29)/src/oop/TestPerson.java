package oop;

public class TestPerson {
	public static void main(String[] args){
		Dog dog = new Dog("С��","��ɫ");

		Person person  = new Person("007","С��",20,true,2000);
		
		//����Person��Dog֮���ϵ
		person.setDog(dog);
		
		
	}
}
