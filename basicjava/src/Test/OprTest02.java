package Test;
// �񱳿�����
public class OprTest02 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		int num3 = 200;
           
// num�� ������ +������ ������ ���ڿ��� ��ȯ�� 
// +�� �����ڴ� ���ϱ��� �ǹ� �̿ܿ��� ���Ῥ������ ��ɵ� ����
// +������ �տ� ���ڿ��� �����ϸ� �ڿ� ���ڿ��� ������ ���ڿ��� ��ȯ
// �񱳿���. ��ģ�������� �� ����.
		System.out.println("���Ѱ��==>"+(num1+num2));
		System.out.println("num1>num2==>"+ (num1>num2));
		System.out.println("num1>=num2==>"+ (num1>=num2));
		System.out.println("num1<num2==>"+ (num1<num2));
		System.out.println("num1<=num2==>"+ (num1<=num2));

		System.out.println("num1==num3==>"+ (num1==num3));
		System.out.println("num2==num3==>"+ (num2==num3));
		System.out.println("num1!=num3==>"+ (num1!=num3));
	}
}
