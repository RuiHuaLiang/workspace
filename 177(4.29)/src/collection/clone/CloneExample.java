package collection.clone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

import collection.utils.User;

public class CloneExample {
	public static void main(String[] args) {
		ArrayList list =new ArrayList();
	
		User u = new User(1,"tom");
		list.add(u);
		
		User u1 = new User(2,"jack");
		list.add(u1);
		
		//----------------1.clone完成集合的复制-------
		System.out.println("list的内容:"+list);
		ArrayList users= (ArrayList)list.clone();
	
		System.out.println("users的内容:"+users);
		//地址不相等。代表堆区中的集合对象发生了拷贝
		System.out.println("两个集合的地址是否相同:"+(users == list));
		
		//判断两个集合中的对象是否发生了拷贝: 如果发生了拷贝 那么地址不想等。但是equals()的结果是true 
		User user = (User)list.get(0);
		User user1 = (User)users.get(0);
		
		// 地址相同 ，内容也相同 所以集合中的元素并没有发生拷贝
		System.out.println("判断集合中的两个对象地址是否相等:"+(user == user1));
		System.out.println("判断集合中的两个对象内容是否相同:"+user.equals(user1));
		
		//------------------2.使用构造器完成不同对象的拷贝----------
		
		//1.list复制list
		ArrayList  strList = new ArrayList();
		strList.add("abc");
		//通过构造器完成list的拷贝
		ArrayList  copyList = new ArrayList(strList);
		System.out.println("集合元素个数:"+copyList.size());
		System.out.println("比较两个元素的地址:"+(copyList.get(0)== strList.get(0)));
			
		//2.set复制list
		HashSet set = new HashSet(strList);
		System.out.println("集合元素个数"+set.size());
		
		//3.map复制map
		HashMap hashMap = new HashMap();
		hashMap.put("10", "abc");
		hashMap.put("2", "cde");
		
		TreeMap tree = new TreeMap(hashMap);
		System.out.println("集合元素个数"+tree.size());
		System.out.println("集合元素地址的比较"+(tree.get("10")==hashMap.get("10")));
		
		
	}

}
