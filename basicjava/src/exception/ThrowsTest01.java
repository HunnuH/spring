package exception;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class ThrowsTest01 {
	public void test(String fileName) {
		try {
		FileReader fr = new FileReader("text.txt");
		}catch(FileNotFoundException e) {
			System.out.println("����ó�� �Ϸ�");
		}
	}
	public void test2(String fileName) throws FileNotFoundException{
		FileReader fr = new FileReader(fileName);
	}
	public static void main(String[] args) {
		ThrowsTest01 obj =new ThrowsTest01() ;
		obj.test("test1.txt");
		obj.test("test2.txt");
		
		try {
		obj.test2("test1.txt");
		}catch(FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�. ���ϼ��� ��ȭ���ڸ� �����Ͽ� ������ ���� �����ϵ��� ó�� >A���");
		}
		try {
			obj.test2("test2.txt");	
		}catch(FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�. ���ϼ��� ��ȭ���ڸ� �����Ͽ� ������ ���� �����ϵ��� ó�� >B���");
		}
	}
}
