package oop.basic;
public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "�嵿��";
		p1.age = 45;
		p1.addr = "seoul";
		System.out.println("�̸�"+p1.name+",����"+p1.age+",�ּ�"+p1.addr);
		System.out.println("heap�� �ּ�"+p1);
	}
}
