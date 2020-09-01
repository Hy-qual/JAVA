
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * 상속에서의 생성자
	 * - 생성자는 상속되지 않는다!
	 *  ==> 생성자의 이름은 자신의 클래스 이름과 동일해야하므로
	 *  	부모의 생성자를 상속받으면 클래스 이름과 다르기 때문이다! 
	 * - 서브클래스의 인스턴스를 생성하기 위해 생성자를 호출하면
	 * 	 해당 생성자 내에서 암묵적으로 슈퍼클래스의 생성자를 호출하면 
	 *   암묵적으로 슈퍼클래스의 인스턴스가 생성되고 슈퍼클래스의 생성자를 호출하여 
	 *   작업을 수행한 후 서브 클래스 생성자 내의 코드가 실행됨
	 * 
	 */
		
		SpiderMan s = new SpiderMan();
	
		//생성자가 상속되지 않았으므로 파라미터 생성자는 SpiderMan 클래스에 존재하지 않는다.
//		SpiderMan s2 = new SpiderMan("피터파커", 20); // 오류발생!
		

	}

}

class Person {
	// ==> Person 클래스는 별도의 상속이 표시되지 않았으므로
	// 자동으로 Object클래스를 상속받는다!
	String name;
	int age;
	
	// 기본 생성자 정의
	public Person() {
		// Object 클래스의 기본생성자 Object()가 자동으로 먼저 호출됨
		System.out.println("생성자 Person() 생성됨");
	}
	
	
	// 단축키 alt + shift +s   ++O 로 생성
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

// Person 클래스를 상속받는 SpiderMan 클래스 정의
class SpiderMan extends Person{

	public SpiderMan() {
		// 서브클래스 생성자 호출 시 다른 코드를 실행하기 전
		// 먼저 슈퍼클래스의 생성자가 자동으로 호출됨
		//  ==> 먼저 Person() 생성자가 호출됨
		System.out.println("생성자 SpiderMAn() 호출됨!");
	}

	
	public void fireWeb() {
		System.out.println("거미줄 발사!");
	}
		
}