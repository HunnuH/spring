package exam;
import java.util.Scanner;

public class IfExam01_1 {
	public static void main(String[] args) {
/* 랜덤수를 발생기키고 0,음수,양수를 판별하여 출력
 * ex) 2144>양수  -2134>음수  0>0
 * [출력형태]
 * 랜덤수 => 판별 */
		
		Scanner Key = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = Key.nextInt();
	
		if (num > 0) {
		System.out.println(num+" -> 양수");
				}
		else if (num < 0) {
		System.out.println(num+" -> 음수");
		        }
		else {
		System.out.println(num+" -> 0");
		        }
		}
	}