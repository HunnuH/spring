package inheritance;

public class StaticDemotest01 {

	public static void main(String[] args) {
		StaticDemo obj1 =new StaticDemo();
		obj1.display();
		System.out.println(obj1.num+","+obj1.staticnum);
		
		StaticDemo obj2 =new StaticDemo();
		obj2.display();
		System.out.println(obj2.num+","+obj2.staticnum);
		
		StaticDemo obj3 =new StaticDemo();
		obj3.display();
		System.out.println(obj3.num+","+obj3.staticnum);

	}

}
