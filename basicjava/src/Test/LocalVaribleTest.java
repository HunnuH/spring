package Test;
public class LocalVaribleTest {
	int i =0; //���ú��� �ƴ�
	public static void main(String[] args) {
          int j = 10;//���ú���
          int num;
// ���ú����� ����ϱ� ���� �ݱ׽� �ʱ�ȭ �ؾ��Ѵ�
          int val =0;
          if(j>=10) {
        	 val = 100;
        	  System.out.println("val="+val);
          }else {
        	  for(int k=0;k<=10;k++) {
        		  System.out.println(k);
        	  }
          }
//���ú����� ����� �� ���ο�����           
          System.out.println("val�� ��"+val);
	}
}
