package homework;

public class Person {
   
	public static final int  GENDER_SAME = 1; //ͬ�Ա�
	public static final int  AGE_SMALLER = 2; //���䲻����
	public static final int  MARRIED = 3;  //�ѻ�
	public static final int  SUCCESS_MARRY = 0;  //�ɻ�
	
	public static final boolean  FMALE =false; //Ů
	public static final boolean  MALE = true;//��
	
	public static final boolean  IS_MARRIED = true;//�ѻ�
	public static final boolean  IS_SINGLE = false;//����
	
	
	private String name;//����
    private boolean isGender;//�Ա� 
    private int age;//����
    private boolean isMarry;//���
    private Person p ; //��ż
    
    
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
	 * �ж��������Ƿ���Խ��
	 * @param p  ������
	 * @return   Person.GENDER_SAME ͬ�� ���ܽ��
	 *           Person.AGE_SMALLER ��Ů���䲻����
	 *           Person.MARRIED ����һ���ѻ�
	 *           Person.SUCCESS_MARRY �ɻ�
	 */
	public int marryWith(Person p ){
		//1.�ж��Ա��Ƿ���ͬ
		if(this.isGender == p.isGender){
			return Person.GENDER_SAME;
		}
		
		//2.�ж�this ��p���������
		if(this.isGender == Person.MALE && p.isGender == Person.FMALE){
			if(this.age < 22 || p.age < 20){
				return Person.AGE_SMALLER;
			}
		}else{
			if(p.age < 22 || this.age < 20){
				return Person.AGE_SMALLER;
			}
		}
		
		//3.�ж��Ƿ��ѻ�
		if(this.isMarry == Person.IS_MARRIED || p.isMarry == Person.IS_MARRIED){
			return Person.MARRIED ;
		}
		return  Person.SUCCESS_MARRY;
	}
    
}
