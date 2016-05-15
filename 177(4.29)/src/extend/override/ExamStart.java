package extend.override;

import java.util.Scanner;

public class ExamStart {
	
	/*
	 * ExamSystem  对象存在
	 *   |-Paper : p:null  
	 * */
	static ExamSystem system = new ExamSystem();
	
	
	public static void main(String[] args) {
		for(;;){
			System.out.println("[1]录入试卷  【2】考试 【3】获取分数  【-1】退出");
			//1.从控制台获取一个菜单
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			//2.退出系统
			if(menu == -1){
				System.out.println("退出系统");
				break;
			}
			
			//3.校验菜单
			boolean  isVal = validateMenu(menu);
			if(!isVal){
				System.out.println("菜单无效，请重新输入");
				continue;
			}
			
			//4.处理菜单
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
			//1.录入试卷
			system.inputPaper();
		}else if(menu == 2){
			//2.考试
			system.exam();
		}else if(menu ==3){
			//3.获取分数
			double score = system.score();
			System.out.println("输出考试成绩:"+score);
		}
	}
	

}
