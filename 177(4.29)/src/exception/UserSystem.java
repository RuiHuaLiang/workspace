package exception;

public class UserSystem {

	public void  login(String name,String password) throws UserNameException, PasswordException{
		
		if(!name.equals("admin")){
			throw new UserNameException("�û�������");
		}
		if(!password.equals("888888")){			
			throw new PasswordException("�������");
		}
	}
	
}
