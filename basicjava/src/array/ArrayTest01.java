package array;
public class ArrayTest01 {
	public static void main(String[] args) {
//배열을 사용하지 않고 배열 선언
		int num1 =100;
		int num2 =200;
		int num3 =300;
		
		int[] myarr;
//3개의 int데이터를 저장할수있는 배열을 선언
		
		myarr = new int[3];
		System.out.println(myarr);
//3개의 int형 데이터를 저장할수있는 배열을 생성 		
		
		myarr[0] =100;
//배열의 초기화 - myarr참조변수가 참조하는 배열의 0번요소에 값을 100버으로 바꾸기
		
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
//배열의 초기화 하지 않아도 초기값이 있다
//myarr이 참조하는 배열의 0번요소의 값을 가져와서 출력
		
		int[] marry = new int[0];
		
	}
}
