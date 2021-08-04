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
		
		for(Customer c: allCus) {
			c=new Customer();
		}
		
		
		Customer[][] cus=new Customer[5][3];
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++)
				cus[i][j]=new Customer();
		}
		
		for(Customer[] index1: cus) {
			for(Customer c: index1)
				c=new Customer();
		}
		
		System.out.println(cus[4][2]);
		Customer[] x=new Customer[2];
		x[0]=new Customer();
		// x[1]="john"; ERROR cannot store string value in Customer array.
		
		// int [] scores= {1,45,67,90};
		int [] scores1= new int[4];
		scores1[0]=23;
		scores1[1]=45;
		scores1[2]=67;
		scores1[3]=90;
		
		int [] newScores= new int[4];
		
		System.arraycopy(scores1, 0, newScores, 1, 2);
		// enhanced for loop, for each
		for(int i:newScores)		
			System.out.println(i);
	}

}
