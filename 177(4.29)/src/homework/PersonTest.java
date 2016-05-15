package homework;

public class PersonTest {
	public static void main(String[] args){
		//1.创建一个Person对象
		Person lucy  = new Person("lucy",Person.MALE,23,Person.IS_SINGLE,null);
		Person lily  = new Person("lily",Person.FMALE,20,Person.IS_MARRIED,null);
		
		//2.判断两个对象是否可以结婚
		int result = lucy.marryWith(lily);
		
		//3.输出结果
		if(result == Person.AGE_SMALLER){
			System.out.println("年龄不符合");
		}
		
		if(result  == Person.GENDER_SAME){
			System.out.println("基友");
		}
		
		if(result == Person.MARRIED){
			System.out.println("小三");
		}
		
		if(result == Person.SUCCESS_MARRY){
			System.out.println("恭喜: "+lucy.getName()+"和"+lily.getName()+"结婚成功!");
			//设置配偶 和是否结婚的状态值
			lucy.setP(lily);
			lucy.setMarry(Person.IS_MARRIED);
			
			lily.setP(lucy);
			lily.setMarry(Person.IS_MARRIED);
		}
		
	}
}	
