package oop.basic;
public class MyMethodTest {
	public static void main(String[] args) {
         MyMethod m =new MyMethod ();
         System.out.println("start");
         System.out.println("work1");
         m.display();
         
         System.out.println("work2");
         m.display();
         
         System.out.println("work3");
         m.display();
         m.display();
         
         
         m.display("★");
         m.display("☆");
         m.display("◇");
         
         
         m.display("★",20);
         m.display("■",10);
         m.display("▼",5);
         
         
         int result = m.add(100, 200);
         System.out.println("호출결과 :" +result);
         if(result>100) {
         System.out.println("big");
	       }else {
		 System.out.println("small");
	       }
         System.out.println(m.add(300, 500));
	 }
}
