package extend;

import java.util.Arrays;

public class TestExam {

	public static void main(String[] args) {
	     //1.获取SingleChoice对象
		 SingleChoice single = createSingleChoice();
		 SingleChoice single1 = createSingleChoice();
		  
		 //2.创建SingleChoice[]
		 SingleChoice[] singles ={single,single1};
		 
		 
		 //3.创建MutilChoice对象
		 MutilChoice m = createMutiChoice();
		 MutilChoice m1 = createMutiChoice();
		 
		 //4.创建MutilChoice数组
		 MutilChoice[] mutils = {m,m1};
		 
		 //5.创建试卷
		 Paper  p = new Paper(singles,mutils);
		 
		 //6.创建考试系统
		 ExamSystem exam = new ExamSystem(p);
		 
		 
	}

	public static MutilChoice createMutiChoice(){
		   //第一步：获取属性值
			//1.获取单选题编号
			int id  =1 ;
		   //2.获取题干
			String question = "1. Java的特点";
		   //3.获取ABCD选项
			String A = "A.简单";
			String B = "B.跨平台";
			String C = "C.面向过程";
			String D = "D.动态";

		   //4.获取正确答案
			String[] correct ={ "A","B"};
		   //5.分数
		    double score = 4;
		    
		   //第二步创建MutilChoice对象
		    MutilChoice mutil = 
		    		new MutilChoice(id,question,null,correct,A,B,C,D,score);
		    return mutil;
	}

	
	public static SingleChoice createSingleChoice(){
		   //第一步：获取属性值
			//1.获取单选题编号
			int id  =1 ;
		   //2.获取题干
			String question = "1. 1+1=( )";
		   //3.获取ABCD选项
			String A = "A.1";
			String B = "B.2";
			String C = "C.3";
			String D = "D.4";

		   //4.获取正确答案
			String correct = "B";
		   //5.分数
		    double score = 2;
		    
		   //第二步创建SingleChoice对象
		    SingleChoice single = 
		    		new SingleChoice(id,question,A,B,C,D,correct,null,score);
		    return single;
	}
	
}
