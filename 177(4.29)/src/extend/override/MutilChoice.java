package extend.override;
/*
 * ��ѡ��
 *   ���
 *   ����
 *   ��
 *   ��ȷ��
 *   A,B,C,D
 *   ����
 * */
public class MutilChoice extends Choice{
	private String[] answer;//��
	private String[] correctAnswer;//��ȷ��
	
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

