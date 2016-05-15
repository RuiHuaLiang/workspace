package oop.interfaceclass;

public class KeyBoard  implements  Usb{

	@Override
	public void insertUsb() {
		System.out.println("²åÈë¼üÅÌ");
	}

	@Override
	public void removeUsb() {
		System.out.println("ÒÆ³ı¼üÅÌ");
	}
	

}
