package Polymorphism;
//Method overriding
class A {
/*	private void m() {
		System.out.println("A class private method"); 
	} 
 */
	public void m1() {
		System.out.println("A class same  method with B");
	}
	public void m2() {
		System.out.println("A class non final method with B class final method");
	}
	static void m3() {
		System.out.println(" A class static method with B class static method");
	}
	protected void m4() {
		System.out.println("A class protected method with B class public mehtod");
	}
}
class B extends A{
	/*public void m() {
		System.out.println("B class public method with A class private method");
	}
	*/
	public void m1() {
		System.out.println("B class same methods with A ");
	}
	public final void m2() {
		System.out.println("B class final method with A class non final method");
	}
	static void m3() {
		System.out.println("B class static method");
	}
	public void m4() {
		System.out.println(" B class public method with A class protected method");
	}
}

public class DynamicPolymorphism {

	public static void main(String[] args) {
	   /*	A a=new A();
		a.m1();
		a.m2();
		a.m3();
		a.m4(); */
		
		
		A a1=new B();
		a1.m1();
		a1.m2();
		a1.m3();
		a1.m4();
		
	   B b=new B();
	   b.m1();
	   b.m2();
	   b.m3();
	   b.m4();
	                   
	
}}
