package extend.override;
/*
 * 多选题
 *   序号
 *   问题
 *   答案
 *   正确答案
 *   A,B,C,D
 *   分数
 * */
public class MutilChoice extends Choice{
	private String[] answer;//答案
	private String[] correctAnswer;//正确答案
	
	public MutilChoice(){
		
	}

	public MutilChoice(int id, String question, String[] answer,
			String[] correctAnswer, String a, String b, String c, String d,
			double score) {
		super(id,question,a,b,c,d,score);
		this.answer = answer;
		this.correctAnswer = correctAnswer;
	}

	public String[] getAnswer() {
		return answer;
	}

	public void setAnswer(String[] answer) {
		this.answer = answer;
	}

	public String[] getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String[] correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

		
}

