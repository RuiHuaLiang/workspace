package exception;

import java.util.Scanner;

public class UserStart {
	public static void main(String[] agrs){
		UserSystem sys = new UserSystem();
		
		//�ӿ���̨��ȡһ���û���
		System.out.println("�������û���:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		//�ӿ���̨��ȡһ������
		System.out.println("����������:");
		Scanner sc1 = new Scanner(System.in);
		String pwd = sc1.nextLine();
		
		try {
			sys.login(name, pwd);  //��¼�ɹ�
			System.out.println("��¼�ɹ���");
		} catch (UserNameException e) {
			e.printStackTrace(); //�û�������
		} catch (PasswordException e) {
			e.printStackTrace(); //�������
		}
	}
}
