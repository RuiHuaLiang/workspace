package oop;

public class TestPoint {
	public static void main(String[] args) {
		Point p2 = new Point(); 
		//创建第一个点
		Point p = new Point(2,3);
		
		
		//计算两个点之间的距离  方法的调用
		/*
		 * 访问对象的方法语法： 对象名.方法名(参数);
		 * */
		double dis = p.distance(3,4);
		System.out.println(dis);
		
		
		//创建第二个点
		Point p1 = new Point(3,4);
		
		//计算p和p1之间的距离
		dis = p.distance(p1);
		System.out.println(dis);
		
	
		p.distance();//计算p与原点之间的距离
		p.distance(4, 7);
		p.distance(p1);
		
		
	}
	

}
