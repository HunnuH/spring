package array;
//가변형 배열 - 배열의 사이즈를 다르게 선언하고 사용
public class Array2DTest03 {
	public static void main(String[] args) {
         char[] [] arr = new char[5][]; // 가변형 배열이 2차원 배열인 경우 마지막 요소의 사이즈 명시x
         arr[0] = new char[1];
         arr[1] = new char[2];
         arr[2] = new char[3];
         arr[3] = new char[4];
         arr[4] = new char[5];
         
         for(int i=0;i<arr.length;i++) {
        	 for(int j=0;j<arr[i].length;j++) {
        		 arr[i][j] = '*';
        	 }
         }
         for(int i=0;i<arr.length;i++) {
        	 for(int j=0;j<arr[i].length;j++) {
        		    System.out.print(arr[i][j]);
        	 }
        	    System.out.println();
         }	 
	}
}
