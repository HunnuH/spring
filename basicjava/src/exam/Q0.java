package exam;
public class Q0 {
	public static void main(String[] args) {
		int sum = 0;
		int zsum = 0;
		int hsum = 0;
		for(int i=1;i<=100;i++) {
			sum +=i;
			if (i%2==0) {
				zsum=zsum+i;
			}
			else {
				hsum = hsum+i;
			}
		}
		System.out.println("1���� 100������ ����:"+sum);
		System.out.println("1���� 100������ Ȧ���� ����:"+hsum);
		System.out.println("1���� 100������ ¦���� ����:"+zsum);
	}
}
