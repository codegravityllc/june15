package trainer.chap12_static_final;

public class AdvancedCar  {
	public void slow() {
		final int a=20;
		a=30;
		System.out.println("drive fast");
	}
	public int add(int a, int b) {
		return a/b;
	}
}
