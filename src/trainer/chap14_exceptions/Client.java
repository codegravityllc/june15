package trainer.chap14_exceptions;

import java.io.IOException;

import trainer.chap3_refernces.Person;

public class Client {
// compile time and run time
	static Person s1=new Person();
	static Person s2=new Person();
	static Person s3=new Person();
	static Person s4=new Person();
	
	public static void main(String[] args) {
		/*
		Person p=null;
		System.out.println( p.age );
		System.out.println( p.name);
		p.method();
		
		System.out.println(s1.age);
		s1.age=s2.age;
		s3.age=s4.age;
		System.out.println(s4.age);
		System.out.println("welcome to java bank");
		int j;
		try {
			System.out.println("A");
			int i=10;
			System.out.println("B");
		}catch(Exception e) {
			// developer insight
			e.printStackTrace();
			System.out.println(" please try again later");
		}finally { // guarenteed block, error occurs or not
			System.out.println("thank you for using java bank");
		}
		System.out.println("main ends");
		*/
		int a=-999900;
			System.out.println("main begins");
			Server t = new Server();
			try {
				t.method1();
			} catch (InsufficientFundException e) {
				e.printStackTrace();
			}
			System.out.println("main ends");
		 
	}

}

/*
Server method3 line 21
Server method2 line 12
Server method1 line 6
main method line 9
*/