package PackTwo;

import PackOne.Parent2;

// Parent2 클래스를 상속받아 ㅓㅈㅇ의
// => 다른 패키지에 위치하므로 import 문 필수
public class OtherPackageChildClass extends Parent2 {

	public void useMember() {
	
	
	
	//상속 관계에 있는 멤버는 인스턴스 생성 없이 직접 접근해야함
	// => 인스턴스를 생성할 경우 is - a 관계가 아닌 has - a 관계로 바뀜
	
	System.out.println(publicvar);
	System.out.println(protectedVar); // 패키지가 다르고, 상속관계가 아니므로 접근 불가!
	//System.out.println(defaultVar);// 패키지가 달라서 접근 불가!
	//System.out.println(privateVar); // private은 해당 클래스에서만 사용 가능
	
	System.out.println("================================");
	// 주의! 상속 관계에 있는 부모의 인스턴스를 생성할 경우
	// 상속관계가 아닌 일반 포함관계의 클래스로 취급되므로 주의해야함
	
	//인스턴스를 직접 선언해서 쓰면 Has a- 관계가 됨..
	Parent2 p = new Parent2();
	System.out.println(p.publicvar);
	//System.out.println(p.protectedVar); // 패키지가 다르고, 상속관계가 아니므로 접근 불가!
	//System.out.println(p.defaultVar);// 패키지가 달라서 접근 불가!
	//System.out.println(p.privateVar); // private은 해당 클래스에서만 사용 가능
	}
}

