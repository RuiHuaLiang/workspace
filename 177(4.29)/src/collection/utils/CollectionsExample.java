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
		System.out.println("����֮ǰ�ļ���:"+list);
		//1.ʹ�ü��Ϲ���������
		Collections.sort(list);
		System.out.println("����֮��ļ���:"+list);
		//2.ʹ�ù���������
		//Collections.shuffle(list);
		System.out.println("����֮��ļ���:"+list);
		//3.���ݽ���
		Collections.swap(list, 0, list.size()-1);
		System.out.println("����֮��ļ���:"+list);
		
		//-----------------��User��������-------------------------
		ArrayList users = new ArrayList();
		users.add(new User(10,"jack"));
		users.add(new User(8,"tom"));
		users.add(new User(2,"bob"));
		users.add(new User(11,"lucy"));
		users.add(new User(19,"bruce"));
		users.add(new User(1,"sun"));
		
		System.out.println("����ǰ"+users);
		//��ArrayList�����еĶ������� ��������
		Collections.sort(users);
		System.out.println("�����"+users);
		//ʹ�ý����������������еĶ���
		Collections.sort(users, new Comparator(){
			@Override
			public int compare(Object o1, Object o2) {
				User u1 = (User)o1;
				User u2 = (User)o2;
				
				return -(u1.getId()-u2.getId());
			}
		});
		System.out.println("�����"+users);
		
	}

}
