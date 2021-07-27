package trainer.chap10_access_privilegs.pack2;
import trainer.chap10_access_privilegs.pack1.Program;
public class Program3  extends Program{
	public Program3() {
		super();
	}
	public void method1() {
		System.out.println(a);
		System.out.println( b );
		System.out.println(c );
		System.out.println(d);
		abc();
	}
}
