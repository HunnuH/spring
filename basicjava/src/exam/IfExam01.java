package exam;

import java.util.Random;

public class IfExam01 {
	public static void main(String[] args) {
/* 랜덤수를 발생기키고 0,음수,양수를 판별하여 출력
 * ex) 2144>양수  -2134>음수  0>0
 * [출력형태]
 * 랜덤수 => 판별 */
		Random rnd = new Random();
		int result = rnd.nextInt();
	
		if (result > 0) {
		System.out.println(result+" -> 양수");
				}
		else if (result < 0) {
		System.out.println(result+" -> 음수");
		        }
		else {
		System.out.println(result+" -> 0");
		        }
		}
	}

