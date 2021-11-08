package di.setter01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext container = new GenericXmlApplicationContext("/config/setter.xml");
		MyService service = (MyService)container.getBean("service");
		service.testLogic();
	}
}
