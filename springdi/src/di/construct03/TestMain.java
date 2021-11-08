package di.construct03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		IWriteArticleMgr mgr = (IWriteArticleMgr)factory.getBean("mgr");
		mgr.write(new ArticleDTO());
	}
}
