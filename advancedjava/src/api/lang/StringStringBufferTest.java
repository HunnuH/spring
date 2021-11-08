package api.lang;
public class StringStringBufferTest {
	//string 으로 문자열 추가하기 기능을 수행 +연산자로 추가
	public static void stringCheck(int count) {
		String str = new String("자바");//시작할때 현재시간을 측정
		long start = System.nanoTime();
		for(int i=1;i<=count;i++) {
			str = str+"java";
		}
		long end = System.nanoTime();//종료할때 현재시간을 측정
		long time = end-start;
		System.out.println("str = str + java");
		System.out.println("실행시간 > "+time);
	}
	//string buffer로 문자열 추가 append
		public static void stringBufferCheck(int count) {
			StringBuffer sb = new StringBuffer("자바"); //시작할때 현재시간 측정
			long start = System.nanoTime();
			for(int i=1;i<=count;i++) {
				sb.append("java");
			}
			
			long end = System.nanoTime();//종료할때 현재시간 측정
			long time = end-start;
			System.out.println("sb.append(\"java\")");
			System.out.println("실행시간 > "+time);
					
		}
}
