package api;


public class StringBuilderExample {
	public static void main(String[] args) {
		//-----------����StringBuilder�Ķ���---------
		StringBuilder sb = new StringBuilder();   //char[] �ǿյ� �ɱ�
		
		//------------------StringBuilder API-----------
		System.out.println("׷�ӷ�������֮ǰ:------"+sb+"----------");
		StringBuilder sb1 = sb.append("hello"); // char[]: hello  sb1 ��sb:ͬһ������
		System.out.println("׷�ӷ�������֮��:------"+sb+"----------"); //sb.toString()
		System.out.println("׷�ӷ�������֮��:sb1:------"+sb1+"----------");
		System.out.println("�ж�sb1��sb�����Ƿ����:------"+(sb1 == sb)+"----------");
		
		//���뵽ָ����λ��  offset��0��ʼ 
		sb.insert(0, "��ӡһ��");
		System.out.println("���뷽������֮��:------"+sb+"----------");
		
		//ɾ����start��end֮����ַ��� ������end
		sb.delete(2, 4);
		System.out.println("ɾ����������֮��:------"+sb+"----------");
	  //-------------------StringBuilder�ķ���������׺---
		StringBuilder sb2 = new StringBuilder();
		sb2.append("����").append("���޼�").insert(2, "����").delete(0, 2);
		System.out.println(sb2);
		
	 //-----------------String ��StringBuilder֮���ת��-------------
		//a.��Stringת����StringBuilder 
		StringBuilder sb3 = new StringBuilder("abc");
		
		//b.StringBuilderת����String
		String s = sb3.toString();
		
	}

}
