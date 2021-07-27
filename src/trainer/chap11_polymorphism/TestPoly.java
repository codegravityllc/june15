package trainer.chap11_polymorphism;

import java.util.Scanner;

public class TestPoly {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for nissan, 2 for toyota");
		int option=sc.nextInt();
		if(option ==1) {
			Nissan n=new Nissan();
			testDrive(n);
		}
		else if(option ==2) {
			Toyota t=new Toyota ();
			testDrive(t);
		}
		else if(option ==3) {
			Ferrari t=new Ferrari();
			testDrive(t);
		}
		else {
			Car c=new Car ();
			testDrive(c);
		}
	}

	public static void testDrive(Car c)
	{
		c.drive();
		
	}
	public static void occu(Mom m) {
		m.occupation();
	}
}
