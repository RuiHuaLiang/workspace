package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ListExample {
	public static void main(String[] args) {
		//---------------�������Ա�---------------
		 ArrayList list = new ArrayList();
		 list.add("123");
		 list.add("345");
		 list.add("123");
		 list.add("1233455");
		 System.out.println("�ռ�:"+list.size());
		 
	    //------------------API --------------------------	 
		 //����index������ȡ��Ӧλ���ϵĶ���
		 Object o= list.get(0);
		 System.out.println(""+o);
		 
		 //���¶���
		 list.set(0,"345");
		 //list.toString() --->����.toString()
		 System.out.println(""+list);
		 
		 //ɾ��
		 list.remove(0);
		 System.out.println(""+list);
		 
		//-----��������----------
		 /*Iterator  it = list.iterator();
		 
		 while(it.hasNext()){
			 String str = (String)it.next();
			 System.out.println(""+str);
		 }*/
		
		 /*
		  * ע�⣺�������ڱ������Ϲ����У����Ҫ��ӻ��޸ļ���Ԫ�أ�����ʹ�õ���������ķ���������/ɾ��������
		  * */
		 ListIterator  it = list.listIterator();
		 
		 while(it.hasNext()){
			 String str = (String)it.next();
			 it.add("abc");
			 System.out.println(""+str);
		 }
		 
		 
		 
		//-----------foreach���ϱ���------------- 
		for(Object obj : list){
			String str1 = (String)obj;
			System.out.println("�ַ���:"+str1);
		}
		 
	}

}
