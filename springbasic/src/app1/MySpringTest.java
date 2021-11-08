package app1;

public class MySpringTest {
			public static void main(String[] args) {
				MyBeanStyleB obj = new MyBeanStyleB();
				run(obj);
				show(obj);
			}
			public static void run(MyBeanStyleB obj) {
				System.out.println("*****************************");
				obj.testHello("장동건");
				obj.testHello("장동건");
				System.out.println("*****************************");
			}
			public static void show(MyBeanStyleB  obj) {
				obj.testHello("장동건");
				obj.testHello("장동건");
				obj.testHello("장동건");
				obj.testHello("장동건");
			}
			
}
