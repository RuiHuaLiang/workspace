package exception;

public class RunTimeExample {

	public static void main(String[] args)throws RuntimeException {
		String str = null ;
		/*try{
			boolean isEquals = str.equals("abc");
			System.out.println(isEquals);
		}catch(NullPointerException e){
			System.out.println("str�ǿյ�");
		}*/
		boolean isEquals = str.equals("abc");
		System.out.println(isEquals);
	}

}
