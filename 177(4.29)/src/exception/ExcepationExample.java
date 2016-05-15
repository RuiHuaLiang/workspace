package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ExcepationExample {

	public static void main(String[] args) {
		
		//----------------1.≤∂◊Ω“Ï≥£-----------------
		try {
			InputStream is = new FileInputStream("c:\\1.txt");
			is.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println("---------finally--------");
		}
		
		//---------------2.try..finally-----------
		try{
		   System.out.println("--------try---------");
		}finally{
			System.out.println("--------finally---------");
		}
		//----------------√Ê ‘Ã‚---------------
		int i =example();
		System.out.println(i);
	}
	
	public static int example(){
		int i = 1;
		try{
			 return i ++;  //return 1
		}finally{
		    ++ i;  //return 24
		    System.out.println("i="+i);
		}
	}

}
