package oop.abstractclass;

public class TestShape {
	public static void main(String [] args){
		//Shape s  = new Shape();  //Shape�ǳ����಻��ʵ����
		
		/*
		 * 1.���ø���Ĺ�����
		 * 2.��������Ĺ�����
		 * */
		Circle  c = new Circle(10);
		double l = c.getLen();
		System.out.println("Բ�ܳ�:"+l);
		double area = c.getArea();
		System.out.println("Բ���:"+area);
		
		Rect r  = new Rect(10,20);
		l = r.getLen();
		System.out.println("�����ܳ�:"+l);
		area = r.getArea();
		System.out.println("�������:"+area);
		
		
		Shape s = new Circle(10);
	    l = s.getLen();
		System.out.println("Բ�ܳ�:"+l);
		area = s.getArea();
		System.out.println("Բ���:"+area);
		
		Shape s1  = new Rect(10,20);
		l = s1.getLen();
		System.out.println("�����ܳ�:"+l);
		area = s1.getArea();
		System.out.println("�������:"+area);
		
		
		Graphics g = new Graphics();
		
		/*g.drawRect(r);
		g.drawCircle(c);
		*/
		g.drawShape(r);
		g.drawShape(c);
		
		FourShape f = new FourShape();
		
		g.drawShape(f);
		
		
		
		
		

	}
}
