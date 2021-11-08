package Test;
//기본형 데이터의 형변환
public class PrimitiveTyprCastingTest {
	public static void main(String[] args) {
//	자동형변화 : 내부에서 자동처리
		byte b = 100;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		
		char c= 'A'; 
		int data = c;
// char가 int로 자동캐스팅이 가능한 이유 char가 각각 ASCII라는 코드값이 정의되어 있기 때문		
		System.out.println(l);
		System.out.println(d);
		System.out.println(data);
		
		
//	명시적형변환 : 직접 타입을 변경
		byte bdata = (byte)128;
		
		System.out.println(bdata);
   }
}	
