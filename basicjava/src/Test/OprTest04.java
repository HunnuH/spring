package Test;
//��������(short circuit) && , ||
//        & ,  |    ���� ���̴� ���ǽ��� ��� �˻��ϴ��� skip�ϴ����� ����
public class OprTest04 {
	public static void main(String[] args) {
          int num1 = 120;
          //int num2 = 
        System.out.println("start");
		String str = null; // ���� str�� �ƹ��͵� �Ҵ���� ���� ����

 	  //System.out.println(num1>100 | str.length()>0); �����߻�
		System.out.println(num1>100 || str.length()>0);
// ||�����ڴ� or������ Ư���� �ľ��ϰ� ù ���� ���� true ������ ���� ���� �˻����� �ʴ´� 

      //System.out.println(num1<100 & str.length()>0); �����߻�
	    System.out.println(num1<100 && str.length()>0);
// &&�����ڴ� and������ Ư���� �ľ��ϰ� ù ���� ���� false�̸� ���� ���� �˻����� �ʴ´�
	}
}
