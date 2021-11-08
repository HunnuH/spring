package array;
public class Array2DExam01 {
	public static void main(String[] args) {
         int [] [] numarr = new int [5][5];
         int num =1;
         for(int i=0;i<numarr.length;i++) {
        	 for(int j=0;j<numarr[i].length;j++) {
        		 numarr[i][j] =num;
        		 num++;
        	 }
         }
         for(int i=0;i<numarr.length;i++) {
        	 for(int j=0;j<numarr[i].length;j++) {
                   System.out.print(numarr[i][j]+"\t");
        	 }
        	       System.out.println();
         }
	}
}
