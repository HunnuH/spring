package exam;

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
		
		switch(num) {
		case 1:
			result = sco1+sco2;
			break;
	    case 2:
	    	result = sco1*sco2;
		    break;
	    case 3:
	    	result = sco1-sco2;
		    break;
	    case 4:
	    	result = sco1/sco2;
		    break;
	    }
		System.out.println("����� : "+result);
		}
	}
}
