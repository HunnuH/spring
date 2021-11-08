package Test;

public class APITest {
	public static void main(String[] args) {
       System.out.println("문자열");
       int i =10;
//문자열을 처리하기 위한 기능을 사용하기 위해 string 클래스를 jvm이 인식하는  작업공간에 할당
       
/*     [형식]
 *     할당되는 클래스타입 변수명= new heap에 할당해서 사용하고 싶은 클래스명()
 *                         or new heap에 할당해서 사용하고 싶은 클래스명()
 *     java문자열을 처리하기 위해서 string클래스를 heap에 할당
 *     heap할당된 string객체를 APITest.javad의 main블럭에서 사용하기 위해 str변수를 통해 접근할수 있도록 heap의 주소를 설정  */
       String str = new String("java");
       Thread t = new Thread();
       Object o = new Object();
       
       
/*     str이 참조하는 주소를 가지고 heap에 있는 객체를 참조
 *     heap에 할당된 string객체의 length메소드를 참조       */
       str.length();//메소드호출
 	}
}
