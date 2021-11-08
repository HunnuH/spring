package array;
import java.util.Random;
//참조형배열변수는 주소가 저장된다
public class ArrayTest03 {
	public static void main(String[] args) {
//int형 배열 - int값을 저장하기 위한 변수 두개를 배열로 정의		
		int[] intArr = new int[2];
		intArr[0] = 100;
		intArr[1] = 200;
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
//string형 배열 - string변수는 원래 heap에  할당된 객체의 주소를 저장하는 변수
//              따라서 string배열은 string 객체를 참조하는 변수 3개를 배열로 정의
//              참조형 배열은 참조형변수 여러개를 배열로 정의		
		String[] strArr = new String[3];
		strArr[0] = new String("java");
		strArr[1] = new String("jsp");
		strArr[2] = new String("spring");
		
//random형 배열 -		
		Random[] ramdArr = new Random[3];
		ramdArr[0] = new Random();
		ramdArr[1] = new Random();
		ramdArr[2] = new Random();
		
		System.out.println("Random" +ramdArr[0]);
		System.out.println("Random" +ramdArr[1]);
		System.out.println("Random" +ramdArr[2]);

	}

}
