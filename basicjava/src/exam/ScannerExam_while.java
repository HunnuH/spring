package exam;
import java.util.Scanner;
public class ScannerExam_while {
	public static void main(String[] args) {
		Scanner Key = new Scanner(System.in);
			while(true) {
				System.out.println("****미니계산기****");
				System.out.println("1.더하기");
				System.out.println("2.곱하기");
				System.out.println("3.빼기");
				System.out.println("4.나누기");
				System.out.println("5.종료");
				System.out.print("번호를 선택하세요");
			int num = Key.nextInt();
			
			switch(num ) {
			  case 5:
				  System.out.println("시스템이 종료 되었습니다.");
			     System.exit(0);
				}
			
				if(num <=0 | num>5) {
					System.out.println("잘못된 입력입니다.");
					System.out.println("다시 선택하여 주세요.");
					System.out.println("================");
					continue;
				} else {
									
				System.out.print("숫자를 입력하세요");
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
			System.out.println("계산결과: "+result);
			System.out.println("================");
				continue;
				}
			}
		}
	}