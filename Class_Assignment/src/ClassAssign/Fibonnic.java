package ClassAssign;

public class Fibonnic {
	
	
	// 0 , 1 , 1 , 2 , 3 , 5 , 8 ,  fibonnic series
	
	
	public static void main(String[] args) {
	
		
		 int num = 5;
	     int a = 0;
	    int b = 1;
	     
	     System.out.print(a+" , "+b+" , ");
	  
	     for (int i = 1; i <= num; i++)
	       {
	    	 int nextTerm = a + b;
	    	 a=b;
	    	 b= nextTerm;
	          System.out.print(nextTerm + " , ");
	       }


	   }
	}


