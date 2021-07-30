package trainer.chap12_static_final;

public final class Car {
	static final String company="Nissan";
	public int add(int a, int b) {
		return a+b;
	}
	public void slow() {
		System.out.println("drive slow");
	}
	public void fast() {
		System.out.println("drive fast");
	}
}	
