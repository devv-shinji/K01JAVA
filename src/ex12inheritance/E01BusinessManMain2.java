package ex12inheritance;

class ManMan{
	private String name;
	
	public ManMan() {//기본생성자
		System.out.println("Man클래스 디폴트 생성자 호출됨");
	}
	public ManMan(String name) {//인자생성자
		this.name = name;
		System.out.println("Man클래스의 인자생성자 호출됨");
	}
	public void tellYourName() {
		System.out.println("내 이름은"+ name +"입니다.");
	}
}

class BusinessManMan extends ManMan {
	
	private String company;
	private String position;
	
	//기본생성자
	public BusinessManMan(String name, String company, String position) {
		super(name);//3개의 매개변수 중 제일 앞쪽의 name은 부모클래스에게 인자값으로 보내 호출한다.
		
		this.company = company;
		this.position = position;
		System.out.println("business맨 생성자 호출");
	}
	
	public void tellYourInfo() {
		System.out.println("회사명은"+ company +"입니다.");
		System.out.println("직급은"+ position +"입니다.");
		tellYourName();
	}
}

public class E01BusinessManMain2 {

	public static void main(String[] args) {

		BusinessManMan man1 = new BusinessManMan("신지희", "KOSMO", "대표"); 
		BusinessManMan man2 = new BusinessManMan("아무개", "KOSMO", "회장"); 
		
		man1.tellYourInfo();
	}
}
