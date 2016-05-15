package oop.interfaceclass;

/*
 * 实现接口  使用的是implements关键字
 * 
 * */
public class Mouse  implements Usb{

	@Override
	public void insertUsb() {
		System.out.println("插上鼠标");
	}

	@Override
	public void removeUsb() {
		System.out.println("移除鼠标");
	}

}
