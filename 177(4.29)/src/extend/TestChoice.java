package extend;

public class TestChoice {	
	public static  void main(String []args){
		//1.����һ����ѡ��
		SingleChoice single = 
				new SingleChoice(1,"1+1=?",null,"A","A.2","B.1","C:3","D:4",20);
		
		//2.��ѡ�����
		String[] correct =new String[]{"A"};
		MutilChoice m = 
			new MutilChoice(1,"1+1=?",null,correct,"A.2","B.1","C:3","D:4",20);
		
		
		//SingleChoice s = new SingleChoice();
		
	}
}
