package model;

public class Account {

	private long balance;

	public Account() {
	}

	public Account(long money) {
		if (money < 0) {
			System.out.println("계좌생성 실패");
		} else {
			this.balance = money;
		}
	}

	public long getBalance() {
		return this.balance;
	}

	public void deposit(long money) {
		if(money <= 0) {
			System.out.println("0원 이하의 값을 입력할 수 없습니다.");
		}else {
			this.balance += money;			
		}
	}

	public void withdraw(int money) {
		if(money <= 0) {
			System.out.println("0원 이하의 값을 입력할 수 업습니다");
		}else {
			if(this.balance > money) {
				this.balance -= money;
			}else {
				System.out.println("한도 초과!!");
			}
		}
	}

}
