package oop;

public class User {
	String userName;
	String password;
	long  tel;
	char[] email;
	
	public User(){
		
	}
	
	public User(String userName,String password){
		this.userName = userName;
		this.password = password;
	}
	
	public User(long tel ,String password){
		this.tel = tel;
		this.password = password;
	}
	
	public User(char[] email,String password){
		this.email = email;
		this.password = password;
	}

	public User(String userName, String password, long tel, char[] email) {
		this.userName = userName;
		this.password = password;
		this.tel = tel;
		this.email = email;
	}
	
	public boolean login(String userName,String password){
		 if(userName.equals(userName) && password.equals(password)){
			 return true;
		 }else{
			 return false;
		 }
	}
	
	public void login(long tel ,String password){
		
	}
	
	public void login(char[]email,String password){
		
	}
	
	
	
	
	

}
