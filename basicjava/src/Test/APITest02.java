package Test;

public class APITest02 {
public static void main(String[] args ) {
	 String str = new String("java");
//string Ŭ������ ���ǵǾ� �ִ� charAt�޼ҵ带 ���
/* stringŬ������ charAt�޼ҵ�� �Ű������� 1���̰� �Ű������� Ÿ���� int charAt�� ����ϱ�
 * ���ؼ� ()�ȿ� int�� ���ڸ� �����Ѵ�.
 * charAt�� �������� charŸ���̹Ƿ� ���� ����� �� ���α׷� �ȿ��� Ȱ���ϱ� ���ؼ� charŸ���� ������
 * �����ؼ� ����� ����
 */
      char result = str.charAt(3);
      System.out.println("3����ġ�ǹ��ڴ�"+result);
}
}
