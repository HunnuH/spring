package Test;

public class APITest {
	public static void main(String[] args) {
       System.out.println("���ڿ�");
       int i =10;
//���ڿ��� ó���ϱ� ���� ����� ����ϱ� ���� string Ŭ������ jvm�� �ν��ϴ�  �۾������� �Ҵ�
       
/*     [����]
 *     �Ҵ�Ǵ� Ŭ����Ÿ�� ������= new heap�� �Ҵ��ؼ� ����ϰ� ���� Ŭ������()
 *                         or new heap�� �Ҵ��ؼ� ����ϰ� ���� Ŭ������()
 *     java���ڿ��� ó���ϱ� ���ؼ� stringŬ������ heap�� �Ҵ�
 *     heap�Ҵ�� string��ü�� APITest.javad�� main������ ����ϱ� ���� str������ ���� �����Ҽ� �ֵ��� heap�� �ּҸ� ����  */
       String str = new String("java");
       Thread t = new Thread();
       Object o = new Object();
       
       
/*     str�� �����ϴ� �ּҸ� ������ heap�� �ִ� ��ü�� ����
 *     heap�� �Ҵ�� string��ü�� length�޼ҵ带 ����       */
       str.length();//�޼ҵ�ȣ��
 	}
}
