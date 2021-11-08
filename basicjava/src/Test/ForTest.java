package Test;
public class ForTest {
	public static void main(String[] args) {

	for(int row=1;row<=5;row++) {
		for(int i=1;i<=5;i++) {
			if(i==row) {
				System.out.print("³Ê\t");
			}else {
				System.out.print("2\t");
			}
		}
		System.out.println();
	}
  }
}