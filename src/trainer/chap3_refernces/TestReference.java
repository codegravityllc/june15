package trainer.chap3_refernces;
public class TestReference {
	public static void main(String[] args) {
		int ab=10; // variables
		Person pr=new Person();// refernce variable
		PassByReference ref=new PassByReference();
		ref.method1(pr, ab);
		System.out.println(pr.age);
		System.out.println(pr.name);
		System.out.println(ab);
		
		
		
		/*
		Person pr1=new Person();			
		pr=new Person();
		pr1.age=30;
		pr1.name="jane";
		pr1.age=pr.age;
		pr.age=20;
		pr.age=pr1.age;
		System.out.println(pr.age);
		System.out.println(pr1.age);
		System.out.println(pr.name);
		System.out.println(pr1.name);
		*/
		
		
	}
}
