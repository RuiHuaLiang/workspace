package homework;

public class PersonTest {
	public static void main(String[] args){
		//1.����һ��Person����
		Person lucy  = new Person("lucy",Person.MALE,23,Person.IS_SINGLE,null);
		Person lily  = new Person("lily",Person.FMALE,20,Person.IS_MARRIED,null);
		
		//2.�ж����������Ƿ���Խ��
		int result = lucy.marryWith(lily);
		
		//3.������
		if(result == Person.AGE_SMALLER){
			System.out.println("���䲻����");
		}
		
		if(result  == Person.GENDER_SAME){
			System.out.println("����");
		}
		
		if(result == Person.MARRIED){
			System.out.println("С��");
		}
		
		if(result == Person.SUCCESS_MARRY){
			System.out.println("��ϲ: "+lucy.getName()+"��"+lily.getName()+"���ɹ�!");
			//������ż ���Ƿ����״ֵ̬
			lucy.setP(lily);
			lucy.setMarry(Person.IS_MARRIED);
			
			lily.setP(lucy);
			lily.setMarry(Person.IS_MARRIED);
		}
		
	}
}	
