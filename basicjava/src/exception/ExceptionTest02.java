package exception;
import java.util.Scanner;
public class ExceptionTest02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		//���� �߻� ���ɼ��� �ִ��ڵ�
		try {
			System.out.println("start");
			System.out.println("���ڸ� �Է��ϼ���");
			int num = key.nextInt();
			System.out.println("���� ���ڸ� �Է��ϼ���");
			int num2 = key.nextInt();
			System.out.println("���:"+(num/num2));
			System.out.println("�ٸ��۾��� ó��");
			System.out.println("end");
		} catch(Exception e) {
			System.out.println("���ܹ߻�!!");
			System.out.println("����ó���ڵ� - ���� ����ǵ��� �ڵ带 �ۼ�");
			//���ܰ�ü�� �����ϴ� �������� e�� �̿��ؼ� ���ܰ�ü�� ���� �ִ� �޼ҵ带 �׼��� �Ҽ��ִ�.
			System.out.println(e.getMessage());
			//���߽� ���� ���� ���Ǵ� ���ܰ�ü�� �޼ҵ�
			e.printStackTrace();
		}
	}
}
