package trainer.chap2_method;

public class Arithmetic {
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
	public int simpleInterest(int pri,int time,int rate) {
		int temp1=mul(pri , time); // method call = input pass, output handle
		int temp2=mul(temp1 , rate);
		int temp3=div(temp2, 100);
		return temp3;
	}
	public int areaOfSquare(int side) {
		int temp=mul(side, side);
		return temp;
	}
}
