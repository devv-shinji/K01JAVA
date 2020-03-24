package ex05method;

public class E06LocalVariable2 {

	public static void main(String[] args) {

		boolean scope = true;
		
		if(scope) {
			int num = 1;
			num++;
			System.out.println("첫번째 if문 지역: "+ num);
		}
		else {
			int num = 5;
			System.out.println("첫번재 if문의 else지역: "+ num);
		}
		
		int num = 100;
		System.out.println("main메소드 지역: "+ num);
		
		simpleFunc();
		
		System.out.println("메인메소드 끝");
		
	}
	
	static void simpleFunc() {
		int num = 1000;
		System.out.println("simple메소드지역: "+ num);
	}
}
