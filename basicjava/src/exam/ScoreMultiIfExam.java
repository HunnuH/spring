package exam;
import java.util.Scanner;
public class ScoreMultiIfExam {
	public static void main(String[] args) {
/*다중 if, if문을 중첩  scanner 클래스를 이용해서 입력
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
		
		if (score >=0 & score < 60) {
			System.out.println("F학점");
		} else if (score >=60 & score < 70) {
			System.out.println("D학점");
		}  else if (score >=70 & score < 80) {
			System.out.println("C학점");
		}  else if (score >=80 & score < 90) {
			System.out.println("B학점");
		}  else if (score >=90 & score <= 100) {
			System.out.println("A학점");
		}  else {
			System.out.println("잘못된 입력입니다.");
		} 
	}
}
