package exam;
import java.util.Scanner;
public class ScannerExam_while {
	public static void main(String[] args) {
		Scanner Key = new Scanner(System.in);
			while(true) {
				System.out.println("****�̴ϰ���****");
				System.out.println("1.���ϱ�");
				System.out.println("2.���ϱ�");
				System.out.println("3.����");
				System.out.println("4.������");
				System.out.println("5.����");
				System.out.print("��ȣ�� �����ϼ���");
			int num = Key.nextInt();
			
			switch(num ) {
			  case 5:
				  System.out.println("�ý����� ���� �Ǿ����ϴ�.");
			     System.exit(0);
				}
			
				if(num <=0 | num>5) {
					System.out.println("�߸��� �Է��Դϴ�.");
					System.out.println("�ٽ� �����Ͽ� �ּ���.");
					System.out.println("================");
					continue;
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
			System.out.println("�����: "+result);
			System.out.println("================");
				continue;
				}
			}
		}
	}