package oop;

public class Point {
	int x;
	int y;
	
	public Point(){
		
	}
	
	public Point(int x ,int y){
		this.x  = x;
		this.y  = y;
	}
	

	//方法的定义
	public double distance(){
		return this.distance(0, 0);
	}
	
	//方法的定义
	public double distance(int x, int y ){
		//this.x 代表属性x this.y代表属性y
		//x,y 是对象调用方法时传递实参的值
		double rs = 
				Math.sqrt((this.x - x)*(this.x - x)+(this.y-y)*(this.y-y));
		return rs;
	}
	
	//方法的定义
    public double distance(Point p){
		    //this.x 代表属性x this.y代表属性y
			//x:p.x  y:p.y
			/*double rs = 
				Math.sqrt((this.x - p.x)*(this.x - p.x)+(this.y-p.y)*(this.y-p.y));
			return rs;*/
    	    
    	   double rs = this.distance(p.x, p.y);
    	   return rs;
	}
	
}
