package trainer.chap7_constructors;

public class Car {
	
	String color="white";
	String speaker="dolby";
	int door=4;
	int vin=1234;
	
	public Car() {
		
	}
	public Car(String color) {
		this.color=color;
	}
	public Car(String color,int d) {
		this.color=color;
		door=d;
	} 
	public void drive() {
		
	}
}
