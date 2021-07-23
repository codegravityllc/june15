package trainer.chap8_interface_sub_class;

public class TestIphone {

	public static void test(Iphone3 i) {
		
	}
	public static void main(String[] args) {
		Iphone3 i3=new Iphone3();
		Iphone3 i4=new Iphone5();
		Iphone5 i5=new Iphone5();
		test(i5);
		
		
		
		i3.call();
		i3.text();
		System.out.println(i3.keypad);
		if( i3 instanceof Iphone5 ) {
			System.out.println("actually a iphone5");
			System.out.println("unlocking hidden features");
			( (Iphone5)i3  ).browse();
			( (Iphone5)i3  ).facialRecog();
			System.out.println(  ( (Iphone5)i3  ).a);
		}
		else{
			System.out.println("not an iphone5");
			System.out.println("cannot unlock hidden Iphone5 features");
		}
		
		//Iphone5 i5=new Iphone3();
		
		
		
		
		
		
		/*
		Iphone3 i3=new Iphone3();
		Iphone4 i4=new Iphone4();
		i3.call();
		i3.text();
		i4.call();
		i4.text();
		i4.browse();
		System.out.println(i4.keypad);
		Iphone5 i5=new Iphone5();
		i5.call();
		i5.text();
		i5.browse();
		i5.facialRecog();
		System.out.println(i5.keypad);
		*/
	}

}
