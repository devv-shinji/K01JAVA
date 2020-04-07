package quiz_game;

import java.util.Random;
import java.util.Scanner;

public class QuUpDownGame {

	public static void gamestart() {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int restart;
		
		while(true) {
			
			int computerNum = random.nextInt(1000) % 100 + 1;
			System.out.println(computerNum);
			
			for (int i = 1; i <= 7; i++) {
				System.out.print("1~100까지 숫자입력:");
				int userNum = scan.nextInt();
				
				if (userNum > computerNum) {
					System.out.println("Down, 더 낮은 숫자입니다.");
				}
				else if(userNum < computerNum){
					System.out.println("Up, 더 높은 숫자입니다.");
				}
				else {
					System.out.println("일치합니다.");
					
				}
			}
			
		}////end of while
		
		while(true) {
			System.out.print("재시작(1), 종료(0)");
			int
		}
	}
	
	public static void main(String[] args) {
		gamestart();
	}////end of main
	
}////class end
