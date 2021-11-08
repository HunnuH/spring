package exception;
import java.util.Scanner;
public class ExceptionTest02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		//예외 발생 가능성이 있는코드
		try {
			System.out.println("start");
			System.out.println("숫자를 입력하세요");
			int num = key.nextInt();
			System.out.println("나눌 숫자를 입력하세요");
			int num2 = key.nextInt();
			System.out.println("결과:"+(num/num2));
			System.out.println("다른작업의 처리");
			System.out.println("end");
		} catch(Exception e) {
			System.out.println("예외발생!!");
			System.out.println("예외처리코드 - 정상 실행되도록 코드를 작성");
			//예외객체를 참조하는 참조변수 e를 이용해서 예외객체가 갖고 있는 메소드를 액세스 할수있다.
			System.out.println(e.getMessage());
			//개발시 가장 많이 사용되는 예외객체의 메소드
			e.printStackTrace();
		}
	}
}
