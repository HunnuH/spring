package exam;
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요:");
		int gu = key.nextInt();
		if (gu<2 | gu>9) {
			System.out.print("잘못된 숫자가 입력되었습니다.");
			System.exit(0);
		}
		for(int d=1;d<=9;d++) {
			System.out.println(gu+"*"+d+"="+gu*d);
		}
	}
}
