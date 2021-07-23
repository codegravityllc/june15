package trainer.chap8_interface_sub_class;
public class TestInterface {
	public static void main(String[] args) {
		IToyota it=new Camry();
		it.drive();
		it.reverse();
	}
}
