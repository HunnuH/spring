package Test;

import java.util.Scanner;

public class SwitchTest01 {
	public static void main(String[] args) {
		Scanner Key = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�Է�:");
	    int ssn = Key.nextInt();
	    switch(ssn) { //ssn�� ���� ���� ����� ����
	    case 1: // ssn�� 1�� ��� ������ ������ ����  �񱳿����� ��� �Ұ�
	    	System.out.print("����");
	    	break;
	    case 2:
	    	System.out.print("����");
	    	break;
	    case 3:
	    	System.out.print("����");
	    	break;
	    case 4:
	    	System.out.print("����");
	    	break;
	    	default :
		    	System.out.print("��Ÿ");
	    }
	}

}
