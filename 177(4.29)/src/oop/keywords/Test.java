package oop.keywords;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Student stu = new Student();
		stu.print(10);
		String str = "abc";*/
		
		
		//Person.print(); //静态方法的直接使用类名调用，无需创建对象 （推荐）
		Person p = new Person();
		Person p1 = new Person();
		//p.print();  //引用访问静态方法
	}

}
