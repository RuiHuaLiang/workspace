package api;

/*
 * 等价于：
 *javac: public class Student extends Object
 *
 *通过当前类创建对象 调用equals，hashCode,toString 可以证明 Student的父类是Object
 * */
public class Student {

	

	private int id;//学号
	private String name;//姓名
	private int age;//年龄
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	
	
	public Student() {
		super();
	}
	

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	 
	

    /*
     * 重写之后的equals 比较对象 
     *   1.比较两个对象的地址。
     *   2.比较两个对象的唯一标识是否相等 如果相等那么也是同一个对象。
     * 
     * **/
	@Override
	public boolean equals(Object obj) {
		//比较两个对象的地址是否相同  地址相同的对象必定是同一个对象。
		if (this == obj)
			return true;
		if(obj instanceof Student){
			Student stu =(Student)obj;
			return stu.id == this.id;  //比较两个学生的学号
		}
		return false;
	}

	public int hashCode(){
		return this.id;  //把学生的学号作为hash码
	}

	
	public String toString(){
		return ""+id+","+name;
	}
}
