package ex08classpractice;

public class E05PersonConstructorMainP {

	public static void main(String[] args) {
		
		PersonConstructorP person1 = new PersonConstructorP();
		
		System.out.println("멤버변수 초기화용 메소드 호출 전(기본생성자)");
		person1.showPersonInfo();
		System.out.println("멤버변수 초기화용 메소드 호출 후");
		person1.initialize("홍길동", 11, "ㅣㅣ");
		person1.showPersonInfo();
		
		
		System.out.println("이름만 전달");
		PersonConstructorP person2 = new PersonConstructorP("박길동");
		person2.showPersonInfo();
		
		System.out.println("이름, 나이만 전달");
		PersonConstructorP person3 = new PersonConstructorP("박길동", 40);
		person3.showPersonInfo();
		
		System.out.println("이름,나이,주소모두 전달");
		PersonConstructorP person4 = new PersonConstructorP("박길동", 50, "가산동");
		person4.showPersonInfo();
	}

}
