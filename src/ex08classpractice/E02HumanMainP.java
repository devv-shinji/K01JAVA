package ex08classpractice;

public class E02HumanMainP {

	public static void main(String[] args) {
		
		//객체생성
		HumanP humanP = new HumanP();
		
		//객체초기화
		humanP.name = "신엘리";
		humanP.age = 34;
		humanP.energy = 4;
		
		//멤버메소드 호출
		humanP.showState();
		humanP.eat();
		humanP.walk();
		humanP.think();
		humanP.showState();
		
		//반복해서 고갈시켜보자
		for(int i=1; i<10; i++) {
			humanP.walk();
		}
		humanP.showState();
		
		//반복해서 최대치를 넘도록 해보자
		for(int i=1; i<20; i++) {
			humanP.eat();
		}
		humanP.showState();
		
	}

}
