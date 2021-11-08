package Test;
/* TimeTest.ajva
   아래의 변수를 선헌하고 다음과 같은 조건을 만족하도록 작성
   int time = 8000; 초 데이터
   [출력결과]
   시간 분 초
   로 변경하여 출력
   */



public class TimeTest{
    public static void main(String[] args) {
		int time = 8000;
		int h = time/3600;
	    int m = time%3600/60;
		int s = time%3600%60;
	
		System.out.println(h+"시간"+m+"분"+s+"초");
	}
}
