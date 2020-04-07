package quiz_game;

import java.util.Random;

/*
S: Strike
B: Ball

1  3  5
-------
1  2  3
S     B
 */
public class QuBaseballGame {

	public static void main(String[] args) {

		Random random = new Random();
		int randomCnt = 0;
		int com1 = 0;
		int com2 = 0;
		int com3 = 0;
		
		while(true) {
			randomCnt++;
			
			com1 = random.nextInt(100) % 9 + 1; //0~8까지 난수 생성
			com2 = random.nextInt(100) % 9 + 1;
			com3 = random.nextInt(100) % 9 + 1;
			
			if(!(com1==com2 || com2==com3 || com3==com1)) {
				//중복되지 않는 난수 생성에 성공하면 루프탈출
				
			}
			
			if(com1==user2)
		}
		
	}////end of main

}
