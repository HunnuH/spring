package exam;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		Scanner Key = new Scanner(System.in);
		System.out.println("-----menu-----");
		System.out.println("1.������ (liter�� 50��)");
		System.out.println("2.����� (liter�� 45��)");
		System.out.println("3.������ (liter�� 30��)");
		System.out.println("--------------");
		System.out.print("�޴��� �����ϼ���=>");
		int menu = Key.nextInt();
		System.out.println("--------------");
		System.out.print("��뷮�� �Է��ϼ���=>");
		int use = Key.nextInt();
		int result = 0;
		int result1 = 0;
		
		switch(menu) {
		case 1:
			result = use*50;
			result1 = (int) (result+(result*0.05));
			break;
	    case 2:
	    	result = use*45;
	    	result1 = (int) (result+(result*0.05));
		    break;
	    case 3:
	    	result = use*30;
	    	result1 = (int) (result+(result*0.05));
		    break;
	    }
		System.out.println("==============");
		System.out.println("������ڵ�: " +menu);
		System.out.println("�����: " +result); 
		System.out.println("�Ѽ������: " +result1);
		System.out.println("==============");
	}
}
