package model;

public class Account {

	private int balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int money) {
		this.balance = money;
	}

	public int getBalance() {
		return this.balance;
	}

	public void deposit(int money) {
		this.balance += money;
	}

	public void withdraw(int money) {
		if (money <= 0) {
			if (money < 0) {
				System.out.print("- 금액은 인출할 수 없습니다.");
			} else {
				System.out.println("0원은 인출할 수 있는 금액이 아닙니다.");
			}
		} else {
			this.balance -= money;
		}

	}

}
