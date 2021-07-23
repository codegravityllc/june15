package trainer.chap8_interface_sub_class;

public class Camry implements IToyota, ISoundSystem{
	public void reverse() {
		System.out.println("ttt");
	}
	public void drive() {
		System.out.println(a);
		// a=30;
		System.out.println("driving economy car camry");
	}
	public void start() {
		System.out.println("startinng economy car camry");
	}
	public void stop() {
		System.out.println("stopping economy car camry");
	}
	public void volume() {
		System.out.println("loud speaker");
	} 
}
