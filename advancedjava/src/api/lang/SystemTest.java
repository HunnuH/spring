package api.lang;
public class SystemTest {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int sum = 0;
		for(int i=0;i<=10000;i++ ) {
			sum=sum+i;
		}
		long end = System.currentTimeMillis();
		System.out.println("���α׷�����ð� " +(end-start));
	}
}
