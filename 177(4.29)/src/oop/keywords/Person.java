package oop.keywords;

public  class Person {
	//常量
	private final String name ="Andy";
	
	private final String a;
	
	private final  int  b = 10; //b:简单数据类型 
	
	//private final Student stu = new Student();
	
	private static String chairman ="习总书记";
	
	//静态块
	static{
		System.out.println("------静态块被加载了-----");
	}
	
	public Person(){
		System.out.println("------对象被创建了-----");
		a = "abc";
	}
	
	public final void say(){
		//b = 20;//修改的值 错误的
	//	stu.setAge(20); //stu地址不能被改变  stu所指向的对象内容是可以改变。
		//访问静态属性
		System.out.println(Person.chairman);  //类名.属性名（推荐）
		System.out.println(this.chairman);   //引用.属性名
		
		//调用静态方法
		//Person.print();
	}
	
	public static void print(){
		 System.out.println("------print是静态方法------------");
		 //this.say(); 
		 /*Person p = new Person();
		 p.say();*/
	}
}


