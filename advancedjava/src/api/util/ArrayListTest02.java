package api.util;
import java.util.ArrayList;
public class ArrayListTest02 {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("java");
		l.add("oraclea");
		l.add("swing");
		l.add("servlet");
		l.add("jsp");
		
		System.out.println("���� ����� ���ڿ� ������ > "+l);
		
		for (int i = 0; i <l.size(); i++) {
			System.out.println(l.get(i));
			}	
		}
	}

