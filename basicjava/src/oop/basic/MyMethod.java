package oop.basic;
public class MyMethod {
//1.매개변수가 없고 리턴값이 없는 메소드
		public void display() {
			for(int i=0;i<=10;i++) {
				System.out.print("*");
			}
		        System.out.println();
		}	
				
//2.매개변수가 1개있고 리턴값이 없는 메소드				
		public void display(String str) {
			for(int i=0;i<=10;i++) {
				System.out.print(str);		
			}
		    	System.out.println();
	    }
		
//3.매개변수가 2개있고 리턴값이 없는 메소드
		public void display(String str, int count) {
			for(int i=0;i<=count;i++) {
				System.out.print(str);	
	    	}
			    System.out.println();
        }
		
//4.매개변수가 있고 리턴값이 있는 메소드
		public int add(int n1, int n2) {
			int result = 0;
			result  = n1+n2;
			return result;
		}
}  