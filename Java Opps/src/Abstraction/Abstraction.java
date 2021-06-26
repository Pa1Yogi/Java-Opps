package Abstraction;

abstract class Input {
	abstract void sum();
	abstract void subsract();
	abstract void multiply();
	abstract void division();
}
class Calculator extends Input{
	int i;
	int j;
	Calculator(int i1,int j1) {
		i=i1;
		j=j1;
	}
	@Override
	void sum() {
		System.out.println(i+j);	
	}
	@Override
	void subsract() {
		System.out.println(i+j);
	}
	@Override
	void multiply() {
	     System.out.println(i*j);
	}
	@Override
	void division() {
	     System.out.println(i/j);
	}
}

public class Abstraction{
	public static void main(String[] args) {
		Input i=new Calculator(10,5);
		i.sum();
		i.subsract();
		i.multiply();
		i.division();
		
		
		
	}
}