package oop.basic;
public class MyMovieTest {
	public static void main(String[] args) {
		MyMovie m1 = new MyMovie();
		m1.name = "��ȣ��";
		m1.price = 9000;
		m1.gen = "���";
		System.out.println("����:"+m1.name+" �帣:"+m1.gen+" ����:"+m1.price+"��");
		
		MyMovie m2 = new MyMovie();
		m2.name = "�ܿ�ձ�2";
		m2.price = 10000;
		m2.gen = "�ִϸ��̼�";
		System.out.println("����:"+m2.name+" �帣:"+m2.gen+" ����:"+m2.price+"��");
	}
}
