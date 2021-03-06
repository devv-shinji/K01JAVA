package ex08classpractice;
/*
시나리오]
다음에 주어진 조건으로 '사람'을 추상화 하시오.
- 속성 : 이름, 나이, 에너지
- 행동 : 걷는다, 생각한다, 먹는다, 현재상태 
	4가지를	표현한다.
- 행동의조건
	먹으면 에너지가 2 증가한다.
	걸으면 에너지가 1 감소한다.
	생각하면 에너지가 2 감소한다.
	단, 에너지의 최소, 최대범위는 0~10이다.(사람은 무한히 
		먹을수 없으며 에너지가 마이너스가 되면 죽은것과 
		같다)
 */
public class HumanP {

	//멤버변수
	String name;
	int age;
	int energy;
	
	//멤버메소드
	void walk() {
		
		energy--;
		if (energy<0) {
			energy = 0;
			System.out.println("[walk]에너지는 0이 최소입니다.");
			System.out.println("**에너지가 0으로 고정됩니다.");
		}
		else {
			System.out.println("[walk]에너지가 1 감소하였습니다.");
		}
	}
	void think() {
		
		energy -= 2;
		if (energy<0) {
			energy = 0;
			System.out.println("[think]에너지는 0이 최소입니다.");
			System.out.println("**에너지가 0으로 고정됩니다.");
		}
		else {
			System.out.println("[think]에너지가 2 감소하였습니다.");
		}
	}
	void eat() {
		
		energy += 2;
		if (energy>10) {
			energy = 10;
			System.out.println("[eat]에너지는 10이 최대치입니다.");
			System.out.println("**에너지가 10으로 고정됩니다.");
		}
		else {
			System.out.println("[eat]에너지가 2 증가하였습니다.");
		}
	}
	void showState() {
		System.out.println("====님의 현재 상태는====");
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
		System.out.println("에너지: "+ energy);
		System.out.println("==================");
	}
}
