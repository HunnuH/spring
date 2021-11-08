package api.lang;
public class StringStringBufferTest {
	//string ���� ���ڿ� �߰��ϱ� ����� ���� +�����ڷ� �߰�
	public static void stringCheck(int count) {
		String str = new String("�ڹ�");//�����Ҷ� ����ð��� ����
		long start = System.nanoTime();
		for(int i=1;i<=count;i++) {
			str = str+"java";
		}
		long end = System.nanoTime();//�����Ҷ� ����ð��� ����
		long time = end-start;
		System.out.println("str = str + java");
		System.out.println("����ð� > "+time);
	}
	//string buffer�� ���ڿ� �߰� append
		public static void stringBufferCheck(int count) {
			StringBuffer sb = new StringBuffer("�ڹ�"); //�����Ҷ� ����ð� ����
			long start = System.nanoTime();
			for(int i=1;i<=count;i++) {
				sb.append("java");
			}
			
			long end = System.nanoTime();//�����Ҷ� ����ð� ����
			long time = end-start;
			System.out.println("sb.append(\"java\")");
			System.out.println("����ð� > "+time);
					
		}
}
