package ex10accessmodifier;

public class AccountDAO2 {
	
	private AccountDTO2 capsule = new AccountDTO2();
	
	public void init(String name, String accNumber, int balance) {
		capsule.setName(name);
		capsule.setAccountNumber(accNumber);
		capsule.setBalance(balance);
	}
	
	public void deposit(int money) {
		capsule.setBalance(capsule.getBalance() + money);
		System.out.println(money +"원이 입금되었습니다.");
		printAccount();
	}
	
	public void withdraw(int money) {
		if (capsule.getBalance()< money) {
			System.out.println("출금불능-잔액부족");
			return;
		}
		capsule.setBalance(capsule.getBalance()-money);
		System.out.println(money+"원이 출금되었습니다.");
		printAccount();
	}
	
	public void printAccount() {
		System.out.printf("[%s님의계좌정보]\n", capsule.getName());
		System.out.printf("계좌번호:%s\n", capsule.getAccountNumber());
		System.out.printf("잔액:%d원\n", capsule.getBalance());
	}
	
		
}
