package extend;

import java.util.Arrays;

public class TestExam {

	public static void main(String[] args) {
	     //1.��ȡSingleChoice����
		 SingleChoice single = createSingleChoice();
		 SingleChoice single1 = createSingleChoice();
		  
		 //2.����SingleChoice[]
		 SingleChoice[] singles ={single,single1};
		 
		 
		 //3.����MutilChoice����
		 MutilChoice m = createMutiChoice();
		 MutilChoice m1 = createMutiChoice();
		 
		 //4.����MutilChoice����
		 MutilChoice[] mutils = {m,m1};
		 
		 //5.�����Ծ�
		 Paper  p = new Paper(singles,mutils);
		 
		 //6.��������ϵͳ
		 ExamSystem exam = new ExamSystem(p);
		 
		 
	}

	public static MutilChoice createMutiChoice(){
		   //��һ������ȡ����ֵ
			//1.��ȡ��ѡ����
			int id  =1 ;
		   //2.��ȡ���
			String question = "1. Java���ص�";
		   //3.��ȡABCDѡ��
			String A = "A.��";
			String B = "B.��ƽ̨";
			String C = "C.�������";
			String D = "D.��̬";

		   //4.��ȡ��ȷ��
			String[] correct ={ "A","B"};
		   //5.����
		    double score = 4;
		    
		   //�ڶ�������MutilChoice����
		    MutilChoice mutil = 
		    		new MutilChoice(id,question,null,correct,A,B,C,D,score);
		    return mutil;
	}

	
	public static SingleChoice createSingleChoice(){
		   //��һ������ȡ����ֵ
			//1.��ȡ��ѡ����
			int id  =1 ;
		   //2.��ȡ���
			String question = "1. 1+1=( )";
		   //3.��ȡABCDѡ��
			String A = "A.1";
			String B = "B.2";
			String C = "C.3";
			String D = "D.4";

		   //4.��ȡ��ȷ��
			String correct = "B";
		   //5.����
		    double score = 2;
		    
		   //�ڶ�������SingleChoice����
		    SingleChoice single = 
		    		new SingleChoice(id,question,A,B,C,D,correct,null,score);
		    return single;
	}
	
}
