package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//beanfactory <<>>application
public class MySpringTest3 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/bean.xml");
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("mybean");
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("mybean");
		if(obj==obj2 ) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
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
