package extend;

public class Student extends Person{
	
	public void talk(){
		super.say();//super�Ƿ��ʸ��෽���Ĺؼ���
		this.test();
	}
	
	public void test(){
		System.out.println("���Է���");
	}
}
