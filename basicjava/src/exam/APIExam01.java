package exam;

import java.io.File;
import java.util.Random;

//APIExam01Ŭ���� ���ο��� ����ϴ� API�� Ŭ������ java.utill��Ű������ ã�������ֵ��� ����
///import java.util.Random;
//import java.util.*;
//import java.io.File;

//"I like java"���ڿ��� �Ʒ� ���ǿ� �°� ó���� �� �ֵ��� stringŬ������ ����� �۾�
//stringŬ������ ����� str������ ���� ������ �� �ֵ��� ó��
//stringŬ������ ���ǵǾ� �ִ� length�޼ҵ带 ȣ��
/*[�������]
 * ���ڿ��� ����:
 */
public class APIExam01 {

	public static void main(String[] args) {
	String str = new String("I like java");	
	int result = str.length();	
	System.out.println("���ڿ��� ����:"+result);
	
	//JVM�� �⺻���� �ν��ϴ� API�� ��ġ�� java.lang��Ű���� ���� �ҽ������� �۾��ϴ� ��ġ
	new Random();
    new File(" ");
    
	}

}
