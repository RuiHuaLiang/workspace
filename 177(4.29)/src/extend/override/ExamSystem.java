package extend.override;

import java.util.Scanner;

/*
 * 
 * 1.录入多选题 录入答案
 * String[]
 * 录入答案：
 *   String str = sc.nextLine();
 *   A,B,C,D
 *   String[] answer = str.split(","); 按照逗号切割字符串 生产字符串数组     
 *   
 * 2.比较答案
 *   String[] answer    CBDA    1.要么排序   2.要么按照从大到小的顺序输入
 *   String[] correct ：ABCD

 * */

public class ExamSystem {
	private Paper p ;
	
	public ExamSystem(){
		
	}
	
	public ExamSystem(Paper p) {
		this.p = p;
	}

	//录入试卷
	public void inputPaper(){
		//1.录入多个单选题
		//SingleChoice[] singles = getSingleChoices();
		Choice[] singles = getSingleChoices();
		//2.录入多个多选题
		Choice[] mutils = getMutilChoices();
		//3.录入试卷
		this.p = new Paper(singles,mutils);
	}
	
	//获取多个单选题
	public Choice[] getSingleChoices(){
		 //1.获取单选题的个数
		 System.out.println("请输入单选题的个数");
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 
		 //创建保存单选题的数组
		 Choice[] singles = new Choice[num];
		 
		 for(int i =0 ; i< num ; i++){
			 //2.录入单选题
			 Choice single = getSingleChoice();
			 //把单选题保存到数组中
			 singles[i] = single;
		 }
		 
		 return singles;
	}
	
	//获取单选题的对象
	public Choice getSingleChoice(){
		//1.获取编号
		System.out.println("请输入编号:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//2.获取题干
		System.out.println("请输入题目:");
		Scanner sc1 = new Scanner(System.in);
		String question = sc1.nextLine();
		//3.获取答案（不做）
		
		//5.获取选项A B C D
		System.out.println("请输入A选项:");
		Scanner sc3 = new Scanner(System.in);
		String A = sc3.nextLine();
		
		System.out.println("请输入B选项:");
		Scanner sc4 = new Scanner(System.in);
		String B = sc4.nextLine();
		
		System.out.println("请输入C选项:");
		Scanner sc5 = new Scanner(System.in);
		String C = sc5.nextLine();
		
		System.out.println("请输入D选项:");
		Scanner sc6 = new Scanner(System.in);
		String D = sc6.nextLine();
		
		//4.获取正确答案
		System.out.println("请输入正确答案:");
		Scanner sc2 = new Scanner(System.in);
		String correct = sc2.nextLine();
		//获取分数
		System.out.println("请输入分数:");
		Scanner sc7 = new Scanner(System.in);
		int score = sc7.nextInt();
		
		//创建单选题对象
		Choice single = new SingleChoice(num,question,null,correct,A,B,C,D,score);
		return single;
	}
	
	//获取多个多选题
	public Choice[] getMutilChoices(){
		return null;
	}
	
	
	
	//考试
	public void exam(){
		//将试卷中的题目一个一个的输出。 没输出一个题目 就需要作答
		//1.将试卷中的单选题输出
		Choice[] singles = this.p.getSingles();
		//遍历数组将数组中的元素输出
		for(int i =0 ;i < singles.length;i ++){
			SingleChoice single = (SingleChoice)singles[i];
			//输出单选题
			printSingleChoice(single);
			//作答
			System.out.println("请输入答案:");
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			//把答案保存起来
			single.setAnswer(answer);
			singles[i] = single;
			this.p.setSingles(singles);
		}
		
		//2.将试卷中多选题输出
		
	}
	
	//输出单选题
	public void printSingleChoice(SingleChoice single){
		//1.获取序号 和题干
		int id = single.getId();
		String question = single.getQuestion();
		System.out.println(id+"."+question);
		
		//2.获取选项
		String A = single.getA();
		System.out.println(A);
		String B = single.getB();
		System.out.println(B);
		String C = single.getC();
		System.out.println(C);
		String D = single.getD();
		System.out.println(D);
		
	}
	
	//获取成绩
	public double score(){
		//遍历试卷中包含的所有单选题和多选题  比较他们的正确答案 和作答答案  然后获取
	    //每道题目的分数，求和。
		//1.将试卷中的单选题的正确答案和作答答案比较 
		 Choice []  singles = this.p.getSingles();
		 
		 double score = 0.0;
		 for(int i = 0 ; i < singles.length ;  i ++){
			 SingleChoice single =(SingleChoice)singles[i];
			 //获取正确答案
			 String correct = single.getCorrectAnswer();
			 //获取作答答案
			 String answer = single.getAnswer();
			 
			 if(answer.equals(correct)){
				 score += single.getScore();
			 }
		 }
		
		//获取多选题的分数
		
		
		return score;
	}

	public Paper getP() {
		return p;
	}

	public void setP(Paper p) {
		this.p = p;
	}
	
	
}
