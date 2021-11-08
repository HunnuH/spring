package exam.anno01;

import org.springframework.stereotype.Repository;

@Repository("myoracle")
public class OracleArticleDAO implements IArticleDAO {
	@Override
	public void insert(ArticleDTO article) {
		System.out.println("oracle로 insert");
	}

}
