package collection.list.snake;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class TestSnake {
	public static void main(String [] args){
		//1.����һ���������ߵ�����ڵ�
		LinkedList nodes = new LinkedList();
		//2.��ӽڵ㵽������
		nodes.add(new Node(3,1));
		nodes.add(new Node(3,2));
		nodes.add(new Node(2,2));
		nodes.add(new Node(1,2));
		//3.����һ����
		Snake snake = new Snake(nodes);
		
		/*
		 * ����:��������
		 * */
		
		HashSet beans = new HashSet();
		//i:���ӵĸ���
		//����һ�����������
		Random ran = new Random();
		for(int i = 1; i<= 5; i++){
		    //nextInt(): (0-n-1)
			/**
			 * ran.nextInt(GamePanel.COLS-1)+1 :���ӵĺ����겻�����ڱ߽���  �߽�ֵ:0|COLS
			 * ran.nextInt(GamePanel.ROWS-1)+1 :���ӵ������겻�����ڱ߽���  �߽�ֵ: 0|ROWS
			 * */
			int x = ran.nextInt(GamePanel.COLS-1)+1;
			int y = ran.nextInt(GamePanel.ROWS-1)+1;
			Node n = new Node(x,y);
			//�жϵ�ǰNode�����Ƿ�λ���ߵ�������
			if(snake.contains(x, y)){
				i -- ; //���ڴ˴�����λ���ߵ������ϣ����¶��Ӳ�����Ч�����Զ�����Ҫ��������һ�Ρ�
				continue;
			}
			beans.add(n);
		}
		
		
		
		GamePanel  panel = new GamePanel(snake,beans);
		panel.printPanel();
		
		//4.�˶�����
		while(true){
			System.out.println("��1���� [2]�� ��3���� ��4���� [-1]�˳�");
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
