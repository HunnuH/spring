package exam;
import java.util.Scanner;
public class GuGuExam_while {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("��:");
		int i = key.nextInt();
		System.out.println(i+"��");
		int k=1;
		
		while(k<=9) {
			System.out.println(i+"*"+k+"="+i*k);
			k++;
		}
   }
}
