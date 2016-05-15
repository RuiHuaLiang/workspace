package collection.list.snake;

import java.util.Set;

public class GamePanel {
	private Snake snake;
	private Set   beans;
	//墙
	
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
		//补充:判断destNode是否为豆子
		Node destNode = this.snake.destNode(dir);
		
		if(beans.contains(destNode)){
			this.snake.eat(destNode);
			beans.remove(destNode);
			return ;
		}
		//蛇行走并且指定了方向
		this.snake.step(dir);
		
	}
	
}
