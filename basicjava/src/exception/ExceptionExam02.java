package exception;
import java.util.Scanner;
public class ExceptionExam02 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
		String str= scan.nextLine();
		int result= 0;
		try {
		System.out.println("변환된 숫자는"+convert(str)+"입니다");
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	private static int convert(String str) throws IllegalArgumentException{
		int result =0;
		if(str == null | str.length()==0) {
			throw new IllegalArgumentException("예외가 발생하였습니다. 문자열을 입력하지 않고 Enter키를 누르셨습니다.");
		}
		result = Integer.parseInt(str);
		return result;
	}
}