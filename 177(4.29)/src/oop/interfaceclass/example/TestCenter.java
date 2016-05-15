package oop.interfaceclass.example;

public class TestCenter {
	public static void main(String []args){
		Teacher t = new Teacher();
		
		/*
		 * Center:ColorPrinter֮��ֱ�ӹ���
		 * ����ӿڱ�̣�
		 *   Center :IPrinter֮��ֱ�ӹ���
		 *   IPrinter:ColorPrinterֱ�ӹ���
		 * 
		 * */
		//IPrinter p = new ColorPrinter();
		IPrinter p = new BlackPrinter();
		
		
		Center c = new Center();
		
		c.setPrinter(p);
		
		
		
		c.show(t); //��ӡ��Ա����Ϣ
		
		c.show(c);  //��ӡ���ĵ���Ϣ
		
		
		
		
		
	}
}
