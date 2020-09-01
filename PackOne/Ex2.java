package PackOne;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 접근제한자 복습 및 추가
		 * 1. public - 모든 클래스에서 접근 가능
		 * 2. protected
		 * 3. default(package) - 같은 패키지 내의 클래스에서 접근 가능
		 *    => 접근제한자를 아무것도 명시하지 않으면 default 로 선언됨
		 * 4. private - 자신의 클래스에서만 접근 가능
		 *              (다른 클래스에서 접근 불가)
		 */
	
	
		Parent2 p = new Parent2();
		System.out.println(p.publicvar);
		System.out.println(p.protectedVar);
		System.out.println(p.defaultVar);
		//System.out.println(p.privateVar); // private은 해당 클래스에서만 사용 가능
	
	
	
	}

}


class SamePackageOtherClass{
	// 같은 패키지 내에 존재하는 다른 클래스에서의 접근 제한자 접근 범위
	public void useMember() {
		// Parent 클래스의 인스턴스를 생성하여 멤버에 접근
		Parent2 p = new Parent2();
		System.out.println(p.publicvar);
		System.out.println(p.protectedVar);
		System.out.println(p.defaultVar);
		//System.out.println(p.privateVar); // private은 해당 클래스에서만 사용 가능
	
		
	}
	
}