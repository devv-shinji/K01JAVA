package ex17collection;

class Apple {
	int weight;
	public Apple(int w) {
		weight = w;
	}
	public void showInfo() {
		System.out.println("애플의 무게는"+ weight +"입니다.");
	}
}

class Banana {
	int sugar;
	public Banana(int s) {
		this.sugar = s;
	}
	public void showInfo() {
		System.out.println("바나나의 당도는 "+ sugar +"입니다.");
	}
}

/*
class FruitBox {
	Object item;
	public void store(Object item) {
		this.item = item;
	}
	public Object pullOut() {
		return item;
	}
}

=> 기존 Object기반의 FruitBox를 아래와 같이 제네릭 클래스로 정의한다.
자료형에 해당하는 부분은 대표문자 T(Type)으로 교체하고, 객체생성시
자료형을 결정하기 위해 "클래스명<T>" 형태로 변경한다.
 */
class GenericFruitbox<T> {
	T item;
	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
}

public class Ex02GenericClass {
	public static void main(String[] args) {
		
		/*
		인스턴스 생성시 T부분을 결정하므로 구현의 편의성이 보장된다.
		각각 Apple, Banana 객체를 저장할 수 있는 인스턴스가 생성되었다.
		 */
		GenericFruitbox<Apple> appleBox = new GenericFruitbox<Apple>();
		appleBox.store(new Apple(10));
		Apple apple = appleBox.pullOut();
		apple.showInfo();
		
		GenericFruitbox<Banana> bananaBox = new GenericFruitbox<Banana>();
		bananaBox.store(new Banana(20));
		Banana banana = bananaBox.pullOut();
		banana.showInfo();
		
		/*
		OrangeBox는 인스턴스 생성시 Orange를 저장할 수 있는 용도로 생성되었기 때문에
		다른 객체는 저장할 수 없다. 아래 코드에서 컴파일에러가 발생되므로 자료형에도 안전한 코드가 된다.
		 */
		//Orange클래스는 같은 패키지 내에 있기 때문에 해당 코드에서 사용은 가능
		GenericFruitbox<Orange> orangeBox = new GenericFruitbox<Orange>();
//		orangeBox.store("나는 오렌지");//Orange타입 아님 <-컴파일 에러 발생
//		orangeBox.store(apple);//Orange타입 아님
//		orangeBox.store(banana);//Orange타입 아님
	}
}
