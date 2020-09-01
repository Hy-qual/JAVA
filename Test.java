
public class Test {

	public static void main(String[] args) {
		ItwillBank ib = new ItwillBank();
		ib.accountNo = "111-1111-111";
		ib.ownerName = "홍길동";
		ib.deposit(100000);
		System.out.println("출금된 금액 : " + ib.withdraw(50000));
		
		ib.contract("자동차보험");
		
		ib.print();
	}

}

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public int withdraw(int amount) {
		if(amount > balance) { // 잔고가 부족하여 출금이 불가능할 경우 
			// 출금할금액 > 현재잔고 일 경우 출금 불가
			System.out.println("출금 불가! (잔액 부족)");
			System.out.println("출금할 금액 : " + amount + 
									"원, 현재잔고 : " + balance + "원");
			
			amount = 0; // if문 외부에서 한번에 리턴을 수행할 경우
			// => 출금금액을 0으로 만들어서 리턴
		} else {
			balance -= amount; // 출금 수행
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("현재잔고 : " + balance + "원");
		}
		
		return amount;
	}
	
	public void deposit(int amount) {
		// 입금할금액(amount)를 현재잔고(balance)에 누적
		balance += amount;
		
		// 입금금액과 현재잔고 출력
		System.out.println("입금된금액 : " + amount + "원");
		System.out.println("현재잔고 : " + balance + "원");
	}
	
}


// Account 클래스를 상속받는 ItwillBank 클래스 정의
// 1) 보험명(insureName, 문자열) 변수 선언
// 2) 보험계약(contract()) 메서드 정의
//    => 파라미터(문자열, insureName), 리턴값 없음
//       => 전달받은 보험명(insureName)을 멤버변수에 전달하고
//          "계약하신 보험명 : XXX 보험입니다." 출력
class ItwillBank extends Account {
	String insureName;
	
	public void contract(String insureName) {
		this.insureName = insureName;
		System.out.println("계약하신 보험명 : " + insureName + "입니다.");
	}
	
	public void print() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
		System.out.println("보험명 : " + insureName);
	}
}














