package exam;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		Scanner Key = new Scanner(System.in);
		System.out.println("-----menu-----");
		System.out.println("1.가정용 (liter당 50원)");
		System.out.println("2.상업용 (liter당 45원)");
		System.out.println("3.공업용 (liter당 30원)");
		System.out.println("--------------");
		System.out.print("메뉴를 선택하세요=>");
		int menu = Key.nextInt();
		System.out.println("--------------");
		System.out.print("사용량을 입력하세요=>");
		int use = Key.nextInt();
		int result = 0;
		int result1 = 0;
		
		switch(menu) {
		case 1:
			result = use*50;
			result1 = (int) (result+(result*0.05));
			break;
	    case 2:
	    	result = use*45;
	    	result1 = (int) (result+(result*0.05));
		    break;
	    case 3:
	    	result = use*30;
	    	result1 = (int) (result+(result*0.05));
		    break;
	    }
		System.out.println("==============");
		System.out.println("사용자코드: " +menu);
		System.out.println("사용요금: " +result); 
		System.out.println("총수도요금: " +result1);
		System.out.println("==============");
	}
}
