package ex09package.kosmo.seller;

public class FruitSeller4 {
	//과일판매자를 추상화한 클래스
	int numOfApple;//판매자의 사과 보유갯수
	int myMoney;//판매수익
	int APPLE_PRICE; //다시 상수로선언. 클래스 내의 상수여서 선언과 동시에 초기화 해야 하지만, 아래의 생성자메소드에서 초기화가 가능하다.
	
	public FruitSeller4(int money, int appleNum, int price) { //생성자(함수인듯 함수아닌 너)
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;// <= 생성자 내에서는 상수를 초기화할 수 있음.
	}
	
	public int saleApple(int money) {
		
		System.out.println(money+"=="+APPLE_PRICE);
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}

