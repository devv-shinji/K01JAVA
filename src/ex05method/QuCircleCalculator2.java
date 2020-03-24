package ex05method;

import java.util.Scanner;

public class QuCircleCalculator2 {

	
	
	public static double circleArea(double pi) {//넓이 width
		double width = 3.14 * pi * pi;
		return width;
	}
	
	public static double circleRound(double pi) {//둘레 radius
		double radius = 2 * 3.14 * pi;
		return radius;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름을 입력하세요: ");
		double inputNum = sc.nextDouble();
		
		double width = circleArea(inputNum);
		double radius = circleRound(inputNum);
		
		System.out.printf("원의넓이= %.2f", width);
		System.out.printf("\n원의둘레= %.2f", radius);
		
	}
	
	

}
