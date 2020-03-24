package ex08classpractice;

class Person {
	//멤버변수
	String name = "정우성";
	int age = 47;
	String gender = "남자";
	String job = "배우";

	//멤버메소드
	void eat() {
		System.out.printf("%s이(가) 식사를 한다\n", name);
	}
	void sleep() {
		System.out.printf("나이가 %d인 %s이(가) 잠자고 있다\n", age, name);
	}
}

public class E01PersonMainP {

	public static void main(String[] args) {
		//인스턴스 생성
		Person person = new Person();
		
		//객체의 참조변수를 이용하여 멤버메소드를 호출한다.
		person.eat();
		person.sleep();
		
	}

}
