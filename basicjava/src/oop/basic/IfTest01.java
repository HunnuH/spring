package oop.basic;
import java.util.Random;
public class IfTest01 {
	public static void main(String[] args) {
		Random rnd = new Random();
		MyMethodUtil util = new MyMethodUtil();
		int num = rnd.nextInt(100)+1;
		util.scorecheck(num);
	}
}
