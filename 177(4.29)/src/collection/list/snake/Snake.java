package collection.list.snake;

import java.util.LinkedList;

public class Snake {
	

	private LinkedList nodes; //身体  链表  内容Node对象
	private int dir;//方向
	
	
	/*
	 * 方向 = 目标坐标 - 头部坐标
	 * 目标坐标 = 头部坐标 +方向
	 * **/
	public static final int DIR_UP = -1; //上 
	public static final int DIR_DOWN = 1; //下 
	public static final int DIR_LFET = -10; //左 
	public static final int DIR_RIGHT = 10; //右 
	
	
	public Snake(){
		
	}
	
	public Snake(LinkedList nodes){
		this.nodes = nodes;
	}
	
	public Node destNode(int dir){
		//1.计算出头部的目标坐标    
		int  x = dir / 10;  // -1 /10 = 0 
		int  y = dir % 10;  //  -1 % 10 = -1
		//2.获取头部坐标
		Node head = (Node)nodes.getFirst();
		
		int destX =  head.getX() + x;  //目标坐标的x坐标
		int destY =  head.getY() + y;  //目标坐标的y坐标
 		
		Node destNode = new Node(destX,destY);
		return destNode;
	}
	
	public void step(int dir){
		//1.获取前行方向的目标节点
		Node destNode = this.destNode(dir);
		//3.判断都坐标是否是身体
		boolean isContains = this.contains(destNode);
		if(isContains){
			throw new RuntimeException("GameOver");
		}
		
		//4.末尾的节点删除
		nodes.removeLast();
		//5.增加头节点
		nodes.addFirst(destNode);
	}
	
	public boolean contains(Node node){
		//1.遍历集合
		/*for(int index = 0 ; index < nodes.size(); index++){
			 Node n = (Node) nodes.get(index); //Object get(int index) 通过下标获取集合中的对象
			 if(node.equals(n)){
				 return true;
			 }
		}*/
		for(Object obj : nodes){
			Node n = (Node)obj;
			if(node.equals(n)){
				return true;
			}
		}
		
		return false;
	}
	
	public boolean contains(int x, int y ){
		Node node = new Node(x,y);
		return this.contains(node);
	}
	@Override
	public String toString() {
		return "Snake ["+nodes+"]";
	}
	
	public void eat(Node node){
		nodes.addFirst(node);
	}
	
}
