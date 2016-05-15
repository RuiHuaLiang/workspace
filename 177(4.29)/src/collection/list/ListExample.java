package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ListExample {
	public static void main(String[] args) {
		//---------------创建线性表---------------
		 ArrayList list = new ArrayList();
		 list.add("123");
		 list.add("345");
		 list.add("123");
		 list.add("1233455");
		 System.out.println("空间:"+list.size());
		 
	    //------------------API --------------------------	 
		 //根据index索引获取对应位置上的对象
		 Object o= list.get(0);
		 System.out.println(""+o);
		 
		 //更新对象
		 list.set(0,"345");
		 //list.toString() --->对象.toString()
		 System.out.println(""+list);
		 
		 //删除
		 list.remove(0);
		 System.out.println(""+list);
		 
		//-----遍历集合----------
		 /*Iterator  it = list.iterator();
		 
		 while(it.hasNext()){
			 String str = (String)it.next();
			 System.out.println(""+str);
		 }*/
		
		 /*
		  * 注意：迭代器在遍历集合过程中，如果要添加或修改集合元素，必须使用迭代器本身的方法完成添加/删除操作。
		  * */
		 ListIterator  it = list.listIterator();
		 
		 while(it.hasNext()){
			 String str = (String)it.next();
			 it.add("abc");
			 System.out.println(""+str);
		 }
		 
		 
		 
		//-----------foreach集合遍历------------- 
		for(Object obj : list){
			String str1 = (String)obj;
			System.out.println("字符串:"+str1);
		}
		 
	}

}
