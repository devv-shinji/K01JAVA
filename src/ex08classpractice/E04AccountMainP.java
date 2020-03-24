package ex08classpractice;
/*
시나리오] 은행계좌를 추상화 해보자
	멤버변수 : 예금주(name)
			계좌번호(accountNumber)
			잔고(balance)

	멤버메소드 : 입금하다(deposit())
	 		출금하다(withdraw())
	 		계좌잔고 출력하기(showAccount())

	조건1 : 입금은 무제한으로 가능함
	조건2 : 잔고가 부족할 경우에는 출금불능 처리
 */

class Account {
	
	String name;
	String accountNumber;
	int balance;
	
	void deposit(int money) {
		balance += money;
		System.out.println(money +"원이 입금됨");
	}
	void withdraw(int money) {
		if(balance >= money) {
			balance -= money;
			System.out.println(money +"원이 출금됨");
		}
		else {
			System.out.println("잔고부족으로 출금불능");
		}
	}
	void showAccount() {
		System.out.println("계좌주: "+ name);
		System.out.println("계좌번호: "+ accountNumber);
		System.out.println("잔고: "+ balance);
	}
	void init(String n, String a, int b) {
		name = n;
		accountNumber = a;
		balance = b;
	}
}

public class E04AccountMainP {
	
	public static void main(String[] args) {

		Account account = new Account();
		account.init("장동건", "111-2222-3333", 1000);
		account.deposit(9000);
		account.withdraw(5000);
		account.showAccount();
		
		Account account2 = new Account();
		account2.init("고소영", "111-2222-3333", 1000);
		account2.deposit(9000);
		account2.withdraw(5000);
		account2.showAccount();
		
		Account account3 = new Account();
		account3.name = "신지희";
		account3.accountNumber = "111-2222-3322";
		account3.balance = 900000;
		account3.withdraw(1000000);
		account3.showAccount();
	}
}
