package oop.basic;
public class MyMethod {
//1.�Ű������� ���� ���ϰ��� ���� �޼ҵ�
		public void display() {
			for(int i=0;i<=10;i++) {
				System.out.print("*");
			}
		        System.out.println();
		}	
				
//2.�Ű������� 1���ְ� ���ϰ��� ���� �޼ҵ�				
		public void display(String str) {
			for(int i=0;i<=10;i++) {
				System.out.print(str);		
			}
		    	System.out.println();
	    }
		
//3.�Ű������� 2���ְ� ���ϰ��� ���� �޼ҵ�
		public void display(String str, int count) {
			for(int i=0;i<=count;i++) {
				System.out.print(str);	
	    	}
			    System.out.println();
        }
		
//4.�Ű������� �ְ� ���ϰ��� �ִ� �޼ҵ�
		public int add(int n1, int n2) {
			int result = 0;
			result  = n1+n2;
			return result;
		}
}  