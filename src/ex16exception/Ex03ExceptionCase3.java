package ex16exception;

import java.io.IOException;

//이 예시는 3번째 방법에 대한 설명일 뿐, read함수로 인한 catch문 실행이 안되는 점은 무시하고 넘어가자~~~
/*
예외처리방법3]
	예외가 발생한 위치에서는 처리하지 않고 외부로 던지고,
	함수를 호출한 지점에서 예외객체를 받은 후 처리한다.
	이때 예외발생과 상관없이 finally절은 실행된다.
 */
public class Ex03ExceptionCase3 {

	static void compileFunc() throws IOException{
		try {
			System.out.println("하나의 문자를 입력하세요:");
			int userChar = System.in.read();
			System.out.println("입력된 문자는:"+ (char)userChar);
		}
		finally {
			System.out.println("예외발생? 난 몰러..!!");
		}
	}
	public static void main(String[] args) {
		try {
			compileFunc();
		}
		catch(IOException e) {
			System.out.println("compileFunc()메소드에서 예외발생됨");
		}
	}

}
