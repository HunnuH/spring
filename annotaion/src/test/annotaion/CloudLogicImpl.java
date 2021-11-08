package test.annotaion;

import org.springframework.stereotype.Repository;

@Repository
public class CloudLogicImpl implements Logic {
	@Override
	public void testLogic() {
		System.out.println("클라우드 이용");
	}
}
