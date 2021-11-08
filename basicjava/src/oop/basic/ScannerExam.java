package oop.basic;
import java.util.Scanner;
public class ScannerExam {
	public static void main(String[] args) {
		Scanner Key = new Scanner(System.in);
		System.out.println("****미니계산기****");
		System.out.println("1.더하기");
		System.out.println("2.곱하기");
		System.out.println("3.빼기");
		System.out.println("4.나누기");
		System.out.print("연산자를 선택하세요");
		int num = Key.nextInt();
		if(num <=0 | num>4) {
			System.out.println("잘못입력");
			System.exit(0); //현재시스템을 정상 종료
		} else {
		System.out.print("숫자를 입력하세요");
		int sco1 = Key.nextInt();
		int sco2 = Key.nextInt();
		int result = 0;
		
		MyMethodUtil obj = new MyMethodUtil();
		result = obj.calc(num,sco1,sco2);
		System.out.println("계산결과 : "+result);
		}
	}
}
