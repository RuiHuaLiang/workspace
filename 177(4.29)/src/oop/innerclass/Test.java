package oop.innerclass;

public class Test {
	public static void main(String[] args){
		//�����ⲿ��Ķ���
		Goo g = new Goo();
		
		
		//�����ڲ���Ķ��� Foo  ��̬�ڲ���
		Goo.Foo f = new Goo.Foo();
		
		//��Ա�ڲ����޷�ֱ��ʵ����
		//Hoo.Joo j = new Hoo.Joo();
		
		/*��Ա�ڲ���ͨ���ⲿ��ķ������ʵ��ʵ����
		 * Hoo h = new Hoo();
		 * Joo j = h.getJoo();
		 * */
		Hoo.Joo j = new Hoo().getJoo();
	}
}
