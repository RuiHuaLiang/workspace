package extend;

public class Choice {
	private int id;//序号
	private String question;//问题
	private String A;
	private String B;
	private String C;
	private String D;
	private double score;//分数
	
	public Choice(){
		System.out.println("Choice 无参构造方法的调用");
	}

	public Choice(int id, String question, String a, String b, String c,
			String d, double score) {
		this.id = id;
		this.question = question;
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
