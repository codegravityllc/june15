package trainer.chap8_interface_sub_class;

public class Iphone4 extends Iphone3{
	int a=1;
	public Iphone4( ) {
		super();
		System.out.println("in phone4 constr");
	}
	
	public void browse() {
		System.out.println("browse internet");
	}
}
