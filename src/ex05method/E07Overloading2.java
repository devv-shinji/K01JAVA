package ex05method;

public class E07Overloading2 {

	static void person(int juminNum, int milNum) {
		System.out.println("군필자 이시군요");
		System.out.println("주민번호: "+ juminNum);
		System.out.println("군번: "+ milNum);
	}
	static void person(int juminNum) {
		System.out.println("미필자거나 여성이시군요");
		System.out.println("주민번호: "+ juminNum);
	}

	public static void main(String[] args) {
		person(343523, 234325235);
		System.out.println("=============");
		person(898989);
		
	}

}
