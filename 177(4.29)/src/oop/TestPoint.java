package oop;

public class TestPoint {
	public static void main(String[] args) {
		Point p2 = new Point(); 
		//������һ����
		Point p = new Point(2,3);
		
		
		//����������֮��ľ���  �����ĵ���
		/*
		 * ���ʶ���ķ����﷨�� ������.������(����);
		 * */
		double dis = p.distance(3,4);
		System.out.println(dis);
		
		
		//�����ڶ�����
		Point p1 = new Point(3,4);
		
		//����p��p1֮��ľ���
		dis = p.distance(p1);
		System.out.println(dis);
		
	
		p.distance();//����p��ԭ��֮��ľ���
		p.distance(4, 7);
		p.distance(p1);
		
		
	}
	

}
