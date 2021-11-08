package api.lang;
public class StringTest01 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		
		String str3 = new String("java");
		String str4 = new String("java");
		
		if(str1==str2) {
			System.out.println("long");
		}else {
			System.out.println("diffrent");
		}
	}
}
