package ex04controlstatement;

public class E05For2 {

	public static void main(String[] args) {
		
		for(int i=1 ; i<=5 ; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		int sum = 0;
		for(int j=1 ; j<=100 ; j++) {
			sum += j;
		}
		System.out.println(sum);
		
		/*
		시나리오] for문을 이용하여 1~10사이의 정수 중 2의 배수의 합을
		구하는 프로그램을 작성하시오.
		 */
		
		int total = 0;
		
		for(int i=1 ; i<=10 ; i++) {
			if(i%2==0) {
				total += i;
			}
		}
		System.out.println(total);
		
		/*
		시나리오] 다음의 출력결과를 보이는 for문을 작성하시오
		출력결과
			0 0 0 1
			0 0 1 0
			0 1 0 0
			1 0 0 0
		해법 : x와 y를 더해서 5개 될때 1을 출력한다.
		 */
		
		for(int x=1 ; x<=4 ; x++) {
			for(int y=1 ; y<=4 ; y++) {
				if((x+y)==5) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

		/*
		연습문제] 구구단을 출력하는 프로그램을 for문으로 작성하시오
		 */
		
		
		
		
	}

}
