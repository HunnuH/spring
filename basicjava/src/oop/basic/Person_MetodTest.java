package oop.basic;
public class Person_MetodTest {
	public static void main(String[] args) {
		Person_Metod p1 = new Person_Metod();
		p1.setName("장동건");
		p1.setAge(45);
		p1.setAddr("seoul");
		System.out.println("이름 :"+p1.getName()+", 나이 :"+p1.getAge()+", 주소:"+p1.getAddr());
		System.out.println("person객체가 할달된 heap의 주소 :" +p1);
		
		Person_Metod p2 = new Person_Metod();
		p2.setName("원빈");
		p2.setAge(35);
		p2.setAddr("seoul");
		System.out.println("이름 :"+p2.getName()+", 나이 :"+p2.getAge()+", 주소:"+p2.getAddr());
		System.out.println("person객체가 할달된 heap의 주소 :" +p2);
	}
}
