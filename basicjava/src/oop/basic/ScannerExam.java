package oop.basic;
import java.util.Scanner;
public class ScannerExam {
	public static void main(String[] args) {
		Scanner Key = new Scanner(System.in);
		System.out.println("****�̴ϰ���****");
		System.out.println("1.���ϱ�");
		System.out.println("2.���ϱ�");
		System.out.println("3.����");
		System.out.println("4.������");
		System.out.print("�����ڸ� �����ϼ���");
		int num = Key.nextInt();
		if(num <=0 | num>4) {
			System.out.println("�߸��Է�");
			System.exit(0); //����ý����� ���� ����
		} else {
		System.out.print("���ڸ� �Է��ϼ���");
		int sco1 = Key.nextInt();
		int sco2 = Key.nextInt();
		int result = 0;
		
		MyMethodUtil obj = new MyMethodUtil();
		result = obj.calc(num,sco1,sco2);
		System.out.println("����� : "+result);
		}
	}
}
