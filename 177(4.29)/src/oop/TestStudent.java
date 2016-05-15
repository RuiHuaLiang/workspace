package oop;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		System.out.println("请输入成绩:");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		//1.创建一个学生 张三 23, 88   
		Student stu = new Student("张三",23,score);
		//System.out.println(stu.score);
		
		//2.创建一个学生 姓名 年龄 分数
		Student stu1 = new Student();
		
		//学生姓名 李四 24 89  
		/*
		 * 问题：用户直接操作属性无法保证属性值有效？
		 *      (用户直接访问了属性)
		 * 解决思路： 不允许用户直接访问属性
		 * 
		 * 解决方案：采用封装
		 * */
	/*	stu1.name ="李四";
		stu1.age = 24;
		stu1.score= score;
		System.out.println(stu1.score);*/
		
		stu1.study();
		
		/*
		 * 对象访问属性
		 *    1)给属性赋值
		 *    2)获取属性的值
		 * */
		
		//通过setScore给属性赋值
		stu1.setScore(score);
		
		//访问getScore获取属性的值
		double s = stu1.getScore();
		System.out.println(s);
		
		
	}

}
