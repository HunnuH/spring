package api.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest01 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("oraclea");
		set.add("swing");
		set.add("servlet");
		set.add("jsp");
		System.out.println("���� ����� ����� ���� > "+set.size());
		
		Iterator<String> it = set.iterator() ;
		while(it.hasNext()) {
				String element = it.next();
				System.out.println("set ����� ����� ���� > "+element);
		}
	}
}
