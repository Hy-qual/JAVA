
public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * 메서드 오버로딩(매개변수 갯수 또는 순수가 다른 메서드)
		 *  - 매개변수의 타입이 같더라도 갯수가 다르면 오버로딩이 성립됨
		 *    ==> 단, 타입이 같은 매개변수간의 순서변경은 오벌됭이 아님!
		 *     * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		OverloadingMethod om = new OverloadingMethod();
		// 반드시 호출하려는 메서드의 매개변수 갯수 및 타입이 일치해야함
		om.print(10, 20);
		om.print(10, 20, 30);
		// om.print(10, 20, 30, 40); 오류 OverloadingMethod is not applicable for the arguments (int, int, int, int)

		
		//om.print2(2, "홍길동", "이순신");
		
	//	om.print2(3, "홍길동", "이순신" , "강감찬");
		
		om.print2(4, "홍길동", "이순신", "강감찬", "김태희");
		
			
		//==> 오버로딩을 갯수가 다르개도 활용 가능하는 것을 보여주는 예시
		
		
		
		// 정수 1개, 실수 1개를 전달받아 덧셈 결과를 출력하는 sum 메서드
		om.sum(1, 3.14);    // 실수형 자릿수 문제때문에 0.000000000000000001 이 더해짐
		om.sum(3.14, 1);
		
		
	}

}
		
		
		
class OverloadingMethod{
	// 매개변수 갯수가 다른 메서드 오버로딩
	
	// 정수 2개를 전달 받는 메서드
	public void print(int n1, int n2){
		System.out.println(n1+ ","+ n2);
		
		
	}
	
	// 정수 3개를 전달 받는 메서드
	
public void print(int n1, int n2, int n3){
		
	System.out.println(n1+ ","+ n2+ ","+ n3);	
		
	}


// -----------------------------------------------------------------

// 정수 1개(count)와 문자열(name) 2~4개까지 전달받는 print2() 메서드 정의
	

public void print2(int count, String name1, String name2, String name3, String name4) {
	System.out.println(count + " : " + name1 + "," + name2);
	
	System.out.println(count + " : " + name1 + "," + name2 + ", " + name3);
	
	System.out.println(count + " : " + name1 + "," + name2 + ", " + name3 + ", " + name4);
	
	
	
}

// 정수 1개, 실수 1개를 전달받아 덧셈 결과를 출력하는 sum 메서드

public void sum(int num1, double num2) {
	

	System.out.println(num1 + " + " + num2 +" = " + (num1+num2));
	 
	
}

public void sum(double num1, int num2) {
	

	System.out.println(num1 + " + " + num2 +" = " + (num1+num2));
	 
	
}


public void sum(int num1, int num2) {
	

	System.out.println(num1 + " + " + num2 +" = " + (num1+num2));
	 
	
}


//public void sum(int num2, int num1) {
//	
//
//	System.out.println(num1 + " + " + num2 +" = " + (num1+num2));
//	 
//	
//} 같은 데이터 타입끼리 순서는 바꿀 수 없다! => 오버로딩 성립 X  => 자바입장에서는 int num1, int num2 가 같은 메서드로 인식함




}
		
		
	
