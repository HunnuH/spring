package exam;
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���:");
		int gu = key.nextInt();
		if (gu<2 | gu>9) {
			System.out.print("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			System.exit(0);
		}
		for(int d=1;d<=9;d++) {
			System.out.println(gu+"*"+d+"="+gu*d);
		}
	}
}
