package oop.innerclass;
/*
 * Goo:�ⲿ��
 * */
public class Goo {
	static private int i = 10;  
	
	
	public static void print(){
		System.out.println("----��ӡ����--------");
	}
	
	public void t1(){
		System.out.println("----��ӡt1����--------");
	}
	
	public void t2(){
		Foo f = new Foo();
	}
	//1.��̬�ڲ��� Foo
	public static class Foo{
		public void test(){
			System.out.println(i);//�����ⲿ������
			print();  //�����ⲿ�ķ���
			Goo g = new Goo();
			g.t1();
		}
		
	}
}
