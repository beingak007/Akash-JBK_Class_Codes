
package ClassAssign;

public class ReverseNumber {
	public static void main(String[] args) {
		
		  int num=123; 
		  int reverse=0; 
		  while(num !=0) { 
			  int res=num%10;
			  reverse=(reverse*10)+res; 
			  num/=10;
		 			
		}
		System.out.println(reverse);
		
	}
}


