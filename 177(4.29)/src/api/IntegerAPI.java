package api;

public class IntegerAPI {

	public static void main(String[] args) {
	    //------------------------������ת���ɵķ���-----------
		  Integer i = 127;
		  String binary = Integer.toBinaryString(i);
		  System.out.println("127�Ķ�����"+binary);
		  //------------------------�˽���ת���ɵķ���-----------
		  String oc = Integer.toOctalString(i);
		  System.out.println("127�İ˽���"+oc);
		  //------------------------ʮ����ת���ɵķ���-----------
	      String hex = Integer.toHexString(i);
	      System.out.println("127��ʮ������"+hex);
	      //----------------String ��Integer����֮���ת��-------
	      String str = Integer.toString(i);
	      System.out.println(str);
	      Integer p = Integer.valueOf(str)+1;
	      System.out.println(p);
	}

}
