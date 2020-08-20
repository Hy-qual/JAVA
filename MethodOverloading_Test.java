
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 간단한 계산기 (Calculator 클래스) - calc() 메서드 오버로딩 해야할것 : ==>연산자(char opr) 1개와 정수
		 * 2~4개 (num1 ~ num4)를 전달받아 해당 연산자에 맞는 연산 결과를 출력하는 메서드 오버로딩 *
		 * 
		 */

		Calculator c = new Calculator();

		c.calc('+', 10, 20); // 10 + 20 = 30 출력
		c.calc('+', 10, 20, 30); // 10 + 20 + 30 = 60 출력
		c.calc('+', 10, 20, 30, 40); // 10 + 20 + 30 + 40 = 100출력
		
		c.calc('-', 100, 10); // 100 - 10 = 90 출력
		c.calc('-', 100, 10, 20); // 100 - 10 - 20 = 70 출력
		c.calc('-', 100, 10, 20, 30); // 100 - 10 - 20 - 30 = 40 출력

		c.calc('*', 10, 20); // 10 * 20 = 200 출력
		c.calc('*', 10, 20, 30); // 10 * 20 * 30 = 6000 출력

		c.calc('/', 100, 10);
		c.calc('/', 100, 10, 2);

	}

}

class Calculator {

	public void calc(char a, int n1, int n2) {
		if (a == '+') {
			System.out.println(""+n1 + a + n2 + "=" + (n1 + n2));
		} else if (a == '-') {
			System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
		} else if (a == '*') {
			System.out.println(n1 + "*" + n2 + "=" + (n1 * n2));
		} else if (a == '/') {
			System.out.println(n1 + "*" + n2 + "=" + (n1 * n2));
		}
		System.out.println("-------------------------------------");
	}

	public void calc(char a, int n1, int n2, int n3) {
		if (a == '+') {
			System.out.println(n1 + "+" + n2 + "+" + n3 + "=" + (n1 + n2 + n3));
		} else if (a == '-') {
			System.out.println(n1 + "-" + n2 + "-" + n3 + "=" + (n1 - n2 - n3));
		} else if (a == '*') {
			System.out.println(n1 + "*" + n2 + "*" + n3 + "=" + (n1 * n2 * n3));
		} else if (a == '/') {
			System.out.println(n1 + "/" + n2 + "/" + n3 + "=" + (n1 / n2 / n3));
		}
		System.out.println("-------------------------------------");
	}

	public void calc(char a, int n1, int n2, int n3, int n4) {
		if (a == '+') {
			System.out.println(n1 + "+" + n2 + "+" + n3 + "+" + n4 + "=" + (n1 + n2 + n3 + n4));

		} else if (a == '-') {
			System.out.println(n1 + "-" + n2 + "-" + n3 + "-" + n4 + "=" + (n1 - n2 - n3 - n4));

		}
		System.out.println("-------------------------------------");
	}
}
