package ex08classpractice;

import java.io.InputStream;
import java.util.Scanner;

public class E02HumanMainP2 {

	public static void main(String[] args) {
		
		//객체생성
		HumanP humanP = new HumanP();
		
		//객체초기화
		humanP.name = "신엘리";
		humanP.age = 34;
		humanP.energy = 4;
		
		//멤버메소드 호출
		Scanner sc = new Scanner(System.in);
		System.out.println("보기를 선택하세요.");
		System.out.println("1: 상태보기");
		System.out.println("2: 캐릭터 식사");
		System.out.println("3: 캐릭터 걷기");
		System.out.println("4: 캐릭터 생각하기");	
		
		int input = sc.nextInt();
		
		if (input == 1) {
			humanP.showState();
		}
		else if (input == 2) {
			humanP.eat();
		}
		else if (input == 3) {
			humanP.walk();
		}
		else if (input == 4) {
			humanP.think();
		}
		humanP.showState();
		
	}
		
//		
//		humanP.showState();
//		humanP.eat();
//		humanP.walk();
//		humanP.think();
//		humanP.showState();
////		
//		//반복해서 고갈시켜보자
//		for(int i=1; i<10; i++) {
//			humanP.walk();
//		}
//		humanP.showState();
//		
//		//반복해서 최대치를 넘도록 해보자
//		for(int i=1; i<20; i++) {
//			humanP.eat();
//		}
//		humanP.showState();


}


