package Test;
/* 점수를 저장할 수 있는 변수를 선언하고 다음과 같은 추력형태로 출력되도록 작성
 90이상 pass
 90미만 fail
*/

public class IfElseTest {
	public static void main(String[] args) {
		int num = 98;
		if (num>=90) {
          System.out.println(num+"점수는 pass");
		}
         else{
			System.out.println(num+"점수는 fail");
        }
	}
}
