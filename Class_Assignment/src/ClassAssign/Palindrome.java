package ClassAssign;

public class Palindrome {
	public static void main(String[] args) {

		int num = 122 ;
		int temp = num;
		int rev = 0;

		while (num > 0) {

			int rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;

		}
		System.out.println(rev);

		if (temp == rev) {
			System.out.println(temp + "  >> Is Palindrome");
		} else {
			System.out.println(temp + "  >> Is Not palindrome");
		}

	}
}
