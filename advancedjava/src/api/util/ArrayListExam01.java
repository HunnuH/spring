package api.util;
import java.util.ArrayList;
public class ArrayListExam01 {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(78);
		l.add(99);
		l.add(100);
		l.add(95);
		l.add(100);
		int sum = 0;
		for (int i = 0; i <l.size(); i++) {
			sum = sum+ l.get(i);
			}	
			System.out.println("Array�� ����� ����� �� : "+sum);
			System.out.println("Array�� ����� ����� ��� : "+((double)sum/l.size()));
	}
}
