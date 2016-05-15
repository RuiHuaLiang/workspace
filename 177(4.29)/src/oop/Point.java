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
	

	//�����Ķ���
	public double distance(){
		return this.distance(0, 0);
	}
	
	//�����Ķ���
	public double distance(int x, int y ){
		//this.x ��������x this.y��������y
		//x,y �Ƕ�����÷���ʱ����ʵ�ε�ֵ
		double rs = 
				Math.sqrt((this.x - x)*(this.x - x)+(this.y-y)*(this.y-y));
		return rs;
	}
	
	//�����Ķ���
    public double distance(Point p){
		    //this.x ��������x this.y��������y
			//x:p.x  y:p.y
			/*double rs = 
				Math.sqrt((this.x - p.x)*(this.x - p.x)+(this.y-p.y)*(this.y-p.y));
			return rs;*/
    	    
    	   double rs = this.distance(p.x, p.y);
    	   return rs;
	}
	
}
