package Test;
public class StringTest {
	public static void main(String[] args) {
		String str = "java programing";
		  System.out.println(str.length());
		  System.out.println(str.charAt(2));
		  for(int i=0;i<str.length();i++ ) {
			  System.out.println((char)(str.charAt(i)+1));
		  }
		}
}
