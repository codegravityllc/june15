package trainer.chap8_interface_sub_class;

public class Iphone5 extends Iphone4 {
	
	public Iphone5() {
		super();
		System.out.println("in phone5 constr");
	}
	
	public void facialRecog() {
		System.out.println("unlock by facial recog");
	}
}
