package exam;

import java.util.Random;

public class IfExam01 {
	public static void main(String[] args) {
/* �������� �߻���Ű�� 0,����,����� �Ǻ��Ͽ� ���
 * ex) 2144>���  -2134>����  0>0
 * [�������]
 * ������ => �Ǻ� */
		Random rnd = new Random();
		int result = rnd.nextInt();
	
		if (result > 0) {
		System.out.println(result+" -> ���");
				}
		else if (result < 0) {
		System.out.println(result+" -> ����");
		        }
		else {
		System.out.println(result+" -> 0");
		        }
		}
	}

