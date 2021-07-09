package trainer.chap3_refernces;

public class TestBank {

	public static void main(String[] args) {
		int a=10; // a-10 
		int b=20; // a-10 , b-20
		b=a; // a-10, b-10
		a=30; // a-30, b-10
		a=b;// a-10 , b-10
		System.out.println(  b );
		System.out.println( a );
		
		// reference variable
		BankAccount ba=new BankAccount();
		System.out.println( ba.dayOfBirth); 
		System.out.println( ba.yearofBirth); 
		System.out.println( ba.customerBalance); 
		System.out.println( ba.customerAge); 
		
	}

}
