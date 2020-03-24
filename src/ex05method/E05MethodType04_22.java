package ex05method;

import java.util.Scanner;

public class E05MethodType04_22 {
	
	public static void main(String[] args) { //숫자입력 횟수 설정하고 리턴값 받아서 결과보여줌.
		int maxValue1 = returnMaxNumber(4);
		System.out.println("최대값1: "+ maxValue1);
	
		int maxValue2 = returnMaxNumber(6);
		System.out.println("최대값2: "+ maxValue2);
	}
	
	public static int returnMaxNumber(int numberCnt) {
		Scanner sc = new Scanner(System.in);
		
		int maxVal = 0;//최대값		
		for(int i=1; i<=numberCnt ; i++) {
			System.out.println("정수를 입력하세요: ");
			int inputNum = sc.nextInt(); //입력값
			
			if(i==1) {
				maxVal = inputNum; //1이면 어차피 최소값, 다시 돌린다.
			}
			else { //1보다 큰 숫자일 경우에 걸러진다.
				if(maxVal<inputNum) {
					maxVal = inputNum; //0인 maxVal을 입력값으로 교체
				}
			}
		}
		
		return maxVal;
		
	}

}