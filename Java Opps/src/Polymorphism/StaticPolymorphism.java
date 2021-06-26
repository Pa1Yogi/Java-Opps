package Polymorphism;
// Method Overloading
class Addition {
	public void sum(int i) {
		System.out.println("int"+i);
	}
	public void sum(int i,int j) {
		System.out.println("int-int"+(i+j));
	}
	public void sum(int i,int j,int k) {
		System.out.println("int-int"+(i+j+k));
	}
	public void sum(long i,long j,long k) {
		System.out.println("long-long"+(i+j+k));
	}
	
	public void sum(int i,long j) {
		System.out.println("int-Long"+(i+j));
	}
	public void sum(long i,long j) {
		System.out.println("long-long"+(i+j));
	}
	public void sum(double i,double j) {
		System.out.println("Double-Double"+(i+j));
	}
	public void sum(float i,float j) {
		System.out.println("float-float"+(i+j));
	}
	
}
public class StaticPolymorphism {

	public static void main(String[] args) {
		
		Addition a=new Addition();
		a.sum(10, 10);
		a.sum(10, 15);
		a.sum(10.5, 15.9);
		a.sum(20, 30, 15);
		a.sum(4);
		a.sum(40, 50, 20);
		a.sum(10.2f,8.5f);
		
		
	}
}
