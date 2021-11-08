package oop.basic;
//main메소드에 정의했던 내용을 메소드로 작성해서 호출
public class MyMethodUtil {
	
     public void scorecheck(int num) {
    	 if (num>=90) {
    			System.out.println("점수:"+num+"(합격)");
    					}
    			else{
    			System.out.println("점수:"+num+"(재시험)");
    			        }		
	}
     
      public int calc(int num, int sco1, int sco2) {
     	 int result = 0;
    	 switch(num) {
 		case 1:
 			result = sco1+sco2;
 			break;
 	    case 2:
 	    	result = sco1*sco2;
 		    break;
 	    case 3:
 	    	result = sco1-sco2;
 		    break;
 	    case 4:
 	    	result = sco1/sco2;
 		    break;
 	    }
    	 return result;
     }
         
      public void printnumber() {
    	 for(int i=2;i<=100;i+=2) {
 			if(i%2==0) {
 			System.out.println("짝수:"+i);
 			}
    	 }
     }
     
       public void printgugu(int i) {
    	   for(int a=1;a<=9;a++) {
   			System.out.println(i+"*"+a+"="+i*a);
   		}
     }
       
       public int getHap(int num) {
           int sum = 0;
    	   for(int i=1;i<=num;i++) {
   			sum = sum+i;
   		 }
    	   return sum;
      }
       
       public void printArray(int[] myarr, String arrName) {
    	  int sum1 = 0;
		  int sum2 = 0;
           for(int i=1;i<myarr.length;i++) {
			if (myarr[i]%2==0) {
				sum1 = sum1+myarr[i];
			}else {
				sum2 = sum2+myarr[i];
			}
		}		
          System.out.println("(배열"+arrName+")");
          System.out.println("짝수총합:"+sum1);
	      System.out.println("홀수총합:"+sum2);
       }
}
