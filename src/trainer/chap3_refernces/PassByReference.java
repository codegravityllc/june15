package trainer.chap3_refernces;

public class PassByReference {
	public void method1(Person p, int a) {
		p=new Person();
		p.name="jane";
		p.age=20;
		a=20;
		method2(p);
	}
	public void method2(Person p1 ) {
		p1.name="mike";
		p1.age=30;
	}
	
}
