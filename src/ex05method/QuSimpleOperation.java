package ex05method;

import java.util.Scanner;

/*
문제5-1) 파일명 : QuSimpleOperation.java (난이도:하)
두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 
단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
파라메타로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
메소드명 : arithmetic()
실행예 :
덧셈결과 -> 177
뺄셈결과 -> 23
곱셈결과 -> 7700
나눗셈 몫 -> 1
나눗셈 나머지 -> 23

 */
public class QuSimpleOperation {

	static void arithmetic(int num1, int num2) {
		int cal1 = num1 + num2; //덧셈
		int cal2 = num1 - num2; //뺄셈
		int cal3 = num1 * num2; //곱셈
		int cal4 = num1 / num2; //나눗셈 몫
		int cal5 = num1 % num2; //나눗셈 나머지
		
		System.out.println("덧셈결과: "+ cal1);
		System.out.println("뺄셈결과: "+ cal2);
		System.out.println("곱셈결과: "+ cal3);
		System.out.println("나눗셈 몫 결과: "+ cal4);
		System.out.println("나눗셈 나머지 결과: "+ cal5);
	}
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int inputNum1 = scanner.nextInt();
		System.out.print("정수를 입력하세요: ");
		int inputNum2 = scanner.nextInt();
		
		arithmetic(inputNum1, inputNum2);
		
	}

}
