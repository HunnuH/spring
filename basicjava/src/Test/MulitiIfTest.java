package Test;
import java.util.Scanner;
public class MulitiIfTest {
	public static void main(String[] args) {
// �ֹι�ȣ 7��° �ڸ� ���� �Է¹޾� ó��
      Scanner Key = new Scanner(System.in);
      System.out.print("�ֹι�ȣ�Է�:");
      int ssn = Key.nextInt();
      System.out.print(ssn);
      if (ssn==1 | ssn==3) {
    	  System.out.print("����");
      } else if (ssn==2 | ssn==4) {
    	  System.out.print("����");
      } else {
    	  System.out.print("��Ÿ");
      }
	}

}
