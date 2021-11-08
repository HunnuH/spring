package api.util;
import java.util.ArrayList;
// list 구조의 하위 클래스인 vector의 사용방법
public class ArrayListTest01 {
	public static void main(String[] args) {
		ArrayList<Integer> v = new ArrayList<Integer>();
		v.add(10);
		System.out.println("현재 저장된 요소의 갯수 > "+v.size());
		
		for (int i =0; i <= 10; i++) {
			v.add(i);
		}
		System.out.println("현재 array에 저장된 요소 개쇼ㅜ> "+v.size());
		System.out.println("array에 저장된 0번 요소 > "+v.get(0));

		for(int i = 0; i < v.size(); i++) {
			int data = v.get(i);
			System.out.println(i+"번째 요소 > "+data);

		}
	}
}
