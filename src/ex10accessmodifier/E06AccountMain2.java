package ex10accessmodifier;

public class E06AccountMain2 {

	public static void main(String[] args) {

		//DAO객체 생성
		AccountDAO2 cap = new AccountDAO2();
		
		//데이터 초기화를 통해 DTO객체 생성
		cap.init("홍길동", "1234-5678-9", 10000);
		//통장정보출력
		cap.printAccount();
		//출금처리
		cap.withdraw(20000);
		cap.withdraw(3000);
		//입금처리
		cap.deposit(10000);
		//통장정보출력
		cap.printAccount();
		
	}

}
