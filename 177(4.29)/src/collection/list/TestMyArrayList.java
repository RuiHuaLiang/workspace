package collection.list;

public class TestMyArrayList {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add("123");
		list.add("123");
		list.add("123");
		list.add("123");
		list.add("123");
		System.out.println("Ԫ�ظ���:"+list.size());
		list.clear();
		System.out.println("Ԫ�ظ���:"+list.size());
		
	}

}
