package oop;

public class TestPerson {
	public static void main(String[] args){
		Dog dog = new Dog("小黑","白色");

		Person person  = new Person("007","小明",20,true,2000);
		
		//建立Person与Dog之间关系
		person.setDog(dog);
		
		
	}
}
