package di.construct01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("/config/bean.xml");
		MyService service = (MyService)container.getBean("service");
		service.testLogic();
	}
}
