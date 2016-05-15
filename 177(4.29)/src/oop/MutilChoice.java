package oop;
/*
 * 多选题
 *   序号
 *   问题
 *   答案
 *   正确答案
 *   A,B,C,D
 *   分数
 * */
public class MutilChoice {
	private int id;//序号
	private String question;//问题
	private String[] answer;//答案
	private String[] correctAnswer;//正确答案
	private String A;
	private String B;
	private String C;
	private String D;
	private double score;//分数
	
	public MutilChoice(){
		
	}

	public MutilChoice(int id, String question, String[] answer,
			String[] correctAnswer, String a, String b, String c, String d,
			double score) {
		this.id = id;
		this.question = question;
		this.answer = answer;
		this.correctAnswer = correctAnswer;
		A = a;
		B = b;
		C = c;
		D = d;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
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

	public String getA() {
		return A;
	}

	public void setA(String a) {
		A = a;
	}

	public String getB() {
		return B;
	}

	public void setB(String b) {
		B = b;
	}

	public String getC() {
		return C;
	}

	public void setC(String c) {
		C = c;
	}

	public String getD() {
		return D;
	}

	public void setD(String d) {
		D = d;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	
}

