package oop.innerclass;

public class Koo {
    private int m = 20;
	
	public void test(){
		//�ֲ�����
		final int i = 10;
		
		//�ֲ��ڲ���  ���÷�Χֻ���ڵ�ǰ�����С�
		class Aoo{
			public void s1(){
				//���ʾֲ�����
				System.out.println(i);
				//��������
				System.out.println(m);
				
			}
		}
		
		
		Aoo a = new Aoo();
	}
}
