package exam;
import java.util.Random;
public class IfExam02 {
	public static void main(String[] args) {
/* 1.������ �ΰ� �߻�
 *   �����ڵ� 1~4,   ���� 1~100
 * 2.������ ���̸� ������ �Ǵ��ؼ� ����� ���
 *   ���γ���: �����ڵ�1,3 ���� 20�� �̻�
 *   ���ο���: �����ڵ�2,4 ���� 20�� �̻�
 *   û�ҳ⿩��: �����ڵ�1,3 ���� 20�� �̸�
 *   û�ҳⳲ��: �����ڵ�2,4 ���� 20�� �̸�  */
		Random rnd1 = new Random();
		int mf = rnd1.nextInt(4)+1;
		Random rnd2 = new Random();
		int age = rnd2.nextInt(100)+1;
		
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


