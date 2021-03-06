package ex05method;

import java.util.Scanner;

/*
메소드의 규칙
- Java에서는 main메소드는 무조건 public static void로
	선언하기로 약속되어있다.
- static으로 선언된 메소드에는 static으로 선언된 메소드만
	호출할 수 있다.
- 메소드 호출 후 반환값은 항상 호출한 위치로 반환된다. 이때
	메소드는 메모리에서 소멸된다.
- 반환값이 없는 void형 메소드도 실행이 완료되면 호출한
	위치로 돌아온다.
 */
public class E01MethodBasic {

	/*
	메소드 정의1 : 반환타입 0, 매개변수 0 의 형태로 정의
	-> 두개의 정수를 전달받아 합의 결과를 반환한다.
	*/
	public static int simpleFunc(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	/*
	메소드 정의2 : 반환타입x(void), 매개변수x 형태로 정의
	-> 전달되는 값 없이 이름을 입력받은 후 namePrint()함수를 호출한다.
	반환값이 없는 경우에는 반드시 void라고 명시해야 한다.
	 */
	public static void menuPrint() {
		System.out.println("당신의 이름은 무엇인가요?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		namePrint(name);
	}
	
	/*
	메소드 정의3 : 반환값x, 매개변수 O 형태로 정의
	-> 반환값이 없는경우 실행이 종료되면 호출했던 지점으로 다시 돌아간다.
	 */
	public static void namePrint(String n) {
		System.out.println("제 이름은 "+ n +" 입니다.");
	}
	
	/*
	메소드를 호출할 때는 함수의 원형을 그대로 기술하면 된다.
	매개변수가 있다면 갯수만큼 포함시켜줘야 한다. 매개변수의
	갯수가 다르면 호출되지 않고 에러가 발생된다.
	 */
	public static void main(String[] args) {
		int result = simpleFunc(1, 2);
		System.out.println("1과 2를 전달한 결과: "+ result);
		System.out.println("10과 20을 전달한 결과: "+ simpleFunc(10, 20));
		
		menuPrint();
		
	}////end of main

}////end of class
