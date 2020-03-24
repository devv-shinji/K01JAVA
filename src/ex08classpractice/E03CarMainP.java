package ex08classpractice;

class Car {
	
	//멤버상수
	public static final String AUTO = "자동";
	public static final String MANUAL = "수동";
	
	//멤버변수
	String carGear = AUTO;
	String carModel;
	int carYear;
	HumanP owner;
	
	//멤버메소드
	void drive() {
		System.out.println(owner.name +"이(가)"+ carModel +"을 운전한다.");
	}
	
	void initialize() {
		carModel = "람보르기니";
		carYear = 2017;
		owner = new HumanP();
		owner.name = "신지희";
		owner.age = 32;
		owner.energy = 20;
	}
	void initialize(String model, int year, String name, int age, int energy) {
		carModel = model;
		carYear = year;
		owner = new HumanP();
		owner.name = name;
		owner.age = age;
		owner.energy = energy;
	}
	
	void showCarInfo() {
		System.out.println("====차량정보====");
		System.out.printf("모델명: %s\n", carModel);
		System.out.printf("연식: %d\n", carYear);
		System.out.printf("기어: %s\n", carGear);
		owner.showState();
	}
}

public class E03CarMainP {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println("초기화메소드 호출전");
		System.out.println("car1.owner="+ car1.owner);//null출력됨
//		car.drive();
		
		System.out.println("초기화메소드 호출후");
		car1.initialize();
		car1.drive();
		car1.showCarInfo();
		
		
		Car car2 = new Car();
		car2.carGear = Car.MANUAL;
		car2.carModel = "벤틀리";
		car2.carYear = 2018;
		
		car2.owner = new HumanP();
		car2.owner.name = "토니스타크";
		car2.owner.age = 52;
		car2.owner.energy = 8;
		
		System.out.println("자동차정보와 소유자정보 같이보기");
		car2.showCarInfo();
		
		
		Car car3 = new Car();
		car3.initialize("스포츠카", 2012, "성유겸", 8, 10);
		car3.showCarInfo();
	}

}
