package trainer.chap14_exceptions;

public class Server {
	public void method1() {
		System.out.println("A");
		method2();
		System.out.println("AA");
		
	}
	public void method2() {
		System.out.println("B");
		method3();
		System.out.println("BB");
		
	}
	public void method3() {
		try {
			System.out.println("C");
			int i=0;
			int j=10;
			int k=j/i;
			System.out.println("CC");
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
