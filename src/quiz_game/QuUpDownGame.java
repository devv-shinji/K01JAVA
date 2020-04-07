package quiz_game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class QuUpDownGame {

	public static void gamestart() {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int restart;
		boolean forEnd = false;
		
		while(true) {
			try {
				int computerNum = random.nextInt(1000) % 100 + 1; //1~100까지 랜덤 난수 생성
				System.out.println(computerNum);
				
				for (int i = 1; i <= 7; i++) {
					System.out.print("1~100까지 숫자입력:");
					int userNum = scan.nextInt();
					
					//성공실패 유무 판단
					if (userNum > computerNum) {
						System.out.println("Down, 더 낮은 숫자입니다.");
					}
					else if(userNum < computerNum){
						System.out.println("Up, 더 높은 숫자입니다.");
					}
					else {
						System.out.println("일치합니다.");
						System.out.println(i +"번 안에 성공");
						System.out.println("-------------------------");
						
						forEnd = true;
						
						//for문 탈출
						break;
					}//else(userNum == computerNum)
					
				}//재시작for
				
				if(forEnd == false) {
					System.out.println("실패");
				}
				
				while(true) {
					System.out.println("-------------------------");
					System.out.print("재시작(1), 종료(0)");
					restart = scan.nextInt();
					
					if(restart == 0) {
						return;
					}
					else if(restart == 1) {
						System.out.println("게임 재시작!");
						break;
					}
					else {
						System.out.println("숫자를 잘못 입력했습니다.");
					}
				}
			}
			catch(InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
				System.out.println("게임을 다시 시작합니다.");
				scan.nextLine();
			}
			
		}////end of while
		
	}
	
	public static void main(String[] args) {
		gamestart();
	}////end of main
	
}////class end
