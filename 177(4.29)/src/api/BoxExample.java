package api;

public class BoxExample {

	public static void main(String[] args) {
		
	//-----------------int����Object������------------------------	
		 int i = 10;
		 /*1.i �Ǽ�����
		  *2.��i��ֵ����������ʱ�� ���Զ����װ�����
		  *3.��Integer�Ķ���ֵ��Object���� �����ö�̬�� 
		  * **/
		 Object o = i ;
	//----------------------װ�����----------------
		 int  m = 10; //����������
		 //��int����ת���ɶ�Ӧ�İ�װ��Ķ��� (��Integer����)
		 Integer  obj = new Integer(m);
		 System.out.println(obj);
		 Integer obj1 = m;   //�ȼ��� Integer obj1 = new Integer(m);
		 System.out.println(obj1);
		 
		 Integer obj2 = 20;
		 
	//------------------�������----------------
		 Integer i1 = 30;
		 
		 /**
		  * 1.��Integer����ת����int���ͣ� ������ (int intValue()) ����ķ�����
		  * */
		 int  n = i1; //�ȼ��� i1.intValue();
		 int  k = i1.intValue();
		 System.out.println("n="+n+",k="+k);
		 
		 
		 
		 
		 
	}

}
