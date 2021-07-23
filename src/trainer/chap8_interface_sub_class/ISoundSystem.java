package trainer.chap8_interface_sub_class;

public interface ISoundSystem {
	public void volume();
	public void start();
	default void reverse() {
		System.out.println("pqr");
	}
 }
