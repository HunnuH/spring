package oop.basic;
public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "장동건";
		p1.age = 45;
		p1.addr = "seoul";
		System.out.println("이름"+p1.name+",나이"+p1.age+",주소"+p1.addr);
		System.out.println("heap의 주소"+p1);
	}
}
