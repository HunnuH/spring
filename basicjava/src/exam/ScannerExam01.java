package exam;
import java.util.Scanner;
public class ScannerExam01 {
	public static void main(String[] args) {
/*scanner�� ����� �������� �Է¹޾� ���
 * [�������]
 * ��� �� : 
 * 7*1=7
 * ....
 * 7*9:63  */
		Scanner key = new Scanner(System.in);
		System.out.print("��:");
		int i = key.nextInt();
		System.out.println(i+"��");
		
		for(int a=1;a<=9;a++) {
			System.out.println(i+"*"+a+"="+i*a);
		}
	}
}
