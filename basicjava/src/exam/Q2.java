package exam;
import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
            Scanner key = new Scanner(System.in);
            System.out.print("초기값을 정수로 입력하세요:");
            int val1 = key.nextInt();
            System.out.print("마지막값을 정수로 입력하세요:");
            int val2 = key.nextInt();
            System.out.print("증가분을 정수로 입력하세요:");
            int val3 = key.nextInt();
            int sum = 0;
            for(int i=val1;i<=val2;i=+val3) {
            	sum = sum+i;
            }
            System.out.println("총합은"+"입니다.");
	}
}
