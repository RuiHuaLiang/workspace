package extend.override;

import java.util.Scanner;

public class ExamStart {
	
	/*
	 * ExamSystem  �������
	 *   |-Paper : p:null  
	 * */
	static ExamSystem system = new ExamSystem();
	
	
	public static void main(String[] args) {
		for(;;){
			System.out.println("[1]¼���Ծ�  ��2������ ��3����ȡ����  ��-1���˳�");
			//1.�ӿ���̨��ȡһ���˵�
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			//2.�˳�ϵͳ
			if(menu == -1){
				System.out.println("�˳�ϵͳ");
				break;
			}
			
			//3.У��˵�
			boolean  isVal = validateMenu(menu);
			if(!isVal){
				System.out.println("�˵���Ч������������");
				continue;
			}
			
			//4.����˵�
		    proMenu(menu);
		}
	}
	
	
	public static boolean  validateMenu(int menu){
		if(menu >=1 && menu <= 3){
			return true;
		}
		return false;
	}
	public static void proMenu(int menu){
		if(menu == 1){
			//1.¼���Ծ�
			system.inputPaper();
		}else if(menu == 2){
			//2.����
			system.exam();
		}else if(menu ==3){
			//3.��ȡ����
			double score = system.score();
			System.out.println("������Գɼ�:"+score);
		}
	}
	

}
