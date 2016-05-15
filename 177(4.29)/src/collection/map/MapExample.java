package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		//--------------创建HashMap的集合-------------
		HashMap map = new HashMap();
		//---------------------API----------------
		//a.添加数据到HashMap中
		map.put("key", "value");
		map.put("str", "abc");
		map.put("str", "bcd");
		System.out.println(map);
		
		//b.通过key获取对应的value对象
		String value = (String)map.get("str");
		System.out.println("str对应的值:"+value);
		
		//c.判断集合中是否包含key
		boolean isKey = map.containsKey("str");
		System.out.println("是否包含str这个key:"+isKey);
		
		//d.判断集合中是否包含对应的对象
		boolean isValue = map.containsValue("123");
		System.out.println("是否包含字符串123:"+isValue);
		
		//e.判断集合是否为空
		boolean isEmpty = map.isEmpty();
		System.out.println("判断集合是否为空:"+isEmpty);
		//f.集合元素的个数
		System.out.println("集合元素的个数:"+map.size());
		
		//g.遍历Map集合
		Set keys = map.keySet();
		Iterator it = keys.iterator();
		while(it.hasNext()){
			String key = (String)it.next();
			String val = (String)map.get(key);
			System.out.println(key+"="+val);
		}

		//i.获取所有的value值
		Collection c = map.values();
		
		Iterator it1 = c.iterator();
		while(it1.hasNext()){
			Object obj = it1.next();
			System.out.println(""+obj);
		}
		//j:移除对象
		String str = (String)map.remove("str");
		System.out.println(str+": str这个key是否移除"+map.containsKey("str"));
		
		//k:获取所有key和value对象
		Set entry = map.entrySet();
		Iterator it2 = entry.iterator();
		while(it2.hasNext()){
			Entry e= (Entry)it2.next();
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}
	

}
