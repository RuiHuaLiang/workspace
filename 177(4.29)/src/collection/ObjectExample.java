package collection;

import java.util.ArrayList;

public class ObjectExample {
	public static void main(String[] args) {
		//案例  ArrayList: Object[] values;
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add(true);
		list.add('c');
		list.add(123);
		
		//----------泛型编程-------------
		//泛型:用来限制集合中元素的类型。
		ArrayList<String> strs = new ArrayList<String>();
		/*strs.add("abc");
		strs.add(true);
		strs.add('c');
		strs.add(123);*/
		
		
	}

}
