package api.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest02 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("oracle");
		set.add("swing");
		set.add("servlet");
		set.add("jsp");
		System.out.println("현재 저장된 요소의 갯수 > "+set.size());
		
		HashSet<String> set2 = new HashSet<String>(set);//합집합
		set2.add("R");
		set2.add("spring");
		set2.add("hadoop");
		System.out.println("합집합");
		System.out.println("현재 저장된 요소의 갯수 > "+set2.size());
		print(set);
		print(set2);
		
		HashSet<String> set3 = new HashSet<String>(set);//교집합
		set3.add("java");
		set3.add("oracle");
		set3.add("raspberry");
		System.out.println("교집합");
		System.out.println("현재 저장된 요소의 갯수 > "+set3.size());
		set.retainAll(set3);
		print(set3);

	}
	public static void print(Set<String> set) {
		Iterator<String> it = set.iterator() ;
		while(it.hasNext()) {
				String element = it.next();
				System.out.println("set 저장된 요소의 갯수 > "+element);
			}
				System.out.println("===============================");
		}
	}
