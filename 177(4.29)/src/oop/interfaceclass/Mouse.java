package oop.interfaceclass;

/*
 * ʵ�ֽӿ�  ʹ�õ���implements�ؼ���
 * 
 * */
public class Mouse  implements Usb{

	@Override
	public void insertUsb() {
		System.out.println("�������");
	}

	@Override
	public void removeUsb() {
		System.out.println("�Ƴ����");
	}

}
