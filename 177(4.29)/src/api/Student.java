package api;

/*
 * �ȼ��ڣ�
 *javac: public class Student extends Object
 *
 *ͨ����ǰ�ഴ������ ����equals��hashCode,toString ����֤�� Student�ĸ�����Object
 * */
public class Student {

	

	private int id;//ѧ��
	private String name;//����
	private int age;//����
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
     * ��д֮���equals �Ƚ϶��� 
     *   1.�Ƚ���������ĵ�ַ��
     *   2.�Ƚ����������Ψһ��ʶ�Ƿ���� ��������ôҲ��ͬһ������
     * 
     * **/
	@Override
	public boolean equals(Object obj) {
		//�Ƚ���������ĵ�ַ�Ƿ���ͬ  ��ַ��ͬ�Ķ���ض���ͬһ������
		if (this == obj)
			return true;
		if(obj instanceof Student){
			Student stu =(Student)obj;
			return stu.id == this.id;  //�Ƚ�����ѧ����ѧ��
		}
		return false;
	}

	public int hashCode(){
		return this.id;  //��ѧ����ѧ����Ϊhash��
	}

	
	public String toString(){
		return ""+id+","+name;
	}
}
