package api.util;

import java.util.Vector;

// list ������ ���� Ŭ������ vector�� �����
public class VectorTest01 {
	public static void main(String[] args) {
		//1. vector ����
		// >> vector�ȿ� ����Ǵ� �������� Ÿ���� ����
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		//v.add("java"); String�̶� ���Ұ�
		System.out.println("���� ����� �뷮 > "+v.capacity());
		System.out.println("���� ����� ����� ���� > "+v.size());
		
		for (int i =0; i <= 10; i++) {
			v.add(i);
		}
		System.out.println("���� ����� �뷮 > "+v.capacity());
		System.out.println("���� ����� ����� ���� > "+v.size());
		
		for (int i =0; i <= 20; i++) {
			v.add(i);
		}
		System.out.println("���� ����� �뷮 > "+v.capacity());
		System.out.println("���� ����� ����� ���� > "+v.size());

		for (int i =0; i <= 40; i++) {
			v.add(i);
		}
		System.out.println("���� ����� �뷮 > "+v.capacity());
		System.out.println("���� ����� ����� ���� > "+v.size());
		
		System.out.println("���Ϳ� ����� 0�� ��� > "+v.get(0));
		
		for(int i = 0; i < v.size(); i++) {
			int data = v.get(i);
			System.out.println(i+"��° ��� > "+data);

		}


	}
}
