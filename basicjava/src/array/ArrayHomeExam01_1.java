package array;
import java.util.Random;
import java.util.Scanner;
public class ArrayHomeExam01_1 {
	public static void main(String[] args) {
		int[] myarr = new int[5];
		Scanner key =new Scanner(System.in);
	    Random ram = new Random();
	    for(int i=0;i<myarr.length;i++) {
	    	System.out.print("�񿭿�ҿ� ����� ��:");
	    	myarr[i] = key.nextInt();
	    }
	    for(int i=0;i<myarr.length;i++) {
	    	myarr[i] = ram.nextInt(50+1);
	    	if(myarr[i]%2==0){	   
	     System.out.println("��������:"+myarr[i]+"���� > ¦��");
	    } else {
	     System.out.println("��������:"+myarr[i]+"���� > Ȧ��");
	    }
	    	 
	  }
   }
}
/* int�� �迭�� �����ϰ� �Ʒ��� ���� ������ ������ �� �յ��� �۾�
 * [����]
 * int�� ������ 5���� ������ �� �ֵ��� ����
 * ������ 1~50���� �迭������ ����ҿ� ����
 * �迭��ҿ� ����� ���� ¦������ Ȧ������ �Ǻ��Ͽ� ���
 * 
 * [�������]
 *  ����
 * �������� 25 ���� > Ȧ��
 * �������� 42 ���� > ¦��
 * �������� 25 ���� > Ȧ��
 * �������� 25 ���� > Ȧ��
 * �������� 25 ���� > Ȧ��   */