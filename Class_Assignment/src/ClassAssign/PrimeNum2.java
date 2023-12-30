package ClassAssign;

public class PrimeNum2 {

	public static void main(String[] args) {
		int count = 0;

		for (int i = 2; i <= 20; i++) {

				for (int j = 1; j <= i; j++) {
					
				if (i % j == 0) {
					count = count + 1;
					System.out.println(i);
					
				}
			}
			if (count == 2) {
				System.out.println(i + " number is Prime");
			}
		}

	}

}
