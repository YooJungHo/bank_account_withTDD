package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Account;

class AccountTest {
	
	/**
	 * TODO
	 * 1. �ܰ� �����ϸ� ����Ǿ���.
	 * 2. �ܰ� �ʰ��ϴ� �ݾ��̸� �ȵȴٰ� ������.
	 * 3. 
	 */
	
	private Account account;
	
	@BeforeEach
	private void setup() {
		account = new Account(10000);
	}

	//�ϳ��� �׽�Ʈ�� �ϳ��� ����� �׽�Ʈ�ϵ��� ����� ���� �⺻ ��Ģ.
	//����(����) - ����(����) - ����(�����丵)

	@Test
	public void testAccount() throws Exception{
		account = new Account();
	}
	
	@Test
	public void testGetBalance() throws Exception{
		//10,000������ ���� ���� ��, �ܰ� ��ȸ ����� ��ġ�ϴ� �� ? �׽�Ʈ
		assertEquals("10000������ ���� ���� �� �ܰ� ��ȸ",10000, account.getBalance());
		
		//assertEquals()�� ��ġ���� ������ fail()�� ����.
		account = new Account(1000);
		assertEquals(1000, account.getBalance());
		
		account = new Account(0);
		assertEquals(0, account.getBalance());
	}
	
	@Test //����ϱ�
	public void testwithdraw() throws Exception{
		Account account = new Account(10000);
		account.withdraw(1000);
		assertEquals(9000, account.getBalance());
		
		//0, minus
		account.withdraw(-100);
		account.withdraw(0);
		//�ѵ��ʰ�
		account.withdraw(10001);
	}
}
