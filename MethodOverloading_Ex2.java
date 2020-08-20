
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	/* 매서드 오버로딩의 특징
	 * 사람 보폭을 1m  = 100cm
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
		
	WalkBad w = new WalkBad();
	
	w.walk();
	w.walk(2);
	w.walk(2, "m"); // m로 변환
	w.walk(2, "cm"); //cm로 변환
	w.walk(2, "inch");  // 불가능한 단위로 가정해서 입력!
	
	System.out.println("==========================");
	
	WalkGood wg = new WalkGood();
	wg.walk();
	wg.walk(2);   // m로 변환
	wg.walk(2, "cm"); // cm 그대로 출력
	
	
	}

}

class WalkBad {
	
	// 사람의 한 걸음(보폭)의 이동 거ㅣㄹ 출력
	public void walk() {
		System.out.println("100cm 이동");
		
	}
	// 사람 걸음 수에 따른 이동거리 출력
	public void walk(int step) {
		System.out.println(step * 100 + "cm 이동!");
		
	}
	
	// 사람 걸음 수에 따른 이동 거리를 지정한 단위에 따라 cm변환 후 출력
	
	
	
	public void walk(int step, String unit) {
		
		//switch - case 문을 사용하여 단위 판별 ("cm" or "m" )
		
		double distance = 0.0;
		switch(unit) {
		
		
		case("cm"): 
			System.out.println(step * 100 + "cm이동!");
			break;
		case("m"):   // step * 100 결과를 m로 변환하기 위해 / 100
			System.out.println(step + "m 이동!");
			break;
		default: 
			System.out.println("알수없는 단위이므로 이동 불가");
		
		}
		
	}
	
	
}


class WalkGood {
	
	//오버로딩 된 메서드끼리 수행할 작업이 중복되는 경우
	// 하나의 메서드에서 다른 메서드를 호출하여
	// 필요한 데이터를 전달함으로써 중복되는 코드를 제거 할 수 있다!
	
	
	// 사람의 한 걸음(보폭)의 이동 거리 출력
	public void walk() {
		System.out.println("100cm 이동");

		
	}
	// 사람 걸음 수에 따른 이동거리 출력
	public void walk(int step) {
		//System.out.println(step * 100 + "cm 이동!");
		// 동일한 step * 100 계산과 "cm 이동!" 메시지를 출력하는 코드를
		// step, unit 파라미터를 전달받는 메서드 호출을 통해 중복 제거 수행
		walk(1, "cm");
	}
	
	// 사람 걸음 수에 따른 이동 거리를 지정한 단위에 따라 cm변환 후 출력
	
	
	
	public void walk(int step, String unit) {
		
		//switch - case 문을 사용하여 단위 판별 ("cm" or "m" )
		
		double distance = 0.0;
		switch(unit) {
		
		
		case("cm"): 
			System.out.println(step * 100 + "cm이동!");
			break;
		case("m"):   // step * 100 결과를 m로 변환하기 위해 / 100
			System.out.println(step + "m 이동!");
			break;
		default: 
			System.out.println("알수없는 단위이므로 이동 불가");
		
		}
		
	}
	
	
}


