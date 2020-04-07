package quiz_game;

import java.util.Random;
import java.util.Scanner;

/*
S: Strike
B: Ball

1  3  5
-------
1  2  3
S     B
 */
public class QuBaseballArrayGame {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		//게임에서 사용할 변수
		int com1, com2, com3;
		int user1, user2, user3;
		int randomCnt = 0;//난수생성 카운트
		int gameCount = 0;//게임 카운트
		int strikeCnt = 0, ballCnt = 0;//스트라이크, 볼 카운트
		
		//게임전체 반복
		while(true) {
			
			//중복되지 않는 3개의 난수 생성
			while(true) {
				//몇번만에 난수가 생성되는지 확인
				randomCnt++;
				
				com1 = random.nextInt(100) % 9 + 1; //1~9까지 난수 생성
				com2 = random.nextInt(100) % 9 + 1;
				com3 = random.nextInt(100) % 9 + 1;
				
				if(!(com1==com2 || com2==com3 || com3==com1)) {
					//중복되지 않는 난수 생성에 성공하면 루프탈출
					break;
				}
			}////end of while
			
			//난수확인
			System.out.println(randomCnt +"회:"+ com1+" "+ com2+" "+ com3+" ");
			
			while(true) {
				System.out.println("3개의 정수를 입력하세요(1~9)");
				System.out.println("스페이스로 구분하시고 마지막에 Enter를 눌러주세요.");
				
				user1 = scanner.nextInt();
				user2 = scanner.nextInt();
				user3 = scanner.nextInt();
				
				//게임카운트 1회 증가
				gameCount++;
				
				//판단1 - 스트라이크(숫자와 위치까지 일치)
				if(com1==user1) strikeCnt++;
				if(com2==user2) strikeCnt++;
				if(com3==user3) strikeCnt++;
				
				//판단2 - 볼(숫자는 일치하나 위치는 불일치)
				if(com1==user2 || com1==user3) ballCnt++;
				if(com2==user1 || com2==user3) ballCnt++;
				if(com3==user1 || com3==user2) ballCnt++;
				
				//게임종료판단
				if(strikeCnt==3) {
					System.out.println("3스트라이크 게임종료");
					System.out.println(gameCount +"번 만에 맞추셨습니다.");
					break; //루프탈출
				}
				else {
					//하나도 못 맞추는 경우
					if(strikeCnt==0 && ballCnt==0) {
						System.out.println("아웃입니다.");
					}
					else {
						System.out.printf("%d스트라이크, %d볼\n", strikeCnt, ballCnt);
					}
					//스트라이크, 볼 카운트 초기화
					strikeCnt = 0;
					ballCnt = 0;
					//continue문은 필요없음.
				}
			}////end of while
			
			//게임 재시작 여부 확인
			System.out.println("한게임 더 하시겠습니까? 재시작(1), 종료(0)");
			int restart = scanner.nextInt();
			if(restart==0) {
				//게임종료
				System.out.println("\n==게임이 종료되었습니다.==\n");
				
				//실행되는 즉시 main함수가 종료된다.
				System.exit(0);
			}
			else if(restart==1) {
				//게임을 재시작하기 위해 카운트 변수 초기화
				strikeCnt = 0;
				ballCnt = 0;
				gameCount = 0;
				System.out.println("\n==게임을 재시작합니다.==\n");
			}
			
		}////게임전체 반복 while
	}////end of main
}
