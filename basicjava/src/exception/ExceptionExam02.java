package exception;
import java.util.Scanner;
public class ExceptionExam02 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("���ڷ� ��ȯ�� ���ڿ��� �Է¹ٶ��ϴ�.");
		String str= scan.nextLine();
		int result= 0;
		try {
		System.out.println("��ȯ�� ���ڴ�"+convert(str)+"�Դϴ�");
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	private static int convert(String str) throws IllegalArgumentException{
		int result =0;
		if(str == null | str.length()==0) {
			throw new IllegalArgumentException("���ܰ� �߻��Ͽ����ϴ�. ���ڿ��� �Է����� �ʰ� EnterŰ�� �����̽��ϴ�.");
		}
		result = Integer.parseInt(str);
		return result;
	}
}