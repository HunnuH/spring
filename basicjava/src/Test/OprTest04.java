package Test;
//논리연산자(short circuit) && , ||
//        & ,  |    둘의 차이는 조건식을 모두 검사하는지 skip하는지의 차이
public class OprTest04 {
	public static void main(String[] args) {
          int num1 = 120;
          //int num2 = 
        System.out.println("start");
		String str = null; // 현재 str에 아무것도 할당되지 않은 변수

 	  //System.out.println(num1>100 | str.length()>0); 오류발생
		System.out.println(num1>100 || str.length()>0);
// ||연산자는 or연산의 특성을 파악하고 첫 번쨰 항이 true 연산자 뒤의 항은 검사하지 않는다 

      //System.out.println(num1<100 & str.length()>0); 오류발생
	    System.out.println(num1<100 && str.length()>0);
// &&연산자는 and연산의 특성을 파악하고 첫 번쨰 항이 false이면 뒤의 항은 검사하지 않는다
	}
}
