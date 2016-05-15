package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	public static void main(String []args){
		//---------------创建一个HashSet---------------
		HashSet set = new HashSet();
		
		//------------------API--------------
		//1.添加元素
		set.add("123");
		set.add("123");
		set.add("123");
		set.add("345");
		System.out.println(set);
		//2.获取元素的个数
		System.out.println("set集合的元素的个数:"+set.size());
		//3.判断对象是否存在与集合中
		boolean isContains = set.contains("123");
		System.out.println("集合中是否包含字符串123:"+isContains);
		//4.判断集合是否为空
		boolean isEmpty = set.isEmpty();
		System.out.println("集合中是否为空:"+isEmpty);
		
		//5.遍历set集合
		Iterator it = set.iterator();
		while(it.hasNext()){
			String str = (String)it.next();
			System.out.println(str);
		}
		
		//6.移除元素
		boolean isRemove = set.remove("123");
		System.out.println("是否移除成功:"+isRemove);
	}
}
