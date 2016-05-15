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
public class SingleChoice extends Choice{
	private String answer;//��
	private String correctAnswer;//��ȷ��
	
	public SingleChoice(){
		super();//javac �׶��Զ����ϸ����޲ι������ĵ���
		System.out.println("SingleChoice �޲ι��췽����");
	}


	public SingleChoice(int id, String question, String answer,
			String correctAnswer, String a, String b, String c, String d,
			double score) {
		/*
		 * ʵ�ַ�ʽ�����֣�
		 * 1.���ø���Ĺ�����  super 
		 * 2.����set���� (���Ƽ�)
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
