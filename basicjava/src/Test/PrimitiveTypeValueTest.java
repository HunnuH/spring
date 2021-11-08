//기본형변수에 저장되는 리터럴
package Test;
public class PrimitiveTypeValueTest {
//논리형 리터럴
	public static void main(String[] args) {
        boolean boolval = true; //false
        System.out.println(boolval);
// 정수형 리터럴 - byte,short,int,long(정수형 리터럴의 기본타입은 int)
// byte - 할당되는 메모리 크기 1byte
        byte b =127;
        System.out.println("byte :"+b);
 // short - 2byte
       short s =32767;
        System.out.println("short :"+s);
// int - 4byte  
        int i = 2147483647;
        System.out.println("int :"+i);
// long - 8byte , long타입의 리터럴은 접미사를 추가한다(1,L)
        long l = 2147483648L;
        System.out.println("long :"+l);
        
// 실수형 리터럴 - float,double(기본타입) 소수자리를 표현하기 위한 타입
// float - 4byte , 접미사를 추가한다(f,F)      
       float f = 10.5f;
       System.out.println("float :"+f);
// double - 8byte
       double d =10.5;
       System.out.println("double :"+d);
       
//char형 리터럴 - ' '
       char c = 'A';
       System.out.println("char :"+c);
       
//string형 리터럴 - 참조형이지만 자주 사용되므로 기본형처럼 사용할수있다( " " )
       String str = "참조형인 String의 리터럴은 큰따움표로 표현";
       System.out.println("String :"+str);
       }

}
