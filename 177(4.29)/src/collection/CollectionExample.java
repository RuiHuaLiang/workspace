package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionExample {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		//--------------------API------------
		//boolean add(Object obj); 添加Object对象到集合中
		c.add(1);
		c.add(2);
		c.add("123");
		
		//int size() 获取集合中元素的个数
		int size = c.size();
		System.out.println("清空之前的元素个数:"+size);
		//void clear() 清空集合的内容
		//c.clear();
		size = c.size();
		System.out.println("清空之前的元素个数:"+size);
		c.add("123");
		
		//判断字符串是否包含在集合中
		boolean isContains = c.contains("123");
		System.out.println("判断的结果:"+isContains);
		
		
		//-------------------判断集合的包含关系----------
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add(2);
		
		boolean isCons = c.containsAll(c1);
		System.out.println("判断集合之间的关系:"+isCons);
		    
		//在另一个集合中移除当前集合中的元素
		/*boolean isRemove = c.removeAll(c1);
		System.out.println("判断集合之间的关系:"+isRemove);
		System.out.println("集合元素的个数:"+ c.size());*/
		
		//求交集
		c.retainAll(c1);
		//将集合转换成数组
		Object[] objs = c.toArray();
		
		System.out.println("集合的元素"+Arrays.toString(objs));
		
	}

}
