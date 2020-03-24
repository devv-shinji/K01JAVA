package ex09package.kosmo.area;

public class Circle {
	double rad;
	final double PI;//클래스의 멤버변수로 상수를 선언할 때 초기화를 바로 한번만 가능하지만, 
	
	public Circle(double rad) {//선언자가 있을 경우 이 안에서 상수의 초기화가 가능하다. 선언자도 한번만 가능하니까 특성이 비슷해서!
		this.rad = rad;
		PI = 3.14159;
	}
	//원의 넓이를 반환하는 멤버메소드
	public double getArea() {
		return PI * rad * rad;
	}
}
