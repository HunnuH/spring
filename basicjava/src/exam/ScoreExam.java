package exam;
/* 
ScoreExam.java
1.변수를 3개 선언
2.국어,영어,수학점수를 임의로 저장
3.출력결과를 다음과 같이 작성
[출력결과]
총점:
평균:
*/

public class ScoreExam
{     public static void main(String [] args) {
	    int K = 80;
		int E = 90;
		int M = 70;
        int tot = K + E + M;
		int avg = tot / 3;
         System.out.println("[출력결과]");
		 System.out.println("총점:"+tot);
		 System.out.print("평균:"+avg);
		       
   }
}