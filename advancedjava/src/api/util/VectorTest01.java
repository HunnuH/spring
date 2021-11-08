package api.util;

import java.util.Vector;

// list 구조의 하위 클래스인 vector의 사용방법
public class VectorTest01 {
	public static void main(String[] args) {
		//1. vector 생성
		// >> vector안에 저장되는 데이터의 타입을 제한
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		//v.add("java"); String이라 사용불가
		System.out.println("현재 저장된 용량 > "+v.capacity());
		System.out.println("현재 저장된 요소의 갯수 > "+v.size());
		
		for (int i =0; i <= 10; i++) {
			v.add(i);
		}
		System.out.println("현재 저장된 용량 > "+v.capacity());
		System.out.println("현재 저장된 요소의 갯수 > "+v.size());
		
		for (int i =0; i <= 20; i++) {
			v.add(i);
		}
		System.out.println("현재 저장된 용량 > "+v.capacity());
		System.out.println("현재 저장된 요소의 갯수 > "+v.size());

		for (int i =0; i <= 40; i++) {
			v.add(i);
		}
		System.out.println("현재 저장된 용량 > "+v.capacity());
		System.out.println("현재 저장된 요소의 갯수 > "+v.size());
		
		System.out.println("벡터에 저장된 0번 요소 > "+v.get(0));
		
		for(int i = 0; i < v.size(); i++) {
			int data = v.get(i);
			System.out.println(i+"번째 요소 > "+data);

		}


	}
}
