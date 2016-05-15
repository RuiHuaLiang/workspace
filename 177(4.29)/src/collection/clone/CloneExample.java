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
		
		//----------------1.clone��ɼ��ϵĸ���-------
		System.out.println("list������:"+list);
		ArrayList users= (ArrayList)list.clone();
	
		System.out.println("users������:"+users);
		//��ַ����ȡ���������еļ��϶������˿���
		System.out.println("�������ϵĵ�ַ�Ƿ���ͬ:"+(users == list));
		
		//�ж����������еĶ����Ƿ����˿���: ��������˿��� ��ô��ַ����ȡ�����equals()�Ľ����true 
		User user = (User)list.get(0);
		User user1 = (User)users.get(0);
		
		// ��ַ��ͬ ������Ҳ��ͬ ���Լ����е�Ԫ�ز�û�з�������
		System.out.println("�жϼ����е����������ַ�Ƿ����:"+(user == user1));
		System.out.println("�жϼ����е��������������Ƿ���ͬ:"+user.equals(user1));
		
		//------------------2.ʹ�ù�������ɲ�ͬ����Ŀ���----------
		
		//1.list����list
		ArrayList  strList = new ArrayList();
		strList.add("abc");
		//ͨ�����������list�Ŀ���
		ArrayList  copyList = new ArrayList(strList);
		System.out.println("����Ԫ�ظ���:"+copyList.size());
		System.out.println("�Ƚ�����Ԫ�صĵ�ַ:"+(copyList.get(0)== strList.get(0)));
			
		//2.set����list
		HashSet set = new HashSet(strList);
		System.out.println("����Ԫ�ظ���"+set.size());
		
		//3.map����map
		HashMap hashMap = new HashMap();
		hashMap.put("10", "abc");
		hashMap.put("2", "cde");
		
		TreeMap tree = new TreeMap(hashMap);
		System.out.println("����Ԫ�ظ���"+tree.size());
		System.out.println("����Ԫ�ص�ַ�ıȽ�"+(tree.get("10")==hashMap.get("10")));
		
		
	}

}
