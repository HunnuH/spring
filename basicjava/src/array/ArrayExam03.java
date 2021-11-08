package array;
public class ArrayExam03 {
	public static void main(String[] args) {
           int[] ia = new int[] {3,7,1,8,10,2,15,2,10};
           int[] ib = new int[] {1,2,3,4,5};
           
           int sum = 0;
   		   int sum1 = 0;
   		   int sum2 = 0;
           for(int i=1;i<ia.length;i++) {
   			sum +=  sum + ia[i];
   			if (i%2==0) {
				sum1 = sum1+i;
			}else {
				sum2 = sum2+i;
			}
		}		
           System.out.println("(¹è¿­ ia)");
           System.out.println("Â¦¼öÃÑÇÕ:"+sum1);
   	   	   System.out.println("È¦¼öÃÑÇÕ:"+sum2);
   	   	   
   	        sum1 = 0;
		    sum2 = 0;
            for(int i=1;i<ib.length;i++) {
			    sum +=  sum + ib[i];
			if (i%2==0) {
				sum1 = sum1+i;
			}else {
				sum2 = sum2+i;
			}
		}		
           System.out.println("(¹è¿­ ib)");
           System.out.println("Â¦¼öÃÑÇÕ:"+sum1);
	       System.out.println("È¦¼öÃÑÇÕ:"+sum2);
	}
}
