package ex08classpractice;
/*
문제3) QuMarbles.java
구슬치기 하는 아이들을 추상화하여 클래스로 정의해보자.
*어린아이가 보유하고 있는 구슬의 개수 정보를 담는다
*놀이를 통해 구슬을 획득 또는 상실하는 것을 표현한다.
*어린이의 현재 보유하고 있는 구슬의 개수를 표현한다.
초기화는 다음과 같이 진행한다.
◆어린이1의 보유갯수 : 구슬 20개
◆어린이2의 보유갯수 : 구슬 15개
게임은 다음과 같이 진행한다.
◆1차게임 : 어린이1은 어린이2의 구슬 5개를 획득한다.
◆2차게임 : 어린이2는 어린이1의 구슬 9개를 획득한다.
# 어린이 객체를 생성시 구슬의 보유갯수는 생성자를 통해 초기화 되어야 한다.
실행결과]
게임 전 구슬의 보유 개수
어린이1 : 보유 구슬의 개수 20
어린이2 : 보유 구슬의 개수 15

게임 후 구슬의 보유 개수
어린이1 : 보유 구슬의 개수 16
어린이2 : 보유 구슬의 개수 19


 */
class Child {
	
	int beeds;

	public Child(int beeds) {
		this.beeds = beeds;
	}
	
	//놀이
	public void game(Child child, int bCnt) {
		this.beeds += bCnt;
		child.beeds -= bCnt;
	}
	
	public void showResult() {
		System.out.println("보유 구슬의 개수 "+ beeds);
	}
	
	
	
}
//게임 전 구슬의 보유 개수
//어린이1 : 보유 구슬의 개수 20
//어린이2 : 보유 구슬의 개수 15
//
//게임 후 구슬의 보유 개수
//어린이1 : 보유 구슬의 개수 16
//어린이2 : 보유 구슬의 개수 19
public class QuMarblesP {

	public static void main(String[] args) {
		
		Child child1 = new Child(20);
		Child child2 = new Child(15);
		
		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1:");
		child1.showResult();
		System.out.print("어린이2:");
		child2.showResult();
		
		child1.game(child2, 5);
		child2.game(child1, 9);

		System.out.println("게임 후 구슬의 보유 개수");
		System.out.print("어린이1:");
		child1.showResult();
		System.out.print("어린이2:");
		child2.showResult();
	}

}
