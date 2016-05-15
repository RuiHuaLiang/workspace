package extend;

public class Student extends Person{
	
	public void talk(){
		super.say();//super是访问父类方法的关键字
		this.test();
	}
	
	public void test(){
		System.out.println("测试方法");
	}
}
