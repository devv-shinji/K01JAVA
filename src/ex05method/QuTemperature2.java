package ex05method;

import java.util.Scanner;

public class QuTemperature2 {
		
	public static double celsius(double input1) {
		return (input1 - 32) / 1.8;
	}
	public static double fahrenheit(double input2) {
		return (1.8 * input2) + 32;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨를 입력: ");
		int inputNum1 = sc.nextInt();
		System.out.print("\n섭씨를 입력: ");
		int inputNum2 = sc.nextInt();
	
		System.out.println("화씨->섭씨="+ celsius(inputNum1));
		System.out.println("섭씨->화씨="+ fahrenheit(inputNum2));
		
	}
}	