package ex04controlstatement;

import java.util.Scanner;

public class E02Switch2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("3으로 나눌 숫자를 입력하세요: ");
		int inputNum = scanner.nextInt();
		System.out.printf("입력한 숫자는 %d입니다.\n", inputNum);
		
		int remain = inputNum%3;
		
		switch(remain) {
		case 0:
			System.out.println("나머지는 0입니다.");
			break;
		case 1:
			System.out.println("나머지는 1입니다.");
			break;
		default:
			System.out.println("나머지는 2입니다.");
		}
		
		int season = 1;
		switch(season) {
		case 4: case 5: case 6:
			System.out.println("spring");
			break;
		case 3: case 2: case 1:
			System.out.println("summer");
			break;
		case 0:
			System.out.println("winter");
		}

	
	
	}
	

}
