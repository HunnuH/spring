package Test;
public class SwitchTest03 {
	public static void main(String[] args) {
       int data = 5;
       switch(data+60) {
       case'A' :
       System.out.println("A");
       break;
       case'B' :
           System.out.println("B");
           break;
       }
       String code = new String("A01");
    		   switch(code) {
    		   case"A01" :
    		       System.out.println("A01");
    		       break;
    		       case"A02" :
    		           System.out.println("A02");
    		           break;
    		   }
	}
}
