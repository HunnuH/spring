package array;
import java.util.Random;
public class ArrayHomeExam01 {
	public static void main(String[] args) {
		int[] myarr = new int[5];
	    Random ram = new Random();
//�迭�� �����͸� �����ϱ� ���� for��	    
	    for(int i=0;i<myarr.length;i++) {
	    	myarr[i] = ram.nextInt(50+1);
	    }
//�迭�� ����� �����͸� ������ ����ϱ� ���� for��	    
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