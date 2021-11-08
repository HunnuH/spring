package Test;
import java.util.Scanner;
public class ForTest01_1 {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		for(int a=2;a<=9;a++) {
			for(int s=1;s<=9;s++) {				
				System.out.print(a+"*"+s+"="+(a*s) +"\t");
		   }
			System.out.println();
		}
	}
}

