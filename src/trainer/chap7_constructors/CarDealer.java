package trainer.chap7_constructors;

public class CarDealer {

	public static void main(String[] args) {
		Car customer1=new Car("red");
		Car customer2=new Car("blue");
		Car customer3=new Car("black",3);
		Car customer4=new Car( );
		
		customer1.drive();
		System.out.println(customer1.color);
		
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
	}

}
