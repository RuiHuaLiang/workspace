package oop.innerclass;
/*
 * ע�⣺�����ڲ���Ķ��������� �ӿ�,������,��
 * **/
public class Roo {
	
	public void test(){
		
		//�����ڲ���
		A a = new A(){
			private int i; //����
			public void t1(){ //����
				System.out.println("---------t1����--------");
			}
		};
		
		a.t1(); //�����ĵ���
	}
	
	
	public static void main(String []args){
		Roo r = new Roo();
		r.test();
	}
}

interface A{
	public abstract void t1();
}


