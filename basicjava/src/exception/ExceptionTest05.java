package exception;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class ExceptionTest05 {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr = new FileReader("text.txt");
	}
}
