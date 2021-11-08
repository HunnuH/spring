package Test;
// 비교연산자
public class OprTest02 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		int num3 = 200;
           
// num의 변수가 +연산자 때문에 문자열로 변환됨 
// +의 연산자는 더하기의 의미 이외에도 연결연산자의 기능도 수행
// +연산자 앞에 문자열이 존재하면 뒤에 숫자열이 오더라도 문자열로 변환
// 비교연산. 사친연산을할 수 없다.
		System.out.println("더한결과==>"+(num1+num2));
		System.out.println("num1>num2==>"+ (num1>num2));
		System.out.println("num1>=num2==>"+ (num1>=num2));
		System.out.println("num1<num2==>"+ (num1<num2));
		System.out.println("num1<=num2==>"+ (num1<=num2));

		System.out.println("num1==num3==>"+ (num1==num3));
		System.out.println("num2==num3==>"+ (num2==num3));
		System.out.println("num1!=num3==>"+ (num1!=num3));
	}
}
