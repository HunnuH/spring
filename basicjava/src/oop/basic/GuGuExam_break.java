package oop.basic;
import java.util.Scanner;
public class GuGuExam_break {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("��:");
		int i = key.nextInt();
		System.out.println(i+"��");

		MyMethodUtil obj = new MyMethodUtil();
		obj.printgugu(i);
	}
}
