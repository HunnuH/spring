package Test;

public class VariableTest {

	public static void main(String[] args) {
		// �⺻������
		int i = 10;
		int j = 10;
		System.out.println("======�⺻��=======");
		if(i==j) {
		System.out.println("�⺻���� ����");
		}else {
			System.out.println("�⺻���� �ٸ���");
		}	
		//����������	
		String str1 = new String("java");
		String str2 = new String("java");
		System.out.println("======������======");
		//�������������� ==�� �ּ��� ��
		if(str1==str2) {
	    System.out.println("�������� ����");
		}else {
			System.out.println("�������� �ٸ���");
		}
		
		//���ڿ��� = stringŬ������ �޼ҵ�� ó��
		//boolean result = str.2equals(str1);
		if(str1.equals(str2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}  
		//�������� �⺻�� ������ ����� �� Ȯ���ϱ�
		/*int num = 100;
		Random rand = new Random();
		Random rand2 = new Random();
		   System.out.println("�⺻��:"+num);
		   System.out.println("������:"+rand);
		   System.out.println("������:"+rand2);
	*/}
}
