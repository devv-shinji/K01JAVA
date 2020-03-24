package ex05method;

import java.util.Scanner;

public class E04MethodType03_22 {

	
	static void inputGugudan(int sNum, int eNum) {
		
		for(int dan=sNum ; dan<=eNum ; dan++) {
			for(int su=1 ; su<=9 ; su++) {
				System.out.printf("%-2d*%-2d=%2d", dan, su, (dan*su));
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("구구단의 시작숫자(2이상): ");
		int s = scanner.nextInt();
		System.out.println("구구단의 끝숫자(9이하): ");
		int e = scanner.nextInt();
		
		inputGugudan(s, e);
	}

}