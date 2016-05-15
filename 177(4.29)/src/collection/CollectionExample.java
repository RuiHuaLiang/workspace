package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionExample {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		//--------------------API------------
		//boolean add(Object obj); ���Object���󵽼�����
		c.add(1);
		c.add(2);
		c.add("123");
		
		//int size() ��ȡ������Ԫ�صĸ���
		int size = c.size();
		System.out.println("���֮ǰ��Ԫ�ظ���:"+size);
		//void clear() ��ռ��ϵ�����
		//c.clear();
		size = c.size();
		System.out.println("���֮ǰ��Ԫ�ظ���:"+size);
		c.add("123");
		
		//�ж��ַ����Ƿ�����ڼ�����
		boolean isContains = c.contains("123");
		System.out.println("�жϵĽ��:"+isContains);
		
		
		//-------------------�жϼ��ϵİ�����ϵ----------
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add(2);
		
		boolean isCons = c.containsAll(c1);
		System.out.println("�жϼ���֮��Ĺ�ϵ:"+isCons);
		    
		//����һ���������Ƴ���ǰ�����е�Ԫ��
		/*boolean isRemove = c.removeAll(c1);
		System.out.println("�жϼ���֮��Ĺ�ϵ:"+isRemove);
		System.out.println("����Ԫ�صĸ���:"+ c.size());*/
		
		//�󽻼�
		c.retainAll(c1);
		//������ת��������
		Object[] objs = c.toArray();
		
		System.out.println("���ϵ�Ԫ��"+Arrays.toString(objs));
		
	}

}
