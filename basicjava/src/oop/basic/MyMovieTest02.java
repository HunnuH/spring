package oop.basic;

import java.util.Scanner;

public class MyMovieTest02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("=====상영 영화 등록=====");
		System.out.println("1. 영화등록");
		System.out.println("2. 영화조회");
		System.out.println("3. 영화삭제");
		System.out.println("4. 영화수정");
		System.out.println("5. 현재상영작 조회");
		System.out.println("원하는 작업을 선택하세요");
		int cho = key.nextInt();
		switch(cho) {
		case 1:
		System.out.println("====영화등록====");
		System.out.print("제목:");
		String name = key.next();
		System.out.println("장르");
		String gen = key.next();
		System.out.println("가격:");
		int price = key.nextInt();
		
		MyMovie m = new MyMovie();
		m.name = name;
		m.price = price;
		m.gen = gen;
		
		System.out.println("제목:"+m.name);
		System.out.println("장르:"+m.gen);
		System.out.println("가격:"+m.price);
		   }
		}
	}
