package Test;

import java.util.Scanner;

public class SwitchTest02 {
	public static void main(String[] args) {
		Scanner Key = new Scanner(System.in);
		System.out.print("주민번호입력:");
	    int ssn = Key.nextInt();
	    switch(ssn) { //ssn은 평가할 값이 저장된 변수
	    case 1: // ssn이 1인 경우 실행할 문장을 정의  비교연산자 사용 불가
	    case 3:
	    	System.out.print("남자");
	    	break;
	    	
	    case 2:
	    case 4:
	    	System.out.print("여자");
	    	break;
	    	
	    default :
		    	System.out.print("기타");
	    }
	}

}
