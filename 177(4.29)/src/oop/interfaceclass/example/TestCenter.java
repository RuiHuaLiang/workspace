package oop.interfaceclass.example;

public class TestCenter {
	public static void main(String []args){
		Teacher t = new Teacher();
		
		/*
		 * Center:ColorPrinter之间直接关联
		 * 面向接口编程：
		 *   Center :IPrinter之间直接关联
		 *   IPrinter:ColorPrinter直接关联
		 * 
		 * */
		//IPrinter p = new ColorPrinter();
		IPrinter p = new BlackPrinter();
		
		
		Center c = new Center();
		
		c.setPrinter(p);
		
		
		
		c.show(t); //打印教员的信息
		
		c.show(c);  //打印中心的信息
		
		
		
		
		
	}
}
