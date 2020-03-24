package ex06array;

import java.util.Scanner;

/*
문제3) 파일명 : QuSungJuk.java
다음 조건에 맞는 프로그램을 작성하시오.
1] 학생수를 사용자로부터 입력받는다.
	-Scanner클래스 사용
2] 입력받은 학생수만큼 국영수 점수를 저장할 수 있는 int형 배열을 선언한다.
3] 다시 학생수만큼 각 학생의 국영수 점수를 입력받아 2]에서 생성한 배열에 저장한다.
	-Scanner클래스 사용
4] 각 학생의 국영수 점수 및 총점 그리고 평균을 출력하여라. 
5] 이 문제는 2차원 배열을 활용하는 문제이다.

실행결과]
학생수를 입력하세요?3
학생수:3
[1번째 학생의 점수 입력]
국어점수 입력?77
영어점수 입력?78
수학점수 입력?79
[2번째 학생의 점수 입력]
국어점수 입력?82
영어점수 입력?83
수학점수 입력?84
[3번째 학생의 점수 입력]
국어점수 입력?97
영어점수 입력?98
수학점수 입력?99
==========================
NO KOR ENG MAT TOT AVG
==========================
1  77  78  79  234 78.00
2  82  83  84  249 83.00
3  97  98  99  294 98.00
==========================

 */
public class QuSungJuk {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생수를 입력하세요:");
		int numOfStudent = sc.nextInt();
		int[][] score = new int[numOfStudent][5];
				
		saveScore(score);
		showScore(score);
	}

	static void saveScore(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		int kor;
		int eng;
		int math;
		int sum = 0;
		double avg;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("["+ (i+1) +"번째 학생의 점수 입력]");
			
			System.out.print("국어점수 입력:");
			kor = sc.nextInt();
			System.out.print("영어점수 입력:");
			eng = sc.nextInt();
			System.out.print("수학점수 입력:");
			math = sc.nextInt();
			
			arr[i][0] = kor;
			arr[i][1] = eng;
			arr[i][2] = math;
			
			sum = kor + eng + math;
			avg = sum / 3;
			
			arr[i][3] = sum;
			arr[i][4] = (int)avg;
		}
	}

	static void showScore(int[][] arr2) {
		System.out.println("==========================");
		System.out.println("NO KOR ENG MAT TOT AVG");
		System.out.println("==========================");
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print((i+1) + "번 ");
			for(int j=0; j<arr2[i].length; j++) {
				System.out.printf("%4d", arr2[i][j]);
			}
			System.out.println();
		}
	}
	
	
}
