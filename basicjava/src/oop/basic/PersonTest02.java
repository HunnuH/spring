package oop.basic;
import java.util.Scanner;
public class PersonTest02 {
	public static void main(String[] args) {
	Scanner key = new Scanner(System.in);
	System.out.println("=====�λ���� �ý���=====");
	System.out.println("1. ������");
	System.out.println("2. �����ȸ");
	System.out.println("3. �������");
	System.out.println("4. �������");
	System.out.println("������ ��ȸ");
	System.out.println("���ϴ� �۾��� �����ϼ���");
	int cho = key.nextInt();
	switch(cho) {
	case 1:
		System.out.println("====������====");
	System.out.print("����:");
	String name = key.next();
	System.out.println("����:");
	int age = key.nextInt();
	System.out.println("�ּ�");
	String addr = key.next();
	
	Person p = new Person();
	p.name = name;
	p.age = age;
	p.addr = addr;
	System.out.println("����:"+p.name);
	System.out.println("����:"+p.age);
	System.out.println("�ּ�:"+p.addr);
	   }
	}
}
