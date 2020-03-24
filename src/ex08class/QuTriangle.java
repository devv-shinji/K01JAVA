package ex08class;
/*
밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의해보자. 
init메소드를 통해 밑변과 높이를 초기화한다.
그리고 밑변과 높이를 변경시킬수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 함께 정의해보자.
실행결과]
삼각형의 넓이 : 85.0
삼각형의 넓이 : 350.0
 */

class Triangle {
	//멤버변수
	int bottom;
	int height;
	
	//밑변과 높이를 초기화하는 멤버메소드
	public void init(int bot, int hei) {
		 bottom = bot;
		 height = hei;
	}
	//삼각형의 넓이를 계산해서 반환하는 멤버메소드
	public double getArea() { 
		return bottom * height * 0.5; //0.5를 곱하니 double형이 들어가 오류가 난다. 메소드 타입을 더블로 변경
	}
	
	public void setBottom(int bottom) {
		this.bottom = bottom;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}

public class QuTriangle {

	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea()); //출력이 되야 되기 때문에 반환타입.
		t.setBottom(50);//밑변 50으로 변경 //코드만 보았을 때 반환타입이 아닐 확률이 크다. 출력도 안되니! void
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());
	}
}
