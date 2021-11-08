package Test;

public class VariableTest {

	public static void main(String[] args) {
		// 기본형변수
		int i = 10;
		int j = 10;
		System.out.println("======기본형=======");
		if(i==j) {
		System.out.println("기본형과 같다");
		}else {
			System.out.println("기본형과 다르다");
		}	
		//참조형변수	
		String str1 = new String("java");
		String str2 = new String("java");
		System.out.println("======참조형======");
		//참조형변수에서 ==은 주소의 비교
		if(str1==str2) {
	    System.out.println("참조형과 같다");
		}else {
			System.out.println("참조형과 다르다");
		}
		
		//문자열비교 = string클래스의 메소드로 처리
		//boolean result = str.2equals(str1);
		if(str1.equals(str2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}  
		//참조형과 기본형 변수에 저장된 값 확인하기
		/*int num = 100;
		Random rand = new Random();
		Random rand2 = new Random();
		   System.out.println("기본형:"+num);
		   System.out.println("참조형:"+rand);
		   System.out.println("참조형:"+rand2);
	*/}
}
