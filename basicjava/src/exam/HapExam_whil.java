package exam;
public class HapExam_whil {
	public static void main(String[] args) {
		int sum = 0;
		int zsum = 0;
		int hsum = 0;
		int i =1;
		while(i<=100) {
			sum +=i;
			if (i%2==0) {
				zsum=zsum+i;
			}
			else {
				hsum = hsum+i;
			}
			i++;
		}
		System.out.println("1���� 100������ ����:"+sum);
		System.out.println("1���� 100������ Ȧ���� ����:"+hsum);
		System.out.println("1���� 100������ ¦���� ����:"+zsum);
	}
}
