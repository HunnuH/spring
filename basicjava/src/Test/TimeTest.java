package Test;
/* TimeTest.ajva
   �Ʒ��� ������ �����ϰ� ������ ���� ������ �����ϵ��� �ۼ�
   int time = 8000; �� ������
   [��°��]
   �ð� �� ��
   �� �����Ͽ� ���
   */



public class TimeTest{
    public static void main(String[] args) {
		int time = 8000;
		int h = time/3600;
	    int m = time%3600/60;
		int s = time%3600%60;
	
		System.out.println(h+"�ð�"+m+"��"+s+"��");
	}
}
