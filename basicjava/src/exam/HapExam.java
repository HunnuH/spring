package exam;
public class HapExam {
	public static void main(String[] args) {
/*1ºÎÅÍ 100±îÁöÀÇ ÇÕÀ» Ãâ·Â
 * [Ãâ·ÂÇüÅÂ]
 * ÃÑÇÕ:
 * Â¦¼öÇÕ:
 * È¦¼öÇÕ:    */
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		for(int i=1;i<=100;i++) {
			sum += i;
			if (i%2==0) {
				sum1 = sum1+i;
			}
			else {
				sum2 = sum2+i;
			}
		}
		
		System.out.println("ÃÑÇÕ:"+sum);
		System.out.println("Â¦¼öÃÑÇÕ:"+sum1);
		System.out.println("È¦¼öÃÑÇÕ:"+sum2);
		
	}
}
