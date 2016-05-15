package extend.override;

public class TestStudent {
	public static void main(String []args){
		/*
		 * 1.先调用父类的构造器
		 * 2.调用子类的构造器
		 * */
		Student stu = new Student();
		
		stu.say();
		
		
	    /*
	     * new Student()产生的是学生对象
	     * Person p: 是父类的引用
	     * 注意: Person和Student一定存在着继承关系  可以是直接的 也可以是间接的。  
	     * 
	     * 同一个引用可以指向不同的对象 是引用多态
	     * **/
		Person p = new Student();
		/*Java代码执行的过程:
		 *    a)javac:将源代码翻译成字节码。   编译过程: 检查语法  
		 *    b)java: 加载代码在堆栈处理代码。 
		 * 
		 * 动态绑定:
		 *    javac:检查语法   Person里面是否包含了say方法。  
		 *     按常理来说：java命令  p所调用的方法是 Person对象中say方法。
		      java:创建对象之后 p所指向的对象是Student类型的。 所以优先调用 Student中重写的say()方法。
		 *   
		 * **/
		p.say();
		
		
		 p = new Teacher();
		
		 
		 Student stu1 = new Student();
		 
		 Person p1 = stu1;  //隐式转换
		 
		 
		 /*
		  * 学生是人
		  * */
		 Person  p2 = new Student();
		 //强制转换
		 Student stu2 = (Student)p2;
		 
		 
		 
		 /*
		  * 错误的
		  * 注意: 强制换 转换的是类型 不是对象
		  * 所以对象必须子类的对象。
		  * */
		 Person p3 = new Person();
		/* Student stu3 = (Student)p3;
		*/ 
		 
		 /*
		  * 检查引用所指向的对象的类型
		  * */
		 boolean isPerson =  p3 instanceof Person;
		 System.out.println(isPerson);
		 
		 boolean isStudent =  p3 instanceof Student;
		 System.out.println(isStudent);
		
		 
	}
}
