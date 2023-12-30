package ClassAssign;

public class SumOfNumber {
	public static void main(String[] args) {
		int sum = 0;
	
		int lastNum = 350;
		
		for (int firstNum = 300; firstNum <= lastNum; firstNum++) {
			if (firstNum % 3 == 0) {
				
				sum = sum + firstNum;
				System.out.println(firstNum);
			}

		}
		System.out.println("..............");
		System.out.println(sum);
	}

}
