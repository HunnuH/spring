package oop.basic;

import java.util.Scanner;

public class MyMovieTest02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("=====�� ��ȭ ���=====");
		System.out.println("1. ��ȭ���");
		System.out.println("2. ��ȭ��ȸ");
		System.out.println("3. ��ȭ����");
		System.out.println("4. ��ȭ����");
		System.out.println("5. ������� ��ȸ");
		System.out.println("���ϴ� �۾��� �����ϼ���");
		int cho = key.nextInt();
		switch(cho) {
		case 1:
		System.out.println("====��ȭ���====");
		System.out.print("����:");
		String name = key.next();
		System.out.println("�帣");
		String gen = key.next();
		System.out.println("����:");
		int price = key.nextInt();
		
		MyMovie m = new MyMovie();
		m.name = name;
		m.price = price;
		m.gen = gen;
		
		System.out.println("����:"+m.name);
		System.out.println("�帣:"+m.gen);
		System.out.println("����:"+m.price);
		   }
		}
	}
