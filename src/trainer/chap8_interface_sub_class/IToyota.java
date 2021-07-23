package trainer.chap8_interface_sub_class;
// incomplete program/ abstract
public abstract interface IToyota {
	int a=20; // constant or final or unchangable
	public abstract void drive(); // access/chnage info
	public void start();
	void stop();
	default void reverse() {
		System.out.println("abc");
	}
 }
