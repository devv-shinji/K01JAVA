package ex08classpractice;

public class PersonConstructorP {

	String name;
	int age;
	String addr;
	
	//기본생성자 반환값이 없기에 당연히 void는 쓰지 않는다. 오버로딩 가능.
	public PersonConstructorP() {
		name = "이름없음";
		age = 27;
		addr = "미상";
		System.out.println("나는 기본생성자입니다.");
	}

	public PersonConstructorP(String name) {
		this.name = name; //멤버변수와 매개변수 this로 차이둠
		age = 37;
		addr = "출처불명";
		System.out.println("나는 인자생성자1입니다.");
	}
	
	public PersonConstructorP(String name, int age) {
		this(name, age, "미상"); //다른 생성자를 호출할 때....
		System.out.println("나는 인자생성자2입니다.");
	}
	
	public PersonConstructorP(String _name, int age, String addr) {
		name = _name;
		this.age = age;
		this.addr = addr;
		System.out.println("나는 인자생성자3입니다.");
	}
	
	/////////////////멤버메소드/////////////////
	void initialize(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	void showPersonInfo() {
		System.out.printf("%s 님의 정보\n", this.name);
		System.out.printf("나이:%d\n", age);
		System.out.printf("주소:%s\n", addr);
	}
	
}
