package trainer.chap6_control_flows;

import java.util.Scanner;

public class controls {

	public static void main(String[] args) {
		int pinRegisterd=1234;
		int pinATmMachine=1234;
		int balance=100;
		int withdrawFromAtm=50;
		boolean a=true;
		// literal boolean value
		// boolean variable
		// expresssion/operator that generates boolean
		if ( pinRegisterd == pinATmMachine ) {
			System.out.println("welcome to java bank");
		}
		else {
			System.out.println("invalid pin,please try again");
		}
		
		int x=2;
		
		
		
		if(x==1) {
			System.out.println("hi");
		}
		else {
			System.out.println("bye");
		}
			
		// fixed loop
		for( int i=0; i < 5; i ++)	
		{
			System.out.println("hi");
		}
		
		System.out.println("*************");
		for( int i=1; i < 5; i++ ){
			System.out.println("hi");
			if(i==3)
				break;
			System.out.println("bye");
		}
		
		System.out.println("exit");
		
		
		System.out.println("Do you want to add"
				+ " item to cart type yes/no");
		Scanner sc=new Scanner(System.in);
		String option=sc.next();
		
		while(option.equals("yes")) {
			System.out.println("entered while");
			System.out.println("Do you want to add another item to cart");
			option=sc.next();
		}
		
		// 0 or more loop
		int i=1;
		while( i > 3) {
			System.out.println("hello");
			i++;
		}
		
		System.out.println("done while");
		
		// 1 or more loop
		int j=1;
		do{
			System.out.println("do while hello");
			j++;
		}while( j < 3) ;
		
		
		
		if ( x==1 && x >2 || x==4 && x!=3) {
			System.out.println("value is 1");
		}
		else if ( x==2 ) {
			System.out.println("value is 2");
		}
		else if ( x == 3 ) {
			System.out.println("value is 3");
		}
		else {
			System.out.println("unnkown value");
		}
		// primitve and string variable only
		String name="jane";
		switch(name) {
			case "john":
				System.out.println("hi john");
				break;
			case "jane":
				System.out.println("hi jane");
				break;
			case "mike":
				System.out.println("hi mike");
				break;
			default:
				System.out.println("hi new person");
				break;
		}
		
		System.out.println("bye bye control flow");
	
		String atmContinue="";
		do {
			System.out.println("enter 1 for withdraw, 2 for deposit, 3 for exit");
			int atmOption=sc.nextInt();
			switch(atmOption) {
				case 1:
					System.out.println("please enter withdraw amount");
					break;
				case 2:
					System.out.println("please enter deposit amount");
					break;
				case 3:
					System.out.println("thank for using our atm");
					break;
				default:
					System.out.println("please enter 1,2 or 3");
					break;
			}
		System.out.println("do you want to perofrm another transaction");
		atmContinue=sc.next();
		}while( atmContinue.equals("yes"));
		
		
	}

}
