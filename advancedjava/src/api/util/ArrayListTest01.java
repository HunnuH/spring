package api.util;
import java.util.ArrayList;
// list ������ ���� Ŭ������ vector�� �����
public class ArrayListTest01 {
	public static void main(String[] args) {
		ArrayList<Integer> v = new ArrayList<Integer>();
		v.add(10);
		System.out.println("���� ����� ����� ���� > "+v.size());
		
		for (int i =0; i <= 10; i++) {
			v.add(i);
		}
		System.out.println("���� array�� ����� ��� �����> "+v.size());
		System.out.println("array�� ����� 0�� ��� > "+v.get(0));

		for(int i = 0; i < v.size(); i++) {
			int data = v.get(i);
			System.out.println(i+"��° ��� > "+data);

		}
	}
}
