package api.basic;

import java.util.Scanner;

/*sacnner클래스의 기본 사용방법 > 직접 입력 받은 데이터를 평가
 * 표준입력-키보드입력 : System.in
 * 표준출력-화면출력 : System.out
 */
public class ScannerTest {
	public static void main(String[] args) {
		Scanner Key = new Scanner(System.in);
		System.out.println("키보드를 이용해서 문장을 입력하세요");
//전체 문장을 읽어서 리턴
		String line = Key.nextLine();
		System.out.println("사용자가 입력한 문장 >" +line);
		System.out.println("키보드를 이용해서 단어를 입력하세요");
		//단어읽기
//spacebar 또는 enter키가 입력 되기 전까지 입력한 단어를 읽어서 리턴
		String data = Key.next();
		System.out.println("입력받은 단어>"+data);
		System.out.println("키보드를 이용해서 정수를 입력하세요");
//정수일기
		int num = Key.nextInt();
		System.out.println("입력받은 숫자>"+num);
		System.out.println("키보드를 이용해서 숫자를 입력하세요");
//실수읽기
		double doubleval = Key.nextDouble();
		System.out.println("입력받은 실수>"+doubleval);
	}
}
