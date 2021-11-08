package exam;

import java.io.File;
import java.util.Random;

//APIExam01클래스 내부에서 사용하는 API의 클래스를 java.utill패키지에서 찾을수도있도록 설정
///import java.util.Random;
//import java.util.*;
//import java.io.File;

//"I like java"문자열을 아래 조건에 맞게 처리할 수 있도록 string클래스를 만들어 작업
//string클래스를 만들고 str변수를 통해 참조할 수 있도록 처리
//string클래스에 정의되어 있는 length메소드를 호출
/*[출력형태]
 * 문자열의 길이:
 */
public class APIExam01 {

	public static void main(String[] args) {
	String str = new String("I like java");	
	int result = str.length();	
	System.out.println("문자열의 길이:"+result);
	
	//JVM이 기본으로 인식하는 API의 위치는 java.lang패키지와 현재 소스파일을 작업하는 위치
	new Random();
    new File(" ");
    
	}

}
