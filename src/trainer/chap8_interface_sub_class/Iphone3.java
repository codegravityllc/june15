package trainer.chap8_interface_sub_class;

public class Iphone3 {
	
	public Iphone3() {
		System.out.println("in phone3 constr");
	}
	
	public int keypad=10;
	public void call() {
		System.out.println("make calls");
	}
	public void text() {
		System.out.println("send texts");
	}
}
