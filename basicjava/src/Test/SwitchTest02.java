package Test;

import java.util.Scanner;

public class SwitchTest02 {
	public static void main(String[] args) {
		Scanner Key = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�Է�:");
	    int ssn = Key.nextInt();
	    switch(ssn) { //ssn�� ���� ���� ����� ����
	    case 1: // ssn�� 1�� ��� ������ ������ ����  �񱳿����� ��� �Ұ�
	    case 3:
	    	System.out.print("����");
	    	break;
	    	
	    case 2:
	    case 4:
	    	System.out.print("����");
	    	break;
	    	
	    default :
		    	System.out.print("��Ÿ");
	    }
	}

}
