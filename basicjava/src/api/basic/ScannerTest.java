package api.basic;

import java.util.Scanner;

/*sacnnerŬ������ �⺻ ����� > ���� �Է� ���� �����͸� ��
 * ǥ���Է�-Ű�����Է� : System.in
 * ǥ�����-ȭ����� : System.out
 */
public class ScannerTest {
	public static void main(String[] args) {
		Scanner Key = new Scanner(System.in);
		System.out.println("Ű���带 �̿��ؼ� ������ �Է��ϼ���");
//��ü ������ �о ����
		String line = Key.nextLine();
		System.out.println("����ڰ� �Է��� ���� >" +line);
		System.out.println("Ű���带 �̿��ؼ� �ܾ �Է��ϼ���");
		//�ܾ��б�
//spacebar �Ǵ� enterŰ�� �Է� �Ǳ� ������ �Է��� �ܾ �о ����
		String data = Key.next();
		System.out.println("�Է¹��� �ܾ�>"+data);
		System.out.println("Ű���带 �̿��ؼ� ������ �Է��ϼ���");
//�����ϱ�
		int num = Key.nextInt();
		System.out.println("�Է¹��� ����>"+num);
		System.out.println("Ű���带 �̿��ؼ� ���ڸ� �Է��ϼ���");
//�Ǽ��б�
		double doubleval = Key.nextDouble();
		System.out.println("�Է¹��� �Ǽ�>"+doubleval);
	}
}
