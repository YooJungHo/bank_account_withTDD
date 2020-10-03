package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Account;

class AccountTest {
	
	/**
	 * TODO
	 * 1. 잔고를 인출하면 인출되야함.
	 * 2. 잔고를 초과하는 금액이면 안된다고 떠야함.
	 * 3. 
	 */
	
	private Account account;
	
	@BeforeEach
	private void setup() {
		account = new Account(10000);
	}

	//하나의 테스트가 하나의 기능을 테스트하도록 만드는 것이 기본 원칙.
	//실패(질문) - 성공(응답) - 정제(리팩토링)

	@Test
	public void testAccount() throws Exception{
		account = new Account();
	}
	
	@Test
	public void testGetBalance() throws Exception{
		//10,000원으로 계좌 생성 후, 잔고 조회 결과가 일치하는 지 ? 테스트
		assertEquals("10000원으로 계좌 생성 후 잔고 조회",10000, account.getBalance());
		
		//assertEquals()가 일치하지 않으면 fail()을 던짐.
		account = new Account(1000);
		assertEquals(1000, account.getBalance());
		
		account = new Account(0);
		assertEquals(0, account.getBalance());
	}
	
	@Test //출금하기
	public void testwithdraw() throws Exception{
		Account account = new Account(10000);
		account.withdraw(1000);
		assertEquals(9000, account.getBalance());
		
		//0, minus
		account.withdraw(-100);
		account.withdraw(0);
		//한도초과
		account.withdraw(10001);
	}
}
