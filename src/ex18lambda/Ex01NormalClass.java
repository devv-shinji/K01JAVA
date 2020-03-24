package ex18lambda;

/*
일반적인 인터페이스와 클래스를 활용한 오버라이딩
 */
interface IKosmo1 {
	/*
	인터페이스에 정의된 메소드는 public abstract로 선언된다.
	 */
	void studyLambda(String str);
	//interface내에 선언되는 모든 메소드는 추상메소드. abstract를 포함하고 있다.
}
class KosmoStudent1 implements IKosmo1 {
	//인터페이스를 구현 받았으므로 반드시 추상메소드를 오버이딩 해야한다.
	@Override//implements(구현)받으면 abstract 까지 물려받기에 오버라이드를 해주어야 한다.
	public void studyLambda(String str) {
		System.out.println(str + "을/를 공부합니다");
	}
}

public class Ex01NormalClass {

	public static void main(String[] args) {
		/*
		단지 메소드 하나를 정의해서 사용하고 싶은데 인터페이스, 상속, 오버라이딩, 객체생성까지의
		과정을 거쳐야 한다. 과정이 너무 복잡하다.
		 */
		IKosmo1 kosmo = new KosmoStudent1();
		kosmo.studyLambda("람다식");
	}

}
