package api;
import java.util.Arrays;

/*
 * �� TOM:89|JERRY:90|TONY:78 ��ֳ�(����ʹ���ַ����� split()����) 
   		TOM��89
   		JERRY��90 
   		TONY��78
 * */
public class StringExample {
	public static void main(String[] args) {
		String str ="TOM:89|JERRY:90|TONY:78";
		//1.�滻
		String str1 = str.replaceAll(":", "��");
		System.out.println(str1);
		
		//2.�и�
		String[] rs = str1.split("\\|");
		System.out.println(rs.length);
		System.out.println(Arrays.toString(rs));
	}

}
