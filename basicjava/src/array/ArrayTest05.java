package array;
public class ArrayTest05 {
	public static void main(String[] args) {
//타언어에서 주로 사용하는 배열선언 방식으로 , 로 구분된 갯수가 배열의 요소의 갯수
//배열의 요소의 갯수 > 5
		int[] myarr = {10,20,30,40,50};
		System.out.println("배열 길이 "+ myarr.length);
		for(int i=0;i<myarr.length;i++) {
			System.out.println(myarr[i]);
		}
//자바답개 배열의 선언과 생성과 초기화를 한번에 작업하기		
		int[] myarr2 = new int[] {10,20,30,40,50};
		System.out.println("배열 길이 "+ myarr2.length);
		for(int i=0;i<myarr2.length;i++) {
			System.out.println(myarr2[i]);
		}
		
		String str = new String("java");
		String str2 = "java";
		String[] myarr3 = {"o","h","h","s"};
		System.out.println("배열 길이 "+ myarr3.length);
		for(int i=0;i<myarr3.length;i++) {
			System.out.println(myarr3[i]);
		}
	}
}
