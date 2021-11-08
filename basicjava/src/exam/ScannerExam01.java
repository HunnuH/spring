package exam;
import java.util.Scanner;
public class ScannerExam01 {
	public static void main(String[] args) {
/*scanner로 출력할 구구단을 입력받아 출력
 * [출력형태]
 * 출력 단 : 
 * 7*1=7
 * ....
 * 7*9:63  */
		Scanner key = new Scanner(System.in);
		System.out.print("단:");
		int i = key.nextInt();
		System.out.println(i+"단");
		
		for(int a=1;a<=9;a++) {
			System.out.println(i+"*"+a+"="+i*a);
		}
	}
}
