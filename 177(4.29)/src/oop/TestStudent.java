package oop;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		System.out.println("������ɼ�:");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		//1.����һ��ѧ�� ���� 23, 88   
		Student stu = new Student("����",23,score);
		//System.out.println(stu.score);
		
		//2.����һ��ѧ�� ���� ���� ����
		Student stu1 = new Student();
		
		//ѧ������ ���� 24 89  
		/*
		 * ���⣺�û�ֱ�Ӳ��������޷���֤����ֵ��Ч��
		 *      (�û�ֱ�ӷ���������)
		 * ���˼·�� �������û�ֱ�ӷ�������
		 * 
		 * ������������÷�װ
		 * */
	/*	stu1.name ="����";
		stu1.age = 24;
		stu1.score= score;
		System.out.println(stu1.score);*/
		
		stu1.study();
		
		/*
		 * �����������
		 *    1)�����Ը�ֵ
		 *    2)��ȡ���Ե�ֵ
		 * */
		
		//ͨ��setScore�����Ը�ֵ
		stu1.setScore(score);
		
		//����getScore��ȡ���Ե�ֵ
		double s = stu1.getScore();
		System.out.println(s);
		
		
	}

}
