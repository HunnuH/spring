package array;
import java.util.Random;
//�������迭������ �ּҰ� ����ȴ�
public class ArrayTest03 {
	public static void main(String[] args) {
//int�� �迭 - int���� �����ϱ� ���� ���� �ΰ��� �迭�� ����		
		int[] intArr = new int[2];
		intArr[0] = 100;
		intArr[1] = 200;
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
//string�� �迭 - string������ ���� heap��  �Ҵ�� ��ü�� �ּҸ� �����ϴ� ����
//              ���� string�迭�� string ��ü�� �����ϴ� ���� 3���� �迭�� ����
//              ������ �迭�� ���������� �������� �迭�� ����		
		String[] strArr = new String[3];
		strArr[0] = new String("java");
		strArr[1] = new String("jsp");
		strArr[2] = new String("spring");
		
//random�� �迭 -		
		Random[] ramdArr = new Random[3];
		ramdArr[0] = new Random();
		ramdArr[1] = new Random();
		ramdArr[2] = new Random();
		
		System.out.println("Random" +ramdArr[0]);
		System.out.println("Random" +ramdArr[1]);
		System.out.println("Random" +ramdArr[2]);

	}

}
