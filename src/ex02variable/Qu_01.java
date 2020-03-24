package ex02variable;

public class Qu_01 {

/*
문제1] 파일명 : Qu_01.java
1.국어, 영어, 수학점수 및 과목의 총점을 저장할수 있는 변수를 선언하시오.
2.국어 89점, 영어 99점, 수학 78점을 대입한다.
3.국영수 총합을 구해서 총점을 저장할 변수에 대입한다.
4.총합점수를 출력한다.
실행결과  	국어점수:XX점, 수학점수:XX점, 영어점수:XX점
		3과목의 총점은 : XXX점
 */
	public static void main(String[] args) {

		int k=89, e=99, m=78;
		int total;
		
		total = k + e + m;
		System.out.printf("국어: %d점, 수학: %d점, 영어: %d점%n"
				+ "총점: %d점", k, m, e, total);
		

		/*
		int kor = 89, eng = 99, math = 78;
		int scoreTotal = kor + eng + math;
		System.out.println("국어점수:"+ kor +"점, "+ "수학점수:"+ math +"점, "+ "영어점수:"+ eng +"점");
		System.out.println("3과목의 총점은: "+ scoreTotal +"점");
		
		System.out.printf("국어점수:%d, 수학점수:%d, 영어점수:%d%n, 총점:%d"
				, kor, eng, math, scoreTotal);
		*/
		
	}

}
