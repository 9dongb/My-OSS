package introduce;

public class ATM {
	public String owner; // 계좌 소유자의 이름
	private long accountNumber; // 계좌번호 12자리
	public int total; // 계좌 총 잔액 
	
	public ATM() {
		System.out.println("안녕하세요 동빈은행에 오신 것을 환영합니다.");
	}
	// 계좌 잔액 조회 메소드
	public void now() {
		System.out.println("현재 계좌 잔액은 " + total + "원 입니다.\n");
	}
	
	// 계좌 입금 메소드
	public void in(int money) {
		if (money % 1000 != 0) {
			System.out.println("죄송합니다. 지폐 단위만 입금이 가능합니다.\n");
		}else {
			total += money;
			System.out.println(money + "원 입금이 완료되었습니다.");
			System.out.println("총 잔액 :" + total);
			System.out.println();
			
		}

	}
	// 계좌번호 설정 Setter
	public void setAccountNumber(long accountNumber) {
		if (accountNumber < 1000_00_000000L) // 계좌번호가 12자리 밑이면 에러
		{
			System.err.println("잘못된 계좌 번호입니다.");
			
			return ;
		}
		this.accountNumber = accountNumber;
	}
	
	// 계좌번호 반환 Getter
	public long getAccountNumber() {
		return accountNumber;
	}
	
	// 계좌 출금 메소드
	public void out(int money) {
		if ((total < money)) {
			System.out.println("출금할 잔액이 부족합니다.\n");
		}else if (money % 1000 != 0) {
			System.out.println("죄송합니다. 지폐 단위만 출금이 가능합니다.\n");
		}else {
			total -= money;
			System.out.println(money +"원 출금이 완료되었습니다.");
			System.out.println("총 잔액 :" + total);
			System.out.println();
		}

	}


}
