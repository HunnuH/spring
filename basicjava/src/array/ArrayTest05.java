package array;
public class ArrayTest05 {
	public static void main(String[] args) {
//Ÿ���� �ַ� ����ϴ� �迭���� ������� , �� ���е� ������ �迭�� ����� ����
//�迭�� ����� ���� > 5
		int[] myarr = {10,20,30,40,50};
		System.out.println("�迭 ���� "+ myarr.length);
		for(int i=0;i<myarr.length;i++) {
			System.out.println(myarr[i]);
		}
//�ڹٴ䰳 �迭�� ����� ������ �ʱ�ȭ�� �ѹ��� �۾��ϱ�		
		int[] myarr2 = new int[] {10,20,30,40,50};
		System.out.println("�迭 ���� "+ myarr2.length);
		for(int i=0;i<myarr2.length;i++) {
			System.out.println(myarr2[i]);
		}
		
		String str = new String("java");
		String str2 = "java";
		String[] myarr3 = {"o","h","h","s"};
		System.out.println("�迭 ���� "+ myarr3.length);
		for(int i=0;i<myarr3.length;i++) {
			System.out.println(myarr3[i]);
		}
	}
}
