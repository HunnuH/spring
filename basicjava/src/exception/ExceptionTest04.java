package exception;
import java.util.InputMismatchException;
import java.util.Scanner;
import exam.For2DExam01;
public class ExceptionTest04 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {
			System.out.println("start");
			System.out.println("���ڸ� �Է��ϼ���");
			int num = key.nextInt();
			System.out.println("���� ���ڸ� �Է��ϼ���");
			int num2 = key.nextInt();
			System.out.println("���:"+(num/num2));
			System.out.println("�ٸ��۾��� ó��");
			System.out.println("end");
		}catch(ArithmeticException e) {
			System.out.println("0���� ���������ϴ�. �ٽ��Է��ϼ���");
		}catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է��ؾ� �մϴ�. ���ڸ� �Է��ϼ̽��ϴ�.");
		}catch(Exception e) {
			System.out.println("��Ÿ ó������ ���� ������ �ֽ��ϴ�.");
		}finally {
			System.out.println("========�ڿ� �ݳ�========");
		}
	} 
}
