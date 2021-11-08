package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
//beanfactory
public class MySpringTest {
	public static void main(String[] args) {
		//xml파일을  읽어서 분석할수 있도록 제공되는 스프링객체 설정
		Resource res = new ClassPathResource("/config/bean.xml ");
		//파싱된 xml문서에서 객체를 찾아올수있는 factory클래스 , Ioc컨테이너 클래스를 만든다
		BeanFactory factory = new XmlBeanFactory(res);
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
