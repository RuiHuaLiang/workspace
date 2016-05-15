package oop.abstractclass;

public class Rect extends Shape {
	private int height;
	private int width;
	
	
	
	
	
	public Rect() {
	}

	public Rect(int height, int width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double getLen() {
		return 2*(width+height);
	}

	@Override
	public double getArea() {
		return width*height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	
	
}
