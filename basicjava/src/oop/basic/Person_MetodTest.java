package oop.basic;
public class Person_MetodTest {
	public static void main(String[] args) {
		Person_Metod p1 = new Person_Metod();
		p1.setName("�嵿��");
		p1.setAge(45);
		p1.setAddr("seoul");
		System.out.println("�̸� :"+p1.getName()+", ���� :"+p1.getAge()+", �ּ�:"+p1.getAddr());
		System.out.println("person��ü�� �Ҵ޵� heap�� �ּ� :" +p1);
		
		Person_Metod p2 = new Person_Metod();
		p2.setName("����");
		p2.setAge(35);
		p2.setAddr("seoul");
		System.out.println("�̸� :"+p2.getName()+", ���� :"+p2.getAge()+", �ּ�:"+p2.getAddr());
		System.out.println("person��ü�� �Ҵ޵� heap�� �ּ� :" +p2);
	}
}
