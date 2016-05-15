package homework;

public class Person {
   
	public static final int  GENDER_SAME = 1; //同性别
	public static final int  AGE_SMALLER = 2; //年龄不符合
	public static final int  MARRIED = 3;  //已婚
	public static final int  SUCCESS_MARRY = 0;  //可婚
	
	public static final boolean  FMALE =false; //女
	public static final boolean  MALE = true;//男
	
	public static final boolean  IS_MARRIED = true;//已婚
	public static final boolean  IS_SINGLE = false;//单身
	
	
	private String name;//姓名
    private boolean isGender;//性别 
    private int age;//年龄
    private boolean isMarry;//婚否
    private Person p ; //配偶
    
    
    public Person(){
    	
    }
    
    public Person(String name, boolean isGender, int age, boolean isMarry,
			Person p) {
		super();
		this.name = name;
		this.isGender = isGender;
		this.age = age;
		this.isMarry = isMarry;
		this.p = p;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return isGender;
	}
	public void setGender(boolean isGender) {
		this.isGender = isGender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMarry() {
		return isMarry;
	}
	public void setMarry(boolean isMarry) {
		this.isMarry = isMarry;
	}
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	
	/**
	 * 判断两个人是否可以结婚
	 * @param p  结婚对象
	 * @return   Person.GENDER_SAME 同性 不能结婚
	 *           Person.AGE_SMALLER 男女年龄不满足
	 *           Person.MARRIED 其中一方已婚
	 *           Person.SUCCESS_MARRY 可婚
	 */
	public int marryWith(Person p ){
		//1.判断性别是否相同
		if(this.isGender == p.isGender){
			return Person.GENDER_SAME;
		}
		
		//2.判断this 和p对象的年龄
		if(this.isGender == Person.MALE && p.isGender == Person.FMALE){
			if(this.age < 22 || p.age < 20){
				return Person.AGE_SMALLER;
			}
		}else{
			if(p.age < 22 || this.age < 20){
				return Person.AGE_SMALLER;
			}
		}
		
		//3.判断是否已婚
		if(this.isMarry == Person.IS_MARRIED || p.isMarry == Person.IS_MARRIED){
			return Person.MARRIED ;
		}
		return  Person.SUCCESS_MARRY;
	}
    
}
