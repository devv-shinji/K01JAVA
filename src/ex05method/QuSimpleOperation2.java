package ex05method;
/*
덧셈
뺄셈
곱셈
나눗셈몫
나눗셈나머지
 */

import java.util.Scanner;

public class QuSimpleOperation2 {

	public static void arithmetic(int num1, int num2){
		
		int cal1 = num1 + num2;
		int cal2 = num1 - num2;
		int cal3 = num1 * num2;
		int cal4 = num1 / num2;
		int cal5 = num1 % num2;
		
		System.out.println("덧셈결과:"+ cal1);
		System.out.println("뺄셈결과:"+ cal2);
		System.out.println("곱셈결과:"+ cal3);
		System.out.println("나눗셈몫결과:"+ cal4);
		System.out.println("나눗셈나머지결과:"+ cal5);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int jungSu1 = sc.nextInt();
		System.out.print("정수를 입력하세요: ");
		int jungSu2 = sc.nextInt();
		
		arithmetic(jungSu1, jungSu2);
		
	}

}
