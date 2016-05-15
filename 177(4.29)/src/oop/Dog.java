package oop;

public class Dog {
	private String name;//Ãû×Ö
	private String color;//Ã«É«
	public Dog() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Dog(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
}
