package model;

public class Account {

	private int balance;

	public Account() {
	}

	public Account(int money) {
		this.balance = money;
	}

	public int getBalance() {
		return this.balance;
	}

	public void deposit(int money) {
		if(money <= 0) {
			System.out.println("0�� ������ ���� �Է��� �� �����ϴ�.");
		}else {
			this.balance += money;			
		}
	}

	public void withdraw(int money) {
		if(money <= 0) {
			System.out.println("0�� ������ ���� �Է��� �� �����ϴ�");
		}else {
			if(this.balance > money) {
				this.balance -= money;
			}else {
				System.out.println("�ѵ� �ʰ�!!");
			}
		}
	}

}
