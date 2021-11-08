package array;
//2차원배열의 선언,생성,초기화 동시 작업
public class Array2DTest02 {
	public static void main(String[] args) {
		int[][] data = {
				           {97,88,77,66,88},
				           {17,82,75,34,123},
				           {47,234,44,25,46},
				           {37,34,35,44,75}
		               };
		
		int[][] data2 = new int[][]{
		           {97,88,77,66,88},
		           {17,82,75,34,123},
		           {47,234,44,25,46},
		           {37,34,35,44,75}
                                    };
                                    
/*1차원 배열 hapdata를 선언하고 2차원배열의 각 요소에 참조하는 배열의 전체 합을 저장하고 출력
 * 0.hapdata에 1차원배열 선언                                   */
          int [] hapdata = new int[data.length];
          int sum = 0;
          for (int i=0;i<data.length;i++) {
        	  sum=0;
        	  for(int j=0;j<data[i].length;j++ ) {
//1. 2중fot문 안에서 2차원배열의 각 요소의 합을 구한다
        		  sum =sum +data[i][j];
        	  }
//2.hapdata에 1번에서 더한 결과를 저장
        	  hapdata[i] = sum;
          }
 //3 새로운 for문으로 hapdata에 저장된 각 합을 출력하기   
          for(int i=0;i<data.length;i++) {
        	  System.out.println(hapdata[i]+"\t");
          }
	}
}
