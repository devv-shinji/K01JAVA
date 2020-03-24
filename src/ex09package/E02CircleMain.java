package ex09package;

import ex09package.kosmo.perimeter.Circle;
//하나는 import, 하나는 직접 풀패키지 경로입력. because 클래스명이 Circle로 같기 때문에.

/*
메인 클래스에서 다른 패키지의 클래스를 import하여 사용하려면
해당 클래스는 반드시 public으로 선언되어야 한다.
그렇지 않으면 "not visible" 에러가 발생하게 된다.
(내 해석 - public 공공의, 전역의... 외부 클래스를 불러올 땐 사용권한이 public이어야 가능하니까) 
 */
public class E02CircleMain {

	public static void main(String[] args) {
		
		//원의 넓이: 클래스 사용을 위해 풀패키지 경로를 사용함.
		ex09package.kosmo.area.Circle circle1 = new ex09package.kosmo.area.Circle(6.5);
		System.out.println("반지름이 6.5인 원의넓이:"+ circle1.getArea());
		
		//원의 둘레: import하여 해당 클래스를 문서에 포함시킴.
		Circle circle2 = new Circle(4.5);
		System.out.println("반지름이 4.5인 원의둘레:"+ circle2.getPerimeter());
	}
 
}
