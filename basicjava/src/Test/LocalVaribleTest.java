package Test;
public class LocalVaribleTest {
	int i =0; //로컬변수 아님
	public static void main(String[] args) {
          int j = 10;//로컬변수
          int num;
// 로컬변수는 사용하기 전에 반그시 초기화 해야한다
          int val =0;
          if(j>=10) {
        	 val = 100;
        	  System.out.println("val="+val);
          }else {
        	  for(int k=0;k<=10;k++) {
        		  System.out.println(k);
        	  }
          }
//로컬변수는 선언된 블럭 내부에서만           
          System.out.println("val의 값"+val);
	}
}
