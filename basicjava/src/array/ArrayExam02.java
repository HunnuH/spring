package array;
public class ArrayExam02 {
	public static void main(String[] args) {
//int형 배열변수를 선언하고 98 100 89 99 86으로 초기화
//배열에 저장된 점수의 합계와 평균을 출력하기
		int[] myarr = new int[] {98,100,89,99,86};
		int sum = 0;
		double avg = 0.0;
		for(int i=0;i<myarr.length;i++) {
		   sum = sum +myarr[i];
		}
		avg = (double)sum/myarr.length;
				System.out.println("총합:"+ sum);
				System.out.println("평균:"+ avg);
	    }
      }
