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
		System.out.println("1부터 100까지의 총합:"+sum);
		System.out.println("1부터 100까지의 홀수의 총합:"+hsum);
		System.out.println("1부터 100까지의 짝수의 총합:"+zsum);
	}
}
