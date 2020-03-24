package ex05method;

public class E02MethodType011 {

	static void noPramNoReturn() {
		System.out.println("==메뉴를 선택하세욤==");
		System.out.println("1., 2., 3.");
		System.out.println("=====");
	}
	
	static void noParamNoReturn3() {
		System.out.println("[Return문 이전]");
		int returnValue = 88;
		
		if(returnValue%2==0) {
			System.out.println(returnValue +"는 짝수이다.");
			return;
		}
		
		System.out.println(returnValue +"는 홀수이다.");
		System.out.println("[Return문 이후]");
	}
	
	public static void main(String[] args) {
		noPramNoReturn();
		noParamNoReturn3();
	}
}