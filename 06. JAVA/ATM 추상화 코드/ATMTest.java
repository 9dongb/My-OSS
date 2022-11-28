package introduce;

public class ATMTest {

	public static void main(String[] args) {
		ATM my = new ATM(); // ATM클래스의 my 객체 생성
		my.owner = "구동빈"; // 계좌 소유자 이름 설정
		my.setAccountNumber(9403_02_384894L); // 계좌 번호 설정

		System.out.print("계좌 소유자 명 : " + my.owner);
		System.out.println(" / 계좌번호 : " + my.getAccountNumber());
		
		my.now(); // 잔액 조회
		my.in(50000); // 입금
		my.out(5000); // 출금
		my.out(5500); // 동전 단위 출금 불가 예시

		my.now(); // 금액이 빠져나가지 않은 것을 확인
	}

}
