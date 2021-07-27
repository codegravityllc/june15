package trainer.chap10_access_privilegs.pack2;
import trainer.chap10_access_privilegs.pack1.Program;
public class Program4 {
	public void method1() {
		Program p=new Program();
		System.out.println(p.a);
		System.out.println(p.b);
		System.out.println(p.c);
		System.out.println(p.d);
		p.abc();
	}
}
