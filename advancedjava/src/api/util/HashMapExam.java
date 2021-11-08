package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {
		HashMap<String, String> a = new HashMap<String, String>();
		a.put("ID","jang");
		a.put("Pass","1234");
		a.put("Name","장동건");
		a.put("Addr","서울");
		a.put("Point","1000");
		a.put("deptno","100");
		
		Set<String> Keylist = a.keySet();
		Iterator<String> it = Keylist.iterator();
		while(it.hasNext()) {
			String Key = it.next();
			String value = a.get(Key);
			System.out.println(Key+"-"+value);
		} 	
	}
}
