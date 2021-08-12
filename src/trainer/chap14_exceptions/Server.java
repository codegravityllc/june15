package trainer.chap14_exceptions;

import java.io.File;
import java.io.IOException;

import trainer.chap3_refernces.Person;

public class Server {
	public void method1() throws InsufficientFundException {
	
	int balance=100;
	int withdraw=1000000;
	// business problem
	int remainingBalance= balance - withdraw;
	if(remainingBalance < 0) {
		throw new InsufficientFundException("withdraw less than your balance - 100");
	}
	
		System.out.println("A");
		method2();
		System.out.println("AA");

	}

	public void method2() {
		System.out.println("B");
		method3();
		System.out.println("BB");

	}

	public void method3() {
		try {
			File f = new File("d://1.txt");
			// 1 execption
			f.createNewFile();
			Person p = new Person();
			// 2 exception
			System.out.println(p.age);
			Person[] population = new Person[5];// 0,1,2,3,4
			// 3 exception
			System.out.println(population[4]);
			System.out.println("C");
			// 4 runtime exception
			int k = 10 / 2;
			System.out.println("CC");
		} catch (IOException e) {
			System.out.println("invalid drive location");
		} catch (NullPointerException npe) {
			System.out.println("variable not initialized");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("access items within range. less than size - 1");
		} catch (ArithmeticException ae) {
			System.out.println("divide by zero. infinity cannot be stored in variable");
		} catch (RuntimeException t) {

		} catch (Exception t) {

		} catch (Throwable t) {

		}

	}
}
