package trainer.chap10_access_privilegs.pack1;
public class Program2 {
	public void method1() {
		Program p=new Program();
		System.out.println(p.a);
		System.out.println(p.b);
		System.out.println(p.c);
		System.out.println(p.d);
		p.abc();
	}
}
