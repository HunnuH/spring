package exam;
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("2~100������ ������ �Է��ϼ���:");
		int i = key.nextInt();
		int count =0;
		
		for(int k=1;k<=i;k++) {
			if(i%k==0) {
				count++;
		   }
     	}
		if(count>2) {
			System.out.println(i+"��(��) �Ҽ��� �ƴմϴ�");
		} else {
			System.out.println(i+"��(��) �Ҽ��Դϴ�");
		}
	}
}
