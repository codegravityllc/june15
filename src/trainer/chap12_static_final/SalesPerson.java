package trainer.chap12_static_final;

// restriction
// static method can call static ONLY
public class SalesPerson {
	// class variable
	static int carSold = 0;
	// instance variable
	int salary = 0; // store infor

	// non static method can call everyone
	public void m2() {
		System.out.println(carSold);
		System.out.println(salary);
		m3();
		m4();
	}
	// static method can ONLY call other static members
	public static void m3() {
		System.out.println(carSold);
		System.out.println(salary);
		m4();
		m5();
	}
	public void m4() {

	}
	public static void m5() {

	}
	

	// change information
	// utility method
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void m1() {
		carSold++;
	}
}
