package ex02variable;

/*
문제2] 파일명 : Qu_02.java
국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
평균점수를 구해서 출력하는 프로그램을 작성하시오.
출력결과]
	99점,80점,96점의 평균점수는 XXX.XX점입니다.(실수형태)
	99점,80점,96점의 평균점수는 XXX점입니다.(정수형태)

 */
public class Qu_02 {

	public static void main(String[] args) {

		int k=99, e=80, m=96;
		double avg;
		
		avg = (k + e + m) / 3.0;
		
		System.out.println("평균실수="+ avg);
		System.out.println("평균정수="+ (int)avg);
		
		
		/*
		int kor = 99, eng = 80, math = 96;
		double avg = (kor + eng + math) / 3.0;
		System.out.println(kor + "점, "+ eng +"점, "+ math +"점의 평균점수는 "+ avg +"점입니다.");
		System.out.println("평균점수(정수형)="+ (int)avg);
		*/
		
		
//		int avg2 = (int)avg;
//		System.out.println(kor + "점, "+ eng +"점, "+ math +"점의 평균점수는 "+ avg2 +"점입니다.");
	}

}
