package trainer.chap8_interface_sub_class;

public class Iphone5 extends Iphone4 {
	int a=2;
	
	public void test( int a ) {
		System.out.println( a );
		System.out.println(  this.a  );
		System.out.println(  super.a );
		
	}
	
	
	
	public Iphone5( ) {
		super(); // parent constructor that has no parameter
		System.out.println(  super.a ); // parent class global variable a
		super.browse(); // parent class browse method
	}
	
	public void facialRecog() {
		System.out.println("unlock by facial recog");
	}
}
