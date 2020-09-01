import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	MyFrame m = new MyFrame();
	
	
	
	
	
	
	
	
	
	}

}

// javax.swing.JFrame 클래스를 상속받는 MyFrame 클래스를 정의 
class MyFrame extends JFrame{
	
	public MyFrame() {
		showFrame();
	}
	
	public void showFrame() {
		// JFrame 클래스의 setTitle() 메서드를 후출하여 문자열전달 프레임의 재목표시줄 내용 설정
		setTitle("프레임연습"); // Setter메서드 밖에서 전달받아서 안에 변수에 전달 받는 역활
		
		// JFrame 클래스의 setSize() 메서드를 호출하여
		// 정수 2개 전달 =>프레임의 크기(가로, 세로) 설정 
 		
		setSize(300, 200);
		
		
		
		// JFrame 클래스의 setVisible() 메서드를 호출하여
		// 논리형 데이터 1개 전달 = > 화면표시 여부 설정
		
		setVisible(true);
		
	
	}	
	
}

