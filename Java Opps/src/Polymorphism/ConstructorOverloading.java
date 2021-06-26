package Polymorphism;


public class ConstructorOverloading {

	ConstructorOverloading(int n){
		System.out.println(n);
	}
	
	ConstructorOverloading(int num1,int num2){
		System.out.println(num1+num2);
	}
	ConstructorOverloading(float f1,float f2){
		System.out.println(f1+f2);
	}
	ConstructorOverloading(double d1){
		System.out.println(d1);
	}
	ConstructorOverloading(){
		System.out.println("0");
	}
	
	public static void main(String[] args) {
		
		new ConstructorOverloading(10);
		new ConstructorOverloading(10,20);
		new ConstructorOverloading(10.2f,11.4f);
		new ConstructorOverloading(10.2);
		
		new ConstructorOverloading();
	}
}
