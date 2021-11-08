package array;
import java.util.Random;
import java.util.Scanner;
public class ArrayHomeExam01_1 {
	public static void main(String[] args) {
		int[] myarr = new int[5];
		Scanner key =new Scanner(System.in);
	    Random ram = new Random();
	    for(int i=0;i<myarr.length;i++) {
	    	System.out.print("비열요소에 저장될 값:");
	    	myarr[i] = key.nextInt();
	    }
	    for(int i=0;i<myarr.length;i++) {
	    	myarr[i] = ram.nextInt(50+1);
	    	if(myarr[i]%2==0){	   
	     System.out.println("랜덤수로:"+myarr[i]+"저장 > 짝수");
	    } else {
	     System.out.println("랜덤수로:"+myarr[i]+"저장 > 홀수");
	    }
	    	 
	  }
   }
}
/* int형 배열을 선언하고 아래와 같은 조건이 만족할 수 잇도록 작업
 * [조건]
 * int형 데이터 5개를 저장할 수 있도록 정의
 * 랜덤값 1~50까지 배열변수의 각요소에 저장
 * 배열요소에 저장된 값이 짝수인지 홀수인지 판별하여 출력
 * 
 * [출력형태]
 *  랜덤
 * 랜덤수로 25 저장 > 홀수
 * 랜덤수로 42 저장 > 짝수
 * 랜덤수로 25 저장 > 홀수
 * 랜덤수로 25 저장 > 홀수
 * 랜덤수로 25 저장 > 홀수   */