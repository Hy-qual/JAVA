package PackTwo;

import PackOne.Parent2;

public class OtherPackageOtherClass {
	//다른 패키지이면서, 상속 관계가 아닌!! 클래스의 멤버에 접근
	public void useMember() {
		// Parent 클래스의 인스턴스를 생성하여 멤버에 접근
		Parent2 p = new Parent2();
		System.out.println(p.publicvar);
		//System.out.println(p.protectedVar); // 패키지가 다르고, 상속관계가 아니므로 접근 불가!
		//System.out.println(p.defaultVar);// 패키지가 달라서 접근 불가!
		//System.out.println(p.privateVar); // private은 해당 클래스에서만 사용 가능
	
		
	}
	
	
	
	
}
