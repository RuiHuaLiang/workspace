package oop.keywords;

public  class Person {
	//����
	private final String name ="Andy";
	
	private final String a;
	
	private final  int  b = 10; //b:���������� 
	
	//private final Student stu = new Student();
	
	private static String chairman ="ϰ�����";
	
	//��̬��
	static{
		System.out.println("------��̬�鱻������-----");
	}
	
	public Person(){
		System.out.println("------���󱻴�����-----");
		a = "abc";
	}
	
	public final void say(){
		//b = 20;//�޸ĵ�ֵ �����
	//	stu.setAge(20); //stu��ַ���ܱ��ı�  stu��ָ��Ķ��������ǿ��Ըı䡣
		//���ʾ�̬����
		System.out.println(Person.chairman);  //����.���������Ƽ���
		System.out.println(this.chairman);   //����.������
		
		//���þ�̬����
		//Person.print();
	}
	
	public static void print(){
		 System.out.println("------print�Ǿ�̬����------------");
		 //this.say(); 
		 /*Person p = new Person();
		 p.say();*/
	}
}


