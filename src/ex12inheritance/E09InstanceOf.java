package ex12inheritance;

/*
instanceof 연산자
	: 인스턴스변수가 어떤 타입의 변수인지를 판단하는 연산자로
	형변환(즉 상속관계가 있으면)이 가능하면 true,
	불가능하면 false를 반환한다.
	- 객체간에 형변환이 되려면 반드시 두 클래스간에 상속관계가 있어야한다.
	- 부모클래스의 참조변수로 자식객체를 참조할 수 있으므로,
	매개변수로 전달된 인자가 어떤 타입인지 확인할 때 주로 사용된다.
 */
class Box {
	public void boxWrap() {
		System.out.println("Box로 포장합니다");
	}
}
class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("PaperBox로 포장합니다");
	}
}
class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("GoldPaperBox로 포장합니다");
	}
}

public class E09InstanceOf {

	/*
	- 여기서 instanceof 연산자를 통해 형변환 가능여부를 판단하는
	이유는 전달된 매개변수가 최상위클래스인 Box타입으로 받고 있기 때문이다.
	- Box타입으로 인자를 받게되면 자동으로 업캐스팅(자동형변환)이 되기 때문에
	자식클래스의 멤버메소드를 호출할 수 없게된다.
	- 이 때 자식의 멤버메소드를 호출하기 위해서는 다운캐스팅(명시적형변환)이 필요하다.
	- 따라서 전달된 인자를 각각의 타입으로 형변환이 가능한지 판단한 후 다운캐스팅을 진행하고
	멤버메소드를 호출할 수 있게된다.
	 */
	static void wrapBox(Box b) {//부모클래스로 업캐스팅(자동형변환) 되어 파라미터 전달됨.
		
		//기본자료형의 강제형변환으로 참고용 예시임
		int num1 = (int)1.0;
		//기본자료형의 자동형변환
		double num2 = 1;
		
		if (b instanceof GoldPaperBox) {//Box형 b야, GoldPaperBox랑 연관있니?
			((GoldPaperBox) b).goldWrap();//다운캐스팅
		}
		else if(b instanceof PaperBox) {
			((PaperBox) b).paperWrap();//다운캐스팅
		}
		else if(b instanceof Box) {
			b.boxWrap();
		}
	}
	
	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
		
		String str = new String("나는누구?");
		//wrapBox(str);//에러발생
	}

}
