package ClassAssign;

public class Factorial {
	int fact=1;
	int num=5;
	public void Fact() {
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			
			System.out.println(i+" ");
			System.out.println("factorial of Number :  "+fact);
		}
		
	}

}
