//�⺻�������� ����Ǵ� ���ͷ�
package Test;
public class PrimitiveTypeValueTest {
//���� ���ͷ�
	public static void main(String[] args) {
        boolean boolval = true; //false
        System.out.println(boolval);
// ������ ���ͷ� - byte,short,int,long(������ ���ͷ��� �⺻Ÿ���� int)
// byte - �Ҵ�Ǵ� �޸� ũ�� 1byte
        byte b =127;
        System.out.println("byte :"+b);
 // short - 2byte
       short s =32767;
        System.out.println("short :"+s);
// int - 4byte  
        int i = 2147483647;
        System.out.println("int :"+i);
// long - 8byte , longŸ���� ���ͷ��� ���̻縦 �߰��Ѵ�(1,L)
        long l = 2147483648L;
        System.out.println("long :"+l);
        
// �Ǽ��� ���ͷ� - float,double(�⺻Ÿ��) �Ҽ��ڸ��� ǥ���ϱ� ���� Ÿ��
// float - 4byte , ���̻縦 �߰��Ѵ�(f,F)      
       float f = 10.5f;
       System.out.println("float :"+f);
// double - 8byte
       double d =10.5;
       System.out.println("double :"+d);
       
//char�� ���ͷ� - ' '
       char c = 'A';
       System.out.println("char :"+c);
       
//string�� ���ͷ� - ������������ ���� ���ǹǷ� �⺻��ó�� ����Ҽ��ִ�( " " )
       String str = "�������� String�� ���ͷ��� ū����ǥ�� ǥ��";
       System.out.println("String :"+str);
       }

}
