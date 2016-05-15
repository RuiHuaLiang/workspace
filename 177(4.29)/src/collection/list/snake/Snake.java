package collection.list.snake;

import java.util.LinkedList;

public class Snake {
	

	private LinkedList nodes; //����  ����  ����Node����
	private int dir;//����
	
	
	/*
	 * ���� = Ŀ������ - ͷ������
	 * Ŀ������ = ͷ������ +����
	 * **/
	public static final int DIR_UP = -1; //�� 
	public static final int DIR_DOWN = 1; //�� 
	public static final int DIR_LFET = -10; //�� 
	public static final int DIR_RIGHT = 10; //�� 
	
	
	public Snake(){
		
	}
	
	public Snake(LinkedList nodes){
		this.nodes = nodes;
	}
	
	public Node destNode(int dir){
		//1.�����ͷ����Ŀ������    
		int  x = dir / 10;  // -1 /10 = 0 
		int  y = dir % 10;  //  -1 % 10 = -1
		//2.��ȡͷ������
		Node head = (Node)nodes.getFirst();
		
		int destX =  head.getX() + x;  //Ŀ�������x����
		int destY =  head.getY() + y;  //Ŀ�������y����
 		
		Node destNode = new Node(destX,destY);
		return destNode;
	}
	
	public void step(int dir){
		//1.��ȡǰ�з����Ŀ��ڵ�
		Node destNode = this.destNode(dir);
		//3.�ж϶������Ƿ�������
		boolean isContains = this.contains(destNode);
		if(isContains){
			throw new RuntimeException("GameOver");
		}
		
		//4.ĩβ�Ľڵ�ɾ��
		nodes.removeLast();
		//5.����ͷ�ڵ�
		nodes.addFirst(destNode);
	}
	
	public boolean contains(Node node){
		//1.��������
		/*for(int index = 0 ; index < nodes.size(); index++){
			 Node n = (Node) nodes.get(index); //Object get(int index) ͨ���±��ȡ�����еĶ���
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
