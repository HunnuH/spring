package exam.anno01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//service의 역할을 하는 클래스
@Service("mgr")
public class WriteArticleMgr implements IWriteArticleMgr {
	@Autowired
	@Qualifier("mysql")
	//@Qualifier("myoracle")
	IArticleDAO articleDAO;
	public WriteArticleMgr() {
		
	}
	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}
	@Override
	public void write(ArticleDTO article) {
		articleDAO.insert(article);
	}
}
