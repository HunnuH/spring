package exam;
public class For2DExam02 {
	public static void main(String[] args) {
		char alpha = 'A';
		 for(char i=1;i<=5;i++) {
			 for(int a=1;a<=5;a++) {
				 if(i==a) {
		    	   System.out.print("*\t");
	       }else {
			  System.out.print(alpha+"\t");
	 }
				 alpha++;
			 }
			 System.out.println();
		 }
	}
}
