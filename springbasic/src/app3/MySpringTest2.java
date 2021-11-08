package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//application

public class MySpringTest2 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/bean.xml");
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("mybean");
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*****************************");
		obj.testHello("장동건");
		obj.testHello("장동건");
		System.out.println("*****************************");
	}
	public static void show(MyBeanStyle obj) {
		obj.testHello("장동건");
		obj.testHello("장동건");
		obj.testHello("장동건");
		obj.testHello("장동건");
	}
	
}
