package collection;

import java.util.ArrayList;

public class ObjectExample {
	public static void main(String[] args) {
		//����  ArrayList: Object[] values;
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add(true);
		list.add('c');
		list.add(123);
		
		//----------���ͱ��-------------
		//����:�������Ƽ�����Ԫ�ص����͡�
		ArrayList<String> strs = new ArrayList<String>();
		/*strs.add("abc");
		strs.add(true);
		strs.add('c');
		strs.add(123);*/
		
		
	}

}
