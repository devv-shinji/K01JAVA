package ex04controlstatement;

import java.io.IOException;

public class E01If011 {

	public static void main(String[] args) throws IOException {
		
		int num = 10;
		
//		if(num%2) {
//			System.out.println("잘못된 조건식입니다.");
//		}
//		if(num) {
//			System.out.println("이것도 잘못된 조건식입니다");
//		}
		
		if(num%2 == 0) {
			System.out.printf("%d는 짝수입니다.", num);
		}
		else {
			System.out.printf("%d는 홀수입니다.", num);
		}
		System.out.println();
		
		if(num%2 == 0 && num>=10) {
			System.out.printf("%d는 짝수이면서, 10보다 크거다 같다%n", num);
		}
		
		if(true) {
			System.out.println("무조건 실행되는 if문입니다");
		}
		
		if(false ) {
			System.out.println("무조건 실행안되는 if문?");
		}
		else {
			System.out.println("무조건 실행되는 if문인가요?");
		}
		
		System.out.print("\n하나의 문자를 입력하세요: ");
		int asciiCode = System.in.read();
		System.out.println("입력한 문자(아스키코드):"+ asciiCode);
		System.out.println("입력한 문자:"+ (char)asciiCode);
		
		/*
		[시나리오] 사용자가 입력한 문자가 숫자인지 판단하는
		프로그램을 if문을 이용해 구현하시오.
		 */
		
		if(asciiCode>=48 && asciiCode<=58) {
			System.out.println("입력한 문자는 숫자입니다.");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다.");
		}
		
		boolean isNumber = (asciiCode>='0' && asciiCode<='9');
		if(isNumber==true) {
			System.out.println("입력한 문자는 숫자입니다.");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다.");
		}
		
	}

}
