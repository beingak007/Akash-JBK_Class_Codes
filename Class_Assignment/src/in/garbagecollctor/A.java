package in.garbagecollctor;



class B{
	B(){
		System.out.println("Object is creating ");
	}
	public void finalize() {
		System.out.println("Object is destroying ");
		
	}
}
public class A {
	public static void main(String[] args) {
		B b =new B();
		b=null;
		System.gc();
		System.out.println("--------------");
		Runtime.getRuntime().gc();
	}
	

}
 