package Test;
//�⺻�� �������� ����ȯ
public class PrimitiveTyprCastingTest {
	public static void main(String[] args) {
//	�ڵ�����ȭ : ���ο��� �ڵ�ó��
		byte b = 100;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		
		char c= 'A'; 
		int data = c;
// char�� int�� �ڵ�ĳ������ ������ ���� char�� ���� ASCII��� �ڵ尪�� ���ǵǾ� �ֱ� ����		
		System.out.println(l);
		System.out.println(d);
		System.out.println(data);
		
		
//	���������ȯ : ���� Ÿ���� ����
		byte bdata = (byte)128;
		
		System.out.println(bdata);
   }
}	
