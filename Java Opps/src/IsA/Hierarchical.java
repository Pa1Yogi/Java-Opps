package IsA;

//IS-A Inheritance--Hierarchical
class Employee{
	String ename;
	String eaddr;
	void getEmpDetails() {
		
		System.out.println("Employee Name    :"+ename);
		System.out.println("Employee Address :"+eaddr);
	}
}
class Manager extends Employee{
	Manager(String ename1,String eaddr1){
		ename=ename1;
		eaddr=eaddr1;
	}
	void getManagerDetails() {
		System.out.println("Manager Details");
		getEmpDetails();
	}
}
class Accounter extends Employee{
	Accounter(String ename1,String eaddr1){
		ename=ename1;
		eaddr=eaddr1;
	}
	void getAccounterDetails() {
		System.out.println("Accounter Details");
		getEmpDetails();
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		
		Manager mr=new Manager("M-AAA","Hyd");
		Accounter ac=new Accounter("A-BBB","BAN");
		mr.getManagerDetails();
		ac.getAccounterDetails();
	}
}
