package api;

public class IntegerAPI {

	public static void main(String[] args) {
	    //------------------------二进制转换成的方法-----------
		  Integer i = 127;
		  String binary = Integer.toBinaryString(i);
		  System.out.println("127的二进制"+binary);
		  //------------------------八进制转换成的方法-----------
		  String oc = Integer.toOctalString(i);
		  System.out.println("127的八进制"+oc);
		  //------------------------十六制转换成的方法-----------
	      String hex = Integer.toHexString(i);
	      System.out.println("127的十六进制"+hex);
	      //----------------String 和Integer类型之间的转换-------
	      String str = Integer.toString(i);
	      System.out.println(str);
	      Integer p = Integer.valueOf(str)+1;
	      System.out.println(p);
	}

}
