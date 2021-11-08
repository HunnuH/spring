package exam;
import java.util.Scanner;
public class GuGuExam_break {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("´Ü:");
		int i = key.nextInt();
		System.out.println(i+"´Ü");
		
		for(int a=1;a<=9;a++) {
			/*if(a==5) {
				break;
			}*/
			System.out.println(i+"*"+a+"="+i*a);
		}
   }
}
