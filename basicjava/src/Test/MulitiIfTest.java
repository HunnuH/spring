package Test;
import java.util.Scanner;
public class MulitiIfTest {
	public static void main(String[] args) {
// 주민번호 7번째 자리 값을 입력받아 처리
      Scanner Key = new Scanner(System.in);
      System.out.print("주민번호입력:");
      int ssn = Key.nextInt();
      System.out.print(ssn);
      if (ssn==1 | ssn==3) {
    	  System.out.print("남자");
      } else if (ssn==2 | ssn==4) {
    	  System.out.print("여자");
      } else {
    	  System.out.print("기타");
      }
	}

}
