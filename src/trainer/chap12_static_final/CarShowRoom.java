package trainer.chap12_static_final;

public class CarShowRoom {

	public static void main(String[] args) {
		SalesPerson s1=new SalesPerson();
		SalesPerson s2=new SalesPerson();
		SalesPerson s3=new SalesPerson();
		
		SalesPerson.carSold++;
		SalesPerson.m3();
		
		s2.carSold++;
		s2.m3();
		
		s3.carSold++;
		s1.carSold++;
		System.out.println(s1.carSold);
		System.out.println(s2.carSold);
		System.out.println(s3.carSold);
		
		
	}

}
