package oop.interfaceclass;

public class TestUsb {

	public static void main(String[] args) {
		/*//��������
		Mouse m = new Mouse();
		m.insertUsb();
		m.removeUsb();
		//�ӿڶ��������ָ��ʵ����Ķ���
		Usb u = new Mouse();
		u.insertUsb();
		u.removeUsb();
		
		
		KeyBoard board = new KeyBoard();
		board.insertUsb();
		board.removeUsb();
		
		Usb u1 = new KeyBoard();
		u1.insertUsb();
		u1.removeUsb();
		
		*/
		
		Computer c = new Computer();
		Mouse m = new Mouse();
		KeyBoard board = new KeyBoard();
		
		c.insertDevice(m);
		c.insertDevice(board);
		
		c.removeDevice(m);
		c.removeDevice(board);
		
		
		
		
	}

}
