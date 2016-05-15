package oop.abstractclass;

public  class Circle extends Shape {
    private int r; 
    
    
    public Circle() {
    	//super(0);//javac 自动加上
    }
	public Circle(int r) {
		//super(0); //javac自动加上
		System.out.println("---Circle-----");
		this.r = r;
	}

	@Override
	public double getLen() {
		return 3.14*2*r;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14*r*r;
	}

	

}
