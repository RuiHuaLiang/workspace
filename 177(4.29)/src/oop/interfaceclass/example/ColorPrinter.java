package oop.interfaceclass.example;

public class ColorPrinter implements IPrinter {

	@Override
	public void print(String msg) {
		System.out.println(msg);
	}

}
