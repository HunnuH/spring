package exam;

import java.util.Random;

public class APIExam02_1 {

	public static void main(String[] args) {
/*random Ŭ������ ���� ���� : read
 * 1���� 100���� �������� ���
 * [�������]
 * ������ : 		
 */
			
		Random rnd1 = new Random();
		int result1 = rnd1.nextInt(100)+1;
		System.out.println("������:"+result1);
		
	}

}