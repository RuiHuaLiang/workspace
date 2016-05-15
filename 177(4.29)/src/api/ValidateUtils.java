package api;

public class ValidateUtils {
	public static boolean isUserName(String userName,String regex){
		 return userName.matches(regex);
	}
	
	public static boolean isUserName(String userName){
		 return userName.matches("^[a-zA-Z][\\w_]{5,19}$");
	}
	//1.用户名  2密码  3 手机号码 4.邮箱 5.邮政编码 6.身份证  
}
