package Abstraction;

interface D{
	void m1();
	void m2();
}
abstract class E implements D{
	public void m1() {
		System.out.println("B-m1");
	}
}
class F extends E{
	public void m2() {
		System.out.println("c-m2");
	}
}
public class Abstraction2 {

	public static void main(String[] args) {
		
		D d1=new F(); 
			d1.m1(); //B-m1
			d1.m2(); //c-m2
			
		
	}
}
