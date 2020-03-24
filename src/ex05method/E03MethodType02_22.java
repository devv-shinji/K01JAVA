package ex05method;

import java.util.Scanner;

public class E03MethodType02_22 {
	
	static String getHakjum() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수: ");
		int kor = scanner.nextInt();
		System.out.println("영어점수: ");
		int eng = scanner.nextInt();
		System.out.println("수학점수: ");
		int math = scanner.nextInt();
		
		double avg = (kor + eng + math) / 3.0; //평균값 구하기
		
		String hakjum = "";
		
		int result = (int)avg / 10; //학점 구하기
		switch(result) {
		case 10: case 9:
			hakjum = "A학점";break;
		case 8:
			hakjum = "B학점";break;
		case 7:
			hakjum = "C학점";break;
		case 6:
			hakjum = "D학점";break;
		default:
			hakjum = "F학점";
		}
		return hakjum;
		
		
	}
	public static void main(String[] args) {
		
		System.out.println("너의 학점은"+ getHakjum() +" 이얌~");
		String h = getHakjum();
		System.out.printf("당신의 학점은 %s 입니다.\n", h); ///QQQ.왜 굳이 h변수를 한번 더 만들어서 넣는지? 함수 그대로 써도 되잖아.
		
		//printf문에 메소드 바로 대입해도 답이 나오는지? 확인해보기//
		System.out.printf("당신의 학점은 %s 입니다.", getHakjum());
		
	}

}