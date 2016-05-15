package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		//--------------����HashMap�ļ���-------------
		HashMap map = new HashMap();
		//---------------------API----------------
		//a.������ݵ�HashMap��
		map.put("key", "value");
		map.put("str", "abc");
		map.put("str", "bcd");
		System.out.println(map);
		
		//b.ͨ��key��ȡ��Ӧ��value����
		String value = (String)map.get("str");
		System.out.println("str��Ӧ��ֵ:"+value);
		
		//c.�жϼ������Ƿ����key
		boolean isKey = map.containsKey("str");
		System.out.println("�Ƿ����str���key:"+isKey);
		
		//d.�жϼ������Ƿ������Ӧ�Ķ���
		boolean isValue = map.containsValue("123");
		System.out.println("�Ƿ�����ַ���123:"+isValue);
		
		//e.�жϼ����Ƿ�Ϊ��
		boolean isEmpty = map.isEmpty();
		System.out.println("�жϼ����Ƿ�Ϊ��:"+isEmpty);
		//f.����Ԫ�صĸ���
		System.out.println("����Ԫ�صĸ���:"+map.size());
		
		//g.����Map����
		Set keys = map.keySet();
		Iterator it = keys.iterator();
		while(it.hasNext()){
			String key = (String)it.next();
			String val = (String)map.get(key);
			System.out.println(key+"="+val);
		}

		//i.��ȡ���е�valueֵ
		Collection c = map.values();
		
		Iterator it1 = c.iterator();
		while(it1.hasNext()){
			Object obj = it1.next();
			System.out.println(""+obj);
		}
		//j:�Ƴ�����
		String str = (String)map.remove("str");
		System.out.println(str+": str���key�Ƿ��Ƴ�"+map.containsKey("str"));
		
		//k:��ȡ����key��value����
		Set entry = map.entrySet();
		Iterator it2 = entry.iterator();
		while(it2.hasNext()){
			Entry e= (Entry)it2.next();
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}
	

}
