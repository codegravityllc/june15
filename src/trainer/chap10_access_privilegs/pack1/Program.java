package trainer.chap10_access_privilegs.pack1;
// outer class/ top level class
public class Program {
	public int a=10; // everyone access
	int b=10; // default.. program same package
	protected int c=10; // same packge + related program anywhere
	private int d=10; // same program
	public Program() {
		
	}
	protected void abc() {
		System.out.println();
	}
	// inner class
	private class abc{
		
	}
}
