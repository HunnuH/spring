package array;
//2�����迭�� ����,����,�ʱ�ȭ ���� �۾�
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
                                    
/*1���� �迭 hapdata�� �����ϰ� 2�����迭�� �� ��ҿ� �����ϴ� �迭�� ��ü ���� �����ϰ� ���
 * 0.hapdata�� 1�����迭 ����                                   */
          int [] hapdata = new int[data.length];
          int sum = 0;
          for (int i=0;i<data.length;i++) {
        	  sum=0;
        	  for(int j=0;j<data[i].length;j++ ) {
//1. 2��fot�� �ȿ��� 2�����迭�� �� ����� ���� ���Ѵ�
        		  sum =sum +data[i][j];
        	  }
//2.hapdata�� 1������ ���� ����� ����
        	  hapdata[i] = sum;
          }
 //3 ���ο� for������ hapdata�� ����� �� ���� ����ϱ�   
          for(int i=0;i<data.length;i++) {
        	  System.out.println(hapdata[i]+"\t");
          }
	}
}
