package oop.innerclass;

public class Test {
	public static void main(String[] args){
		//创建外部类的对象
		Goo g = new Goo();
		
		
		//创建内部类的对象 Foo  静态内部类
		Goo.Foo f = new Goo.Foo();
		
		//成员内部类无法直接实例化
		//Hoo.Joo j = new Hoo.Joo();
		
		/*成员内部类通过外部类的方法间接实现实例化
		 * Hoo h = new Hoo();
		 * Joo j = h.getJoo();
		 * */
		Hoo.Joo j = new Hoo().getJoo();
	}
}
