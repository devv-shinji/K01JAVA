package Default;

class Person {
	//멤버변수
	String name = "정우성";
	int age = 27;
	String gender = "남자";
	String job = "배우";
	
	//멤버메소드
	void eat() {
		System.out.printf("%s이 먹는다\n", name);
	}
	void sleep() {
		System.out.printf("나이가 %d인 %s이 잔다", age, name);
	}
}

public class E01PersonMain {

	public static void main(String[] args) {

		Person person = new Person();
		
		person.eat();
		person.sleep();

	}
}
