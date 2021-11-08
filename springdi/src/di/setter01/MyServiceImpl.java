package di.setter01;
public class MyServiceImpl implements MyService {
	
		String name;
		String msg;
		Logic logicObj;
		
		public MyServiceImpl() {
			System.out.println("기본생성자");
		}
		
		public void setName(String name) {
			this.name = name;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public void setLogicObj(Logic logicObj) {
			this.logicObj = logicObj;
		}

		public MyServiceImpl(String name) {
					super();
					this.name = name;
					System.out.println("1개생성자");
				}
		public MyServiceImpl(String name, String msg, Logic logicObj) {
			super();
			this.name = name;
			this.msg = msg;
			this.logicObj = logicObj;
			System.out.println("3개생성자");
		}
		@Override
		public void testLogic() {
			System.out.println(msg+","+name);
			logicObj.testLogic();

	}
}
