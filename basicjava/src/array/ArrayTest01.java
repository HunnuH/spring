package array;
public class ArrayTest01 {
	public static void main(String[] args) {
//�迭�� ������� �ʰ� �迭 ����
		int num1 =100;
		int num2 =200;
		int num3 =300;
		
		int[] myarr;
//3���� int�����͸� �����Ҽ��ִ� �迭�� ����
		
		myarr = new int[3];
		System.out.println(myarr);
//3���� int�� �����͸� �����Ҽ��ִ� �迭�� ���� 		
		
		myarr[0] =100;
//�迭�� �ʱ�ȭ - myarr���������� �����ϴ� �迭�� 0����ҿ� ���� 100������ �ٲٱ�
		
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
//�迭�� �ʱ�ȭ ���� �ʾƵ� �ʱⰪ�� �ִ�
//myarr�� �����ϴ� �迭�� 0������� ���� �����ͼ� ���
		
		int[] marry = new int[0];
		
	}
}
