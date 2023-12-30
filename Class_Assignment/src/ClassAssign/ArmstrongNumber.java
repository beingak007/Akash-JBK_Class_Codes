package ClassAssign;

public class ArmstrongNumber {
	public static void main(String[] args) {
	
		        int number = 371, originalNumber, result = 0;

		        originalNumber = number;

		        while (number != 0)
		        {
		            int remainder = number % 10;
		            result += Math.pow(remainder, 3);
		           number /= 10;
		        }

		        if(result == originalNumber)
		            System.out.println(originalNumber + " is an Armstrong number.");
		        else
		            System.out.println(originalNumber + " is not an Armstrong number.");
		    }
		}