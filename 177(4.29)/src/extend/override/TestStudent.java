package extend.override;

public class TestStudent {
	public static void main(String []args){
		/*
		 * 1.�ȵ��ø���Ĺ�����
		 * 2.��������Ĺ�����
		 * */
		Student stu = new Student();
		
		stu.say();
		
		
	    /*
	     * new Student()��������ѧ������
	     * Person p: �Ǹ��������
	     * ע��: Person��Studentһ�������ż̳й�ϵ  ������ֱ�ӵ� Ҳ�����Ǽ�ӵġ�  
	     * 
	     * ͬһ�����ÿ���ָ��ͬ�Ķ��� �����ö�̬
	     * **/
		Person p = new Student();
		/*Java����ִ�еĹ���:
		 *    a)javac:��Դ���뷭����ֽ��롣   �������: ����﷨  
		 *    b)java: ���ش����ڶ�ջ������롣 
		 * 
		 * ��̬��:
		 *    javac:����﷨   Person�����Ƿ������say������  
		 *     ��������˵��java����  p�����õķ����� Person������say������
		      java:��������֮�� p��ָ��Ķ�����Student���͵ġ� �������ȵ��� Student����д��say()������
		 *   
		 * **/
		p.say();
		
		
		 p = new Teacher();
		
		 
		 Student stu1 = new Student();
		 
		 Person p1 = stu1;  //��ʽת��
		 
		 
		 /*
		  * ѧ������
		  * */
		 Person  p2 = new Student();
		 //ǿ��ת��
		 Student stu2 = (Student)p2;
		 
		 
		 
		 /*
		  * �����
		  * ע��: ǿ�ƻ� ת���������� ���Ƕ���
		  * ���Զ����������Ķ���
		  * */
		 Person p3 = new Person();
		/* Student stu3 = (Student)p3;
		*/ 
		 
		 /*
		  * ���������ָ��Ķ��������
		  * */
		 boolean isPerson =  p3 instanceof Person;
		 System.out.println(isPerson);
		 
		 boolean isStudent =  p3 instanceof Student;
		 System.out.println(isStudent);
		
		 
	}
}
