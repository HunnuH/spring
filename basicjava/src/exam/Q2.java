package exam;
import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
            Scanner key = new Scanner(System.in);
            System.out.print("�ʱⰪ�� ������ �Է��ϼ���:");
            int val1 = key.nextInt();
            System.out.print("���������� ������ �Է��ϼ���:");
            int val2 = key.nextInt();
            System.out.print("�������� ������ �Է��ϼ���:");
            int val3 = key.nextInt();
            int sum = 0;
            for(int i=val1;i<=val2;i=+val3) {
            	sum = sum+i;
            }
            System.out.println("������"+"�Դϴ�.");
	}
}
