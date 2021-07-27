package trainer.chap11_polymorphism;

public class child extends Mom{
	// overloaded/compiletime polymorphism
	public void talk(String a) {
		System.out.println("french");
	}
	public void talk(float a) {
		System.out.println("hindi");
	}
	// overriding/ runtime polymorphism
	public void occupation() {
		System.out.println("engineer");
	}

}
