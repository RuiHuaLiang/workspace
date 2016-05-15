package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	public static void main(String []args){
		//---------------����һ��HashSet---------------
		HashSet set = new HashSet();
		
		//------------------API--------------
		//1.���Ԫ��
		set.add("123");
		set.add("123");
		set.add("123");
		set.add("345");
		System.out.println(set);
		//2.��ȡԪ�صĸ���
		System.out.println("set���ϵ�Ԫ�صĸ���:"+set.size());
		//3.�ж϶����Ƿ�����뼯����
		boolean isContains = set.contains("123");
		System.out.println("�������Ƿ�����ַ���123:"+isContains);
		//4.�жϼ����Ƿ�Ϊ��
		boolean isEmpty = set.isEmpty();
		System.out.println("�������Ƿ�Ϊ��:"+isEmpty);
		
		//5.����set����
		Iterator it = set.iterator();
		while(it.hasNext()){
			String str = (String)it.next();
			System.out.println(str);
		}
		
		//6.�Ƴ�Ԫ��
		boolean isRemove = set.remove("123");
		System.out.println("�Ƿ��Ƴ��ɹ�:"+isRemove);
	}
}
