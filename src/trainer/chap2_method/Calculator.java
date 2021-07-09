package trainer.chap2_method;

public class Calculator {
	String name="google calculator"; // has-a
	// does-a
	// add, sub,mul, div
	public int add( int a  , int b ) {
		int x=10;
		String y="12";
		boolean z=true;
		int p=10;
		String q="12";
		boolean r=true;
		
		// method call
		// 1) pass right input ( RHS )
		// 2) handle output ( LHS )in all scenario EXCEPT void
		int abc=sub( a, y, 10 );// passing input
		
		int sum=a+b;
		return sum;
	}
	// if primitive input - pass literal value or variable of SAME type	
	// if primitive output - return literal value or variable of SAME type	
	public int  sub( int a  , String s, int b ) {
		/*
		int x=10;
		String y="12";
		boolean z=true;
		return  false;
		*/
		int sum=a-b;
		return sum;
	}
	// if complex/object input - PASS INITIALIZED variable of SAME type	
	public int mul( int a  , int b ) {
		int x=10;
		String y="12";
		boolean z=true;
		Address addr=new Address();
		changeAddress( addr   );
		return x;
	}
	
	public void changeAddress(Address a) {
		//asdsadad
		//asdsadad
	}
	
	// if complex/object output - RETURN INITIALIZED variable of SAME type	
	public Address getCustomerAddres() {
		int x = 10;
		String y="new york";
		boolean z=true;
		Address a=new Address();
		return a;
	}
	
	
	
	
	
	
	
}
