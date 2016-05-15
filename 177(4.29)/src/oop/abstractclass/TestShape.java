package oop.abstractclass;

public class TestShape {
	public static void main(String [] args){
		//Shape s  = new Shape();  //Shape是抽象类不能实例化
		
		/*
		 * 1.调用父类的构造器
		 * 2.调用子类的构造器
		 * */
		Circle  c = new Circle(10);
		double l = c.getLen();
		System.out.println("圆周长:"+l);
		double area = c.getArea();
		System.out.println("圆面积:"+area);
		
		Rect r  = new Rect(10,20);
		l = r.getLen();
		System.out.println("矩形周长:"+l);
		area = r.getArea();
		System.out.println("矩形面积:"+area);
		
		
		Shape s = new Circle(10);
	    l = s.getLen();
		System.out.println("圆周长:"+l);
		area = s.getArea();
		System.out.println("圆面积:"+area);
		
		Shape s1  = new Rect(10,20);
		l = s1.getLen();
		System.out.println("矩形周长:"+l);
		area = s1.getArea();
		System.out.println("矩形面积:"+area);
		
		
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
