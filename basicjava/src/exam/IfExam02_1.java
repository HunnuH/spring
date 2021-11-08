package exam;
import java.util.Scanner;
public class IfExam02_1 {
	public static void main(String[] args) {
/* 1.성별코드 1~4,   나이 1~100
 * 2.성별과 나이를 가지고 판단해서 결과를 출력
 *   성인남자: 성별코드1,3 나이 20세 이상
 *   성인여자: 성별코드2,4 나이 20세 이상
 *   청소년여자: 성별코드1,3 나이 20세 미만
 *   청소년남자: 성별코드2,4 나이 20세 미만  */
		Scanner Key = new Scanner(System.in);
		System.out.print("성별코드를 입력하세요");
		int mf = Key.nextInt();
		System.out.print("나이를 입력하세요");
		int age = Key.nextInt();
				
		if (mf == 1 || mf ==3) {
			if (age>=20)
			    System.out.println("성인남자("+age+","+mf+")");
			else {
				System.out.println("청소년남자("+age+","+mf+")");
				        }
		}
	else {
				if (age>=20)
				    System.out.println("성인여자("+age+","+mf+")");
				else {
					System.out.println("청소년여자("+age+","+mf+")");
			 }
		 }
	  }
	}