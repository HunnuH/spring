package api.lang;
public class StringTest03 {
	public static void main(String[] args) {
		System.out.println("java\t pro");
		System.out.println("java\n pro");
		System.out.println("\"java\" pro\\m");
		System.out.println();
		System.out.println();
		
		String str1 = new String("java programming");
		String str2 = new String("fun");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("str1.charAt(1) > "+str1.charAt(1));
		System.out.println("str1.concat(str2) > "+str1.concat(str2));
		System.out.println("str1.indexOf('a') > "+str1.indexOf('a'));
		System.out.println("str1.indexOf('гу') > "+str1.indexOf("гу"));
		System.out.println("str1.lastIndexOf('a') > "+str1.lastIndexOf('a'));
		System.out.println("str1.length() > "+str1.length());
		System.out.println("str1.equals(\"java programming\") > "+str1.equals("java programming"));
		System.out.println("str1.equals(\"Java programming\") > "+str1.equals("Java programming"));
		System.out.println("str1.equalsIgnoreCase(\"Java programming\") > "+str1.equalsIgnoreCase("Java programming"));
		
		System.out.println();
		System.out.println();
		System.out.println("str1.startsWith(\"java\") > "+str1.startsWith("java"));
		System.out.println("str1.endsWith(\"java\") > "+str1.endsWith("java"));
		System.out.println("str1.toUpperCase() > "+str1.toUpperCase());
		
		String data = new String("java programming");
		data = data.toUpperCase();
		for(int i=data.length()-1 ;i>=0; i--) {
			System.out.print(data.charAt(i));
		}
	}

}
