package exception;
import java.util.InputMismatchException;
import java.util.Scanner;
import exam.For2DExam01;
public class ExceptionTest04 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {
			System.out.println("start");
			System.out.println("숫자를 입력하세요");
			int num = key.nextInt();
			System.out.println("나눌 숫자를 입력하세요");
			int num2 = key.nextInt();
			System.out.println("결과:"+(num/num2));
			System.out.println("다른작업의 처리");
			System.out.println("end");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누었습니다. 다시입력하세요");
		}catch(InputMismatchException e) {
			System.out.println("숫자를 입력해야 합니다. 문자를 입력하셨습니다.");
		}catch(Exception e) {
			System.out.println("기타 처리하지 못한 오류가 있습니다.");
		}finally {
			System.out.println("========자원 반납========");
		}
	} 
}
