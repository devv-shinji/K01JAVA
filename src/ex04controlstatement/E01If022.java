package ex04controlstatement;

public class E01If022 {

	public static void main(String[] args) {
		
		int num = 101;
		
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		///삼항연산자 중요!! 실무에서 많이 쓰인다!!///
		
		String numberResult = (num%2==0) ?
				"짝수임" : "홀수임";
		System.out.println(numberResult);
		
		/*
		[시나리오] 숫자를 홀/짝수인지 먼저 판단한 후 100 이상인지를
			판단하는 프로그램을 if~else구문을 이용하여 작성하시오.
		 */
		
		int num2 = 120;
		if(num2%2==0) {
			if(num2>=100) {
				System.out.println("짝수이면서 100이상");
			}
			else {
				System.out.println("짝수이면서 100미만");
			}
		}
		else {
			if(num2>=100) {
				System.out.println("홀수이면서 100이상");
			}
			else {
				System.out.println("홀수이면서 100미만");
			}
		}
		
		
	}

}
