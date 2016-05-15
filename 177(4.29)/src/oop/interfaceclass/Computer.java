package oop.interfaceclass;

public class Computer {
	
	
	/*
	 * µçÄÔ²Ù×÷Êó±ê
	 * **/
	/*public void insertDevice(Mouse mouse){
		mouse.insertUsb();
	}
	
	public void removeDevice(Mouse mouse){
		mouse.removeUsb();
	}
	
	public void insertDevice(KeyBoard board){
		board.insertUsb();
	}
	
	public void removeDevice(KeyBoard board){
		board.removeUsb();
	}*/
	
	public void removeDevice(Usb usb){
		usb.removeUsb();
	}
	
	public void insertDevice(Usb usb){
		usb.insertUsb();
	}


}
