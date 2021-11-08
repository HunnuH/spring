package exam;

import java.util.Random;

public class APIExam02_1 {

	public static void main(String[] args) {
/*random 클래스의 참조 변수 : read
 * 1부터 100까지 랜덤수를 출력
 * [출력형태]
 * 랜덤수 : 		
 */
			
		Random rnd1 = new Random();
		int result1 = rnd1.nextInt(100)+1;
		System.out.println("랜덤수:"+result1);
		
	}

}