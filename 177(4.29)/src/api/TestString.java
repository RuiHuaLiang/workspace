package api;

public class TestString {
	final static String ONE ="c";
	public static void main(String []args){
		//1.����һ���ַ��� str:String    "abc" �ַ�����������: String
		String str = "abc";
		System.out.println(str.hashCode());
		
		String str4= str; //str4 ��ַ����str�ĵ�ַ
		str = str.concat("c");  //concat(): �ַ�������: abcc String��������ݲ��ɱ�  ����Ҳֻ�ܴ���һ���µĶ���
		
		//�ж�str4�ĵ�ַ��str�ĵ�ַ�Ƿ����
		System.out.println(str4 == str);
		
		
		//------------String��������ķ�ʽ-----------------
		String str2  = new String("abcdef"); //�ȼ��� String str2 = "abcdef";
		
		//�Ż�֮���"abc"�����ڳ�������
		String str3 ="abc";
		String str31 ="a"+"bc";
		System.out.println("str3��str31�Ƚ�:"+(str3==str31));
		
		String str32 = "ab"+"c";
		System.out.println("str3��str32�Ƚ�:"+(str3==str32));
		
		String str33 ="a" +"b"+"c";
		System.out.println("str3��str32�Ƚ�:"+(str3==str33));
		
		String str34 = "a"+"b"+ONE;
		System.out.println("str3��str32�Ƚ�:"+(str3==str34));
		
		String str21 = "ab";
		String str35 = str21 + "c"; //���ڱ������Բ��ܱ��Ż���"abc"
		System.out.println("str3��str32�Ƚ�:"+(str3==str35));
		
		
		
	}
}
