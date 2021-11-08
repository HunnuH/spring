package api.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionTest01 {

	public static void main(String[] args) {
		int[]  arr = new int[] {10,20,30,40,50};
		for(int i : arr) {
			System.out.println(i);
		}
	
	ArrayList<String> l = new ArrayList<String>();
	l.add("java");
	l.add("oraclea");
	l.add("swing");
	l.add("servlet");
	l.add("jsp");
	for(String data : l) {
		System.out.println(data);
	}
	
	HashSet<String> set = new HashSet<String>();
	set.add("java");
	set.add("oracle");
	set.add("swing");
	set.add("servlet");
	set.add("jsp");
	for(String data : set) {
		System.out.println(data);
	}
	
	HashMap<String, String> a = new HashMap<String, String>();
	a.put("ID","jang");
	a.put("Pass","1234");
	a.put("Name","장동건");
	a.put("Addr","서울");
	a.put("Point","1000");
	a.put("deptno","100");
	Collection<String> changeMap = a.values();
	for(String data : changeMap) {
		System.out.println(data);
	}
	
	}
}
