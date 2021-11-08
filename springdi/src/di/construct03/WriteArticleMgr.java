package di.construct03;
//service의 역할을 하는 클래스
public class WriteArticleMgr implements IWriteArticleMgr {
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
