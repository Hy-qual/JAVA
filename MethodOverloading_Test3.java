
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator3 c = new Calculator3();

		c.calc('+', 10, 20); // 10 + 20 = 30 출력
		c.calc('+', 10, 20, 30); // 10 + 20 + 30 = 60 출력
		c.calc('+', 10, 20, 30, 40); // 10 + 20 + 30 + 40 = 100출력
		
		c.calc('-', 100, 10); // 100 - 10 = 90 출력
		c.calc('-', 100, 10, 20); // 100 - 10 - 20 = 70 출력
		c.calc('-', 100, 10, 20, 30); // 100 - 10 - 20 - 30 = 40 출력

		c.calc('*', 10, 20); // 10 * 20 = 200 출력
		c.calc('*', 10, 20, 30); // 10 * 20 * 30 = 6000 출력

		c.calc('/', 100, 10);
		c.calc('/', 100, 10, 2, 2, 2, 2); 
	
	
	}

}


class Calculator3{
	public void calc(char opr, int... nums) {
		
		int total = nums[0];
		double total2 = nums[0];
		
		System.out.print(nums[0]);
		
		switch(opr) {
		
		case('+'):
			total = nums[0];	
			
			
			for(int i=1;i<nums.length;i++) {
				
				total += nums[i];
							
			System.out.print(" + " + nums[i]);
			
			}
			System.out.println(" = " + total);
			break;
		case('-'):
			total = nums[0];
			for(int i=1;i<nums.length;i++) {
				
				total -= nums[i];
				System.out.print(" - "+nums[i]);
				
			}
			System.out.println(" = " +total);
			break;
		case('*'):
			total = nums[0];
			for(int i=1;i<nums.length;i++) {
				
				total *= nums[i];
				System.out.print(" * "+nums[i]);
			
			}
			System.out.println(" = " +total);
			break;
		case('/'):
			total = nums[0];
			for(int i=1;i<nums.length;i++) {
				
				total2 /= nums[i];
			System.out.print(" / "+nums[i]);
			
			}
			System.out.println(" = " + total2);
			break;
		
			
		
		}
		

	}
}
