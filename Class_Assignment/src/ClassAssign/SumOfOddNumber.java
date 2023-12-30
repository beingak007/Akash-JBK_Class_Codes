
package ClassAssign;

public class SumOfOddNumber {
	public static void main(String[] args) {
		
		int n=56;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }

        System.out.println("The sum of all odd numbers from 1 to " + n + " is " + sum);
    }
}

