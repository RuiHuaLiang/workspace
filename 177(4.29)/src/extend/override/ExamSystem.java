package extend.override;

import java.util.Scanner;

/*
 * 
 * 1.¼���ѡ�� ¼���
 * String[]
 * ¼��𰸣�
 *   String str = sc.nextLine();
 *   A,B,C,D
 *   String[] answer = str.split(","); ���ն����и��ַ��� �����ַ�������     
 *   
 * 2.�Ƚϴ�
 *   String[] answer    CBDA    1.Ҫô����   2.Ҫô���մӴ�С��˳������
 *   String[] correct ��ABCD

 * */

public class ExamSystem {
	private Paper p ;
	
	public ExamSystem(){
		
	}
	
	public ExamSystem(Paper p) {
		this.p = p;
	}

	//¼���Ծ�
	public void inputPaper(){
		//1.¼������ѡ��
		//SingleChoice[] singles = getSingleChoices();
		Choice[] singles = getSingleChoices();
		//2.¼������ѡ��
		Choice[] mutils = getMutilChoices();
		//3.¼���Ծ�
		this.p = new Paper(singles,mutils);
	}
	
	//��ȡ�����ѡ��
	public Choice[] getSingleChoices(){
		 //1.��ȡ��ѡ��ĸ���
		 System.out.println("�����뵥ѡ��ĸ���");
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 
		 //�������浥ѡ�������
		 Choice[] singles = new Choice[num];
		 
		 for(int i =0 ; i< num ; i++){
			 //2.¼�뵥ѡ��
			 Choice single = getSingleChoice();
			 //�ѵ�ѡ�Ᵽ�浽������
			 singles[i] = single;
		 }
		 
		 return singles;
	}
	
	//��ȡ��ѡ��Ķ���
	public Choice getSingleChoice(){
		//1.��ȡ���
		System.out.println("��������:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//2.��ȡ���
		System.out.println("��������Ŀ:");
		Scanner sc1 = new Scanner(System.in);
		String question = sc1.nextLine();
		//3.��ȡ�𰸣�������
		
		//5.��ȡѡ��A B C D
		System.out.println("������Aѡ��:");
		Scanner sc3 = new Scanner(System.in);
		String A = sc3.nextLine();
		
		System.out.println("������Bѡ��:");
		Scanner sc4 = new Scanner(System.in);
		String B = sc4.nextLine();
		
		System.out.println("������Cѡ��:");
		Scanner sc5 = new Scanner(System.in);
		String C = sc5.nextLine();
		
		System.out.println("������Dѡ��:");
		Scanner sc6 = new Scanner(System.in);
		String D = sc6.nextLine();
		
		//4.��ȡ��ȷ��
		System.out.println("��������ȷ��:");
		Scanner sc2 = new Scanner(System.in);
		String correct = sc2.nextLine();
		//��ȡ����
		System.out.println("���������:");
		Scanner sc7 = new Scanner(System.in);
		int score = sc7.nextInt();
		
		//������ѡ�����
		Choice single = new SingleChoice(num,question,null,correct,A,B,C,D,score);
		return single;
	}
	
	//��ȡ�����ѡ��
	public Choice[] getMutilChoices(){
		return null;
	}
	
	
	
	//����
	public void exam(){
		//���Ծ��е���Ŀһ��һ��������� û���һ����Ŀ ����Ҫ����
		//1.���Ծ��еĵ�ѡ�����
		Choice[] singles = this.p.getSingles();
		//�������齫�����е�Ԫ�����
		for(int i =0 ;i < singles.length;i ++){
			SingleChoice single = (SingleChoice)singles[i];
			//�����ѡ��
			printSingleChoice(single);
			//����
			System.out.println("�������:");
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			//�Ѵ𰸱�������
			single.setAnswer(answer);
			singles[i] = single;
			this.p.setSingles(singles);
		}
		
		//2.���Ծ��ж�ѡ�����
		
	}
	
	//�����ѡ��
	public void printSingleChoice(SingleChoice single){
		//1.��ȡ��� �����
		int id = single.getId();
		String question = single.getQuestion();
		System.out.println(id+"."+question);
		
		//2.��ȡѡ��
		String A = single.getA();
		System.out.println(A);
		String B = single.getB();
		System.out.println(B);
		String C = single.getC();
		System.out.println(C);
		String D = single.getD();
		System.out.println(D);
		
	}
	
	//��ȡ�ɼ�
	public double score(){
		//�����Ծ��а��������е�ѡ��Ͷ�ѡ��  �Ƚ����ǵ���ȷ�� �������  Ȼ���ȡ
	    //ÿ����Ŀ�ķ�������͡�
		//1.���Ծ��еĵ�ѡ�����ȷ�𰸺�����𰸱Ƚ� 
		 Choice []  singles = this.p.getSingles();
		 
		 double score = 0.0;
		 for(int i = 0 ; i < singles.length ;  i ++){
			 SingleChoice single =(SingleChoice)singles[i];
			 //��ȡ��ȷ��
			 String correct = single.getCorrectAnswer();
			 //��ȡ�����
			 String answer = single.getAnswer();
			 
			 if(answer.equals(correct)){
				 score += single.getScore();
			 }
		 }
		
		//��ȡ��ѡ��ķ���
		
		
		return score;
	}

	public Paper getP() {
		return p;
	}

	public void setP(Paper p) {
		this.p = p;
	}
	
	
}
