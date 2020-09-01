
public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * 
	 */
		//Point2D p2 = new Point2D();
		
		//p2.get2D();
		
		Point3D p3 = new Point3D();
		
		p3.print3D();
		p3.get2D(); // 상속받았기 때문에 슈퍼클래스를 따로 인스턴스 생성 없이 슈퍼클래스의 메서드 사용 가능
		
		
		System.out.println("-----------------------------------");
		

		
		
	}

}


// 2차원 좌표를 관리하는 Point2D 클래스 정의
class Point2D{
	// x, y 축 좌표 정보를 저장하는 인스턴스 변수 선언
	int x = 10;
	int y = 20;	
	
	// x,y 축 좌표 정보를 출력하는 메서드 정의
	public void get2D() {
		System.out.println("x = " + x + ", y = " + y);
		
	}
	
}


// 3차원 좌표를 관리하는 Point3D 클래스 정의
class Point3D extends Point2D{
	// ==> 2차원 좌표 관리는 이미 Point2D 클래스에서 수행중이므로 Point2D 클래스를 상속받아 Point3D 클래스를 정의하면
	//     코드중복 제거 됨
	int z = 30;
	
	public void print3D() {
		
		System.out.println("3차원 좌표 = " + "x = " + x + ", y = " + y + ", z = " + z);
	}
	
}


	
	
