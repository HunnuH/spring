package array;
//2���� �迭 ���� �� �׼���
public class Array2DTest01 {
	public static void main(String[] args) {
          int[][] myarr= new int[3] [2];
          
          myarr[0][0] =100;
          myarr[1][0] =200;
          myarr[2][0] =300;
          
          for(int outer=0;outer<3;outer++) {
             for(int inner=0;inner<2;inner++) {
             System.out.print(myarr[outer][inner]+"\t");
             }
             System.out.println();
	     }
          System.out.println("�迭�� ���� > "+myarr.length);
          System.out.println("�迭�� ���� > "+myarr[0].length);
	}       
}
