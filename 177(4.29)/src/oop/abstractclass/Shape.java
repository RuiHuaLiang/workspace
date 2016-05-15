package oop.abstractclass;
/*
 * abstract修饰类 :抽象类
 *        修饰方法:抽象方法
 * **/
public abstract class Shape {
	
	public Shape(){}  //必须声明无参构造器
	
	
	//1.求周长的方法
	public abstract double getLen();
	//2.求面积的方法
	public  abstract double getArea();
}
