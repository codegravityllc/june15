package trainer.chap8_interface_sub_class;

public abstract class Lexus implements IToyota {
	public void drive() {
		System.out.println("driving luxury car lexus");
	}
	public void start() {
		System.out.println("startinng luxury car lexus");
	} 
}
