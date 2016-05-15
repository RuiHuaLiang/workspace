package homework;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
	private ArrayList pokers; 
	
	
	public PokerGame(){
		this.createPokers();
	}
	
	//1.创建牌
	public void createPokers(){
		//1.创建数组保存常量
		String [] nums = {Poker.NUM_ACER,Poker.NUM_TWO,Poker.NUM_THREE,Poker.NUM_FOUR,
				          Poker.NUM_FIVE,Poker.NUM_SIX,Poker.NUM_SEVEN,Poker.NUM_EIGHT,
				          Poker.NUM_NINE,Poker.NUM_TEN,Poker.NUM_JACK,Poker.NUM_QUEEN,
				          Poker.NUM_KING};
		String [] colors = {Poker.COLOR_RED,Poker.COLOR_BLACK,Poker.COLOR_BLOCK,Poker.COLOR_CLUB};
		
		//2.创建集合保存牌
		pokers = new  ArrayList();
		
		for(int j = 0 ; j < colors.length ; j++){
			for(int i = 0 ; i < nums.length ; i++){
				 String num = nums[i];
				 String color = colors[j];
				 //创建扑克对象
				 Poker p = new Poker(num,color);
				 //将扑克对象保存在集合中
				 pokers.add(p);
			}
		}
		
		pokers.add(new Poker(Poker.NUM_RED_KING,null));
		pokers.add(new Poker(Poker.NUM_BLACK_KING,null));
		
	}
	//2.洗牌
	public void randomPokers(){
		Collections.shuffle(pokers); //洗牌
	}
	
    //3.发牌
	
}
