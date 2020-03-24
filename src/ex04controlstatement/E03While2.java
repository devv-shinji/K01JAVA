package ex04controlstatement;

public class E03While2 {

	public static void main(String[] args) {
		
		int sum=0;
		int i=1;
		
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("1~10까지의 합은: "+ sum);
		
		/*
		시나리오] 1부터 100까지의 정수 중 3의 배수이거나 5의 배수인
		수의 합을 구하여 출력하는 프로그램을 while을 사용해서
		작성하시오.
		 */
		
		int jungSu = 1;
		int suSum = 0;
		
		while(jungSu<=100) {
			if(jungSu%3==0 || jungSu%5==0) {
				suSum += jungSu;
			}
			jungSu++;
		}
		System.out.println(suSum);
		System.out.println();
		
		/*
		시나리오] 구구단을 출력하는 프로그램을 while문으로 작성하세요.
		단 while문을 이용하시오.
		 */
		
//		int dan = 2;
//		while(dan<=9) {
//			int su = 1;
//			while(su<=9) {
//				System.out.printf("%d * %d = %d ", dan, su, (dan*su));
//				su++;
//			}
//			System.out.println();
//			dan++;
//		}

		int dan = 2;
		while(dan<=9) {
			int su = 1;
			while(su<=9) {
				System.out.printf("%2d * %2d = %3d", dan, su, (dan*su));
				su++;
			}
			System.out.println();
			dan++;
		}
		
		/*
		시나리오] 아래와같은 모양을 출력하는 while문을 작성하시오.
			출력결과
				1 0 0 0
				0 1 0 0
				0 0 1 0
				0 0 0 1
		 */
		
		int x = 1;
		while(x<=4) {
			int y = 1;
			while(y<=4) {
				if(x==y) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
				y++;
			}
			System.out.println();
			x++;
		}
		
		
		
	}

}
