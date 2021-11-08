package oop.basic;
public class MyMovieTest {
	public static void main(String[] args) {
		MyMovie m1 = new MyMovie();
		m1.name = "변호인";
		m1.price = 9000;
		m1.gen = "드라마";
		System.out.println("제목:"+m1.name+" 장르:"+m1.gen+" 가격:"+m1.price+"원");
		
		MyMovie m2 = new MyMovie();
		m2.name = "겨울왕국2";
		m2.price = 10000;
		m2.gen = "애니메이션";
		System.out.println("제목:"+m2.name+" 장르:"+m2.gen+" 가격:"+m2.price+"원");
	}
}
