package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest01 {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "swing");
		map1.put(1, "oracle");
		map1.put(1, "java");
		System.out.println(map1.size());
		System.out.println(map1.get(1));
		System.out.println("====================");
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("1", "jsp");
		map2.put("2", "R");
		map2.put("3", "hadoop");
		map2.put("4", "mybatis");
		map2.put("5", "ajax");
		System.out.println(map2.size());
		System.out.println(map2.get("1"));
		System.out.println("====================");
		
		Set<String> Keylist = map2.keySet();
		Iterator<String> it = Keylist.iterator();
		while(it.hasNext()) {
			String Key = it.next();
			String value = map2.get(Key);
			System.out.println(Key+":"+value);
		}
		
		


	}

}
