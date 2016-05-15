package collection.list.snake;

import java.util.Set;

public class GamePanel {
	private Snake snake;
	private Set   beans;
	//ǽ
	
	public final static int ROWS = 10;
	public final static int COLS = 20;
	
	public GamePanel(Snake snake,Set beans){
		this.snake = snake;
		this.beans = beans;
	}

	public void printPanel(){
		for(int i = 0; i <=ROWS; i++){
			for(int j = 0 ; j <= COLS; j++){
				if( i == 0 || i == ROWS){
					System.out.print("-");
				}else if(j ==0 || j == COLS){
					System.out.print("|");
				}else if(snake.contains(j,i)){
					System.out.print("#");
				}else if(beans.contains(new Node(j,i))){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void run(int dir){
		//����:�ж�destNode�Ƿ�Ϊ����
		Node destNode = this.snake.destNode(dir);
		
		if(beans.contains(destNode)){
			this.snake.eat(destNode);
			beans.remove(destNode);
			return ;
		}
		//�����߲���ָ���˷���
		this.snake.step(dir);
		
	}
	
}
