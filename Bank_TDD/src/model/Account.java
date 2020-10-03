package model;

public class Account {

	private long balance;

	public Account() {
	}

	public Account(long money) {
		if (money < 0) {
			System.out.println("���»��� ����");
		} else {
			this.balance = money;
		}
	}

	public long getBalance() {
		return this.balance;
	}

	public void deposit(long money) {
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
