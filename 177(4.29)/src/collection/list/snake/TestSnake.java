package collection.list.snake;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class TestSnake {
	public static void main(String [] args){
		//1.创建一个链表保存蛇的身体节点
		LinkedList nodes = new LinkedList();
		//2.添加节点到集合中
		nodes.add(new Node(3,1));
		nodes.add(new Node(3,2));
		nodes.add(new Node(2,2));
		nodes.add(new Node(1,2));
		//3.创建一条蛇
		Snake snake = new Snake(nodes);
		
		/*
		 * 补充:创建豆子
		 * */
		
		HashSet beans = new HashSet();
		//i:豆子的个数
		//创建一个随机数对象
		Random ran = new Random();
		for(int i = 1; i<= 5; i++){
		    //nextInt(): (0-n-1)
			/**
			 * ran.nextInt(GamePanel.COLS-1)+1 :豆子的横坐标不出现在边界上  边界值:0|COLS
			 * ran.nextInt(GamePanel.ROWS-1)+1 :豆子的纵坐标不出现在边界上  边界值: 0|ROWS
			 * */
			int x = ran.nextInt(GamePanel.COLS-1)+1;
			int y = ran.nextInt(GamePanel.ROWS-1)+1;
			Node n = new Node(x,y);
			//判断当前Node对象是否位于蛇的身体中
			if(snake.contains(x, y)){
				i -- ; //由于此次坐标位于蛇的身体上，导致豆子产生无效。所以豆子需要重新在来一次。
				continue;
			}
			beans.add(n);
		}
		
		
		
		GamePanel  panel = new GamePanel(snake,beans);
		panel.printPanel();
		
		//4.运动起来
		while(true){
			System.out.println("【1】上 [2]下 【3】左 【4】右 [-1]退出");
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			
			
			if(menu == 1){
				panel.run(Snake.DIR_UP);
			}else if(menu == 2){
				panel.run(Snake.DIR_DOWN);					
			}else if(menu == 3){				
				panel.run(Snake.DIR_LFET);								
			}else if(menu ==4){
				panel.run(Snake.DIR_RIGHT);								
			}else{
				break;
			}
			//System.out.println(snake);
			panel.printPanel();
		}
	}
	
	
}
