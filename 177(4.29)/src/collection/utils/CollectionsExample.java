package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsExample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(8);
		list.add(9);
		list.add(22);
		list.add(15);
		list.add(1);
		System.out.println("排序之前的集合:"+list);
		//1.使用集合工具类排序
		Collections.sort(list);
		System.out.println("排序之后的集合:"+list);
		//2.使用工具类乱序
		//Collections.shuffle(list);
		System.out.println("乱序之后的集合:"+list);
		//3.数据交换
		Collections.swap(list, 0, list.size()-1);
		System.out.println("交换之后的集合:"+list);
		
		//-----------------对User对象排序-------------------------
		ArrayList users = new ArrayList();
		users.add(new User(10,"jack"));
		users.add(new User(8,"tom"));
		users.add(new User(2,"bob"));
		users.add(new User(11,"lucy"));
		users.add(new User(19,"bruce"));
		users.add(new User(1,"sun"));
		
		System.out.println("排序前"+users);
		//把ArrayList集合中的对象排序 升序排序
		Collections.sort(users);
		System.out.println("排序后"+users);
		//使用降序排序排列数组中的对象
		Collections.sort(users, new Comparator(){
			@Override
			public int compare(Object o1, Object o2) {
				User u1 = (User)o1;
				User u2 = (User)o2;
				
				return -(u1.getId()-u2.getId());
			}
		});
		System.out.println("排序后"+users);
		
	}

}
