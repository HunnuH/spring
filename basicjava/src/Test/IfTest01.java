package Test;

import java.util.Random;
//if~~else�� ����
public class IfTest01 {
	public static void main(String[] args) {
/* num������ 1���� 100������ �������� �߻���Ű�� 90�̻��̸� �հ�
 �������� ��������� ���
 [�������]
 ����:  () */
		Random rnd = new Random();
		int result = rnd.nextInt(100)+1;
	
		if (result>=90) {
		System.out.println("����:"+result+"(�հ�)");
				}
		else{
		System.out.println("����:"+result+"(�����)");
		        }		
	}
}
