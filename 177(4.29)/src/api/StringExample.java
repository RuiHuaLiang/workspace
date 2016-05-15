package api;
import java.util.Arrays;

/*
 * 将 TOM:89|JERRY:90|TONY:78 拆分成(可以使用字符串的 split()方法) 
   		TOM→89
   		JERRY→90 
   		TONY→78
 * */
public class StringExample {
	public static void main(String[] args) {
		String str ="TOM:89|JERRY:90|TONY:78";
		//1.替换
		String str1 = str.replaceAll(":", "→");
		System.out.println(str1);
		
		//2.切割
		String[] rs = str1.split("\\|");
		System.out.println(rs.length);
		System.out.println(Arrays.toString(rs));
	}

}
