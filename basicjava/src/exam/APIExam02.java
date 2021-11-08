package exam;

import java.util.Random;

public class APIExam02 {

	public static void main(String[] args) {
// random클래스의 nextint()메소드를 호출하여 랜덤수를 다음과 같이 출력하세요
/*random 클래스의 참조 변수 : read
 * [출력형태]
 * 랜덤수 : 		
 */
		Random rnd = new Random();
		int result = rnd.nextInt();
		System.out.println("랜덤수:"+result);
		
	}

}
