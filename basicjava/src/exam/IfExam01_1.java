package exam;
import java.util.Scanner;

public class IfExam01_1 {
	public static void main(String[] args) {
/* �������� �߻���Ű�� 0,����,����� �Ǻ��Ͽ� ���
 * ex) 2144>���  -2134>����  0>0
 * [�������]
 * ������ => �Ǻ� */
		
		Scanner Key = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num = Key.nextInt();
	
		if (num > 0) {
		System.out.println(num+" -> ���");
				}
		else if (num < 0) {
		System.out.println(num+" -> ����");
		        }
		else {
		System.out.println(num+" -> 0");
		        }
		}
	}