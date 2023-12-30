package ClassAssign;

public class CountDigit {

	public static void main(String[] args) {
		
		  int num=123; 
		  int count=0; 
		  while(num !=0) { 
			  int res=num%10;
			  count++;
			  num/=10;
		 		
		}
		System.out.println(count);
		
	}

	}


