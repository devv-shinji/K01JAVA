
package ex05method;

public class QuFindPrimeNumber2 {
	
	
	public static boolean isPrimeNumber(int num) {//소수 true/false 반환
		
		if(num==1) {
			return false;
		}
		else {
			for(int i=2; i<num; i++) {
				if(num%i==0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {//1~100 소수만 출력
		
		for(int i=1 ; i<=100 ; i++) {
			if (isPrimeNumber(i) == true) {
				System.out.println("소수= "+ i);
			}
		}
	}

}
