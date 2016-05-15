package extend.override;

/*
 * 单选题
 *   序号
 *   问题
 *   答案
 *   正确答案
 *   A,B,C,D
 *   分数
 * */
public class SingleChoice extends Choice{
	private String answer;//答案
	private String correctAnswer;//正确答案
	
	public SingleChoice(){
		super();//javac 阶段自动加上父类无参构造器的调用
		System.out.println("SingleChoice 无参构造方法的");
	}


	public SingleChoice(int id, String question, String answer,
			String correctAnswer, String a, String b, String c, String d,
			double score) {
		/*
		 * 实现方式有两种：
		 * 1.调用父类的构造器  super 
		 * 2.调用set方法 (不推荐)
		 * */
		super(id,question,a,b,c,d,score);
		this.answer = answer;
		this.correctAnswer = correctAnswer;
		
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public String getCorrectAnswer() {
		return correctAnswer;
	}


	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}


}
