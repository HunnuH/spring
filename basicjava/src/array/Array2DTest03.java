package array;
//������ �迭 - �迭�� ����� �ٸ��� �����ϰ� ���
public class Array2DTest03 {
	public static void main(String[] args) {
         char[] [] arr = new char[5][]; // ������ �迭�� 2���� �迭�� ��� ������ ����� ������ ���x
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
