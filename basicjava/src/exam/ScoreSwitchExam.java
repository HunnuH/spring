package exam;
import java.util.Scanner;
public class ScoreSwitchExam {
	public static void main(String[] args) {
/*switch문을 이용
 * 0~59 f학점
 * 60~69 d학점
 * 70~79 c학점
 * 80~89 b학점
 * 90~100 a학점
 * 110 or -40 잘못된입력
 * [출력형태]
 * 점수 : 
 *   학점   */
		Scanner Key = new Scanner(System.in);
		System.out.print("점수를 입력하세요");
		int score = Key.nextInt();
		System.out.println("점수:" +score);
		
		if(score < 0 | score >100) {
			System.out.print("잘못된 입력");
		}
		else { 
			switch(score/10) {
			case 10:
			case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default:
				System.out.println("F학점");
				break;
			}
		}
	}
}
