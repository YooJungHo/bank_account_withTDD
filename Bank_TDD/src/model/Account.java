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
				System.out.print("- �ݾ��� ������ �� �����ϴ�.");
			} else {
				System.out.println("0���� ������ �� �ִ� �ݾ��� �ƴմϴ�.");
			}
		} else {
			this.balance -= money;
		}

	}

}
