package ex12inheritance;
/*
연습문제]  AnimalDog 클래스 정의
	강아지를 표현한 클래스 
	- Dog is a Animal이 성립하므로 상속관계로 표현하기에 
		적합한 모델
	
	멤버변수
		강아지의종류 : 푸들, 포매라니안 등 -> dogKind
		이름 -> name
	멤버메소드
		bark() : 강아지가 짖는것을 표현
			출력결과 : 이름이 XX이고 종(포유류)이 
				YY인 강아지가 짖는다.
		showDog() : 강아지의 현재상태(멤버변수)를 출력하는 
			메소드
	인자생성자
		: 부모클래스까지 초기화할수 있도록 구성할것
 */
public class AnimalDog extends Animal {

	String dogKind, name;
	
	public AnimalDog(String species, int age, String gender,
			String dogKind, String name) {
		super(species, age, gender);//슈퍼는 항상 제일 위에 위치해야 함.
		
		this.dogKind = dogKind;//자기 자신을 위한 멤버변수 초기화
		this.name = name;
	}

	public void bark() {
		System.out.printf("\n이름이 %s이고 종이 %s인 강아지가 짖는다.\n", name, getSpecies());
	}//species가 private임으로 getter를 미리 생성 후 받아와야 한다.
	
	public void showDog() {
		showAnimal();
		System.out.println("종류는: "+ dogKind);
		System.out.println("이름은: "+ name);
	}
}
