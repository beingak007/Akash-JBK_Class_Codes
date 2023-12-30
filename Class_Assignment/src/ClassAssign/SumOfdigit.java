package ClassAssign;

import java.util.Scanner;

public class SumOfdigit {
	
	
	public static void m() {
		int digit = 123;
		int sum = 0;
		while (digit > 0) {
			int res = digit % 10;
			sum = sum + res;
			digit = digit / 10;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		m();

		long n,sum;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		n=s.nextLong();
		for(sum=0;n!=0;n/=10) {
			sum+=n%10;
			
			
		}
		System.out.println("Sum is :"+sum);
		
	}

}
