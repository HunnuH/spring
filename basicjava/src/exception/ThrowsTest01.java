package exception;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class ThrowsTest01 {
	public void test(String fileName) {
		try {
		FileReader fr = new FileReader("text.txt");
		}catch(FileNotFoundException e) {
			System.out.println("예외처리 완료");
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
			System.out.println("파일을 찾을 수 없습니다. 파일선택 대화상자를 실행하여 파일을 직접 선택하도록 처리 >A방법");
		}
		try {
			obj.test2("test2.txt");	
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다. 파일선택 대화상자를 실행하여 파일을 직접 선택하도록 처리 >B방법");
		}
	}
}
