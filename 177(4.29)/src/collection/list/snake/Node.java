package collection.list.snake;

public class Node {
	
	
	private int x; 
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Node(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
	    if(obj instanceof Node){
	    	 Node node = (Node)obj;
	    	 return node.x == this.x && node.y == this.y;
	    }
	    return false;
	}
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
	
}
