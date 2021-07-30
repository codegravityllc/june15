package trainer.chap13_arrays;

public class TestArr {

	public static void main(String[] args) {
		Customer c1=new Customer();
		Customer c2=new Customer();
		Customer c3=new Customer();
		 
		// initialize array itself = declare 100000 cus var
		Customer[] allCus=new Customer[1000000];
		// initialize all 100000 varaible that are in above array
		for(int i=0; i <1000000 ; i++) {
			allCus[i]=new Customer();
		}
		System.out.println(allCus[0]);
		System.out.println(allCus[1]);
		System.out.println(allCus[2]);
		System.out.println(allCus[3]);
		System.out.println(allCus[999999]);
		
	}

}
