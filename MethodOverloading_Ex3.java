
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 가변 인자(비정형 인자, Variable Arguments)
		 * - 메서드 정의 시 파라미터(매개변수)에 전달되는 인자의 갯수가 유동적일때 일정 갯수가 정해져 있지 않으므로 변수 선언이 어렵다.
		 * 따라서, 이렇게 유동적인 인자 갯수를 모두 처리할 수 있도록
		 * 가변 인자를 사용하여 변수를 선언하면 동일한 타입의 갯수가 제한이 없는 인자를 모두 전달 받을 수 있음
		 * 
		 * - 가변인자 형태로 선언되는 매개변수는 전달받은 데이터를 해당이름을 가진 배열 형태로 관리함
		 * - 가변 인자에 전달될 데이터는 0개부터 자유롭게 전달 가능
		 * 
		 * < 주의 사항! >
		 * 가변 인자는 마지막 파라미터로 단 한번만 사용 가능하다!
		 * 
		 * 
		 * <가변 인자를 사용한 메서드 정의 기본 문법?
		 * [제한자] 리턴타입 메서드명(데이터 타입... 변수명){
		 * 			// =>전달되는 데이터들이 해당 변수명의 배열로 관리됨
		 * 		
		 * }
		 * 
		 */
		
		
		VariableArguments a = new VariableArguments();
		
		//a.print();
		//a.print();
		a.normalprint(10,20);
		a.normalprint(10, 20);
		//a.print();
		System.out.println("----------------");
		
		
		// 가변인자를 사용한 메서드 호출 시 전달할 파라미터 갯수 제한 없음
		a.varargsPrint(10);
		a.varargsPrint(10,20);
		a.varargsPrint(10,20,30);
		a.varargsPrint(10,20,30,40);
		a.varargsPrint(10,20,30,40,50);
		a.varargsPrint();
	}

}

class VariableArguments {
	public void varargsPrint(int... nums) {
		//외부로부터 전달되는 정수형 데이터는 갯수 젱한없이 모두 nums 이름을 갖는 배열에 저장됨
		// ==> 배열 내의 모든 데이터에 접근하여 저장된 데이터 사용
		// (1) 일반 for문
		for(int i=0;i< nums.length;i++) {
			System.out.println("nums["+i+"] = " + nums[i]);
		}
		
		// (2) 향산된 for문
		
		for(int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public void varargsPrint2(String title, int... nums) {}
	// ==> 가변인자 앞에 다른 매개변수가 있더라도, 마지막이 가변인자면 ok
	//public void varargsPrint2(int... nums, String title) {}
	// ==> 가변인자 뒤에 다른 매개변수가 올 수 없다!
	//public void varargsPrint2(int... nums, String... title) {}
	// => 가변인자 뒤에 다른 매개변수가 올수 없음로! 2개이상의 가변인자 사용도 불가능하다!
	
	// 정수 2개(n1, n2)를 전달받아 출력하는 print() 메서드 정의
	public void normalprint(int n1, int n2){
				System.out.println(n1 + ". " + n2);
	}
	
	// 정수 3개(n1, n2, n3)를 전달받아 출력하는 print() 메서드 정의
	public void normalprint(int n1, int n2, int n3){
		System.out.println(n1 + ". " + n2 + ", " + n3);
	}
}
