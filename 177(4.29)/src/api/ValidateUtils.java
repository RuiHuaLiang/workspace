package api;

public class ValidateUtils {
	public static boolean isUserName(String userName,String regex){
		 return userName.matches(regex);
	}
	
	public static boolean isUserName(String userName){
		 return userName.matches("^[a-zA-Z][\\w_]{5,19}$");
	}
	//1.�û���  2����  3 �ֻ����� 4.���� 5.�������� 6.���֤  
}
