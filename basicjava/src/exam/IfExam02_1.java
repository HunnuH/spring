package exam;
import java.util.Scanner;
public class IfExam02_1 {
	public static void main(String[] args) {
/* 1.�����ڵ� 1~4,   ���� 1~100
 * 2.������ ���̸� ������ �Ǵ��ؼ� ����� ���
 *   ���γ���: �����ڵ�1,3 ���� 20�� �̻�
 *   ���ο���: �����ڵ�2,4 ���� 20�� �̻�
 *   û�ҳ⿩��: �����ڵ�1,3 ���� 20�� �̸�
 *   û�ҳⳲ��: �����ڵ�2,4 ���� 20�� �̸�  */
		Scanner Key = new Scanner(System.in);
		System.out.print("�����ڵ带 �Է��ϼ���");
		int mf = Key.nextInt();
		System.out.print("���̸� �Է��ϼ���");
		int age = Key.nextInt();
				
		if (mf == 1 || mf ==3) {
			if (age>=20)
			    System.out.println("���γ���("+age+","+mf+")");
			else {
				System.out.println("û�ҳⳲ��("+age+","+mf+")");
				        }
		}
	else {
				if (age>=20)
				    System.out.println("���ο���("+age+","+mf+")");
				else {
					System.out.println("û�ҳ⿩��("+age+","+mf+")");
			 }
		 }
	  }
	}