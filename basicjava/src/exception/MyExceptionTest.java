package exception;
import java.util.Scanner;
public class MyExceptionTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num = key.nextInt();
		if(num%2==1) {
			throw new MyException();
		} catch(MyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
