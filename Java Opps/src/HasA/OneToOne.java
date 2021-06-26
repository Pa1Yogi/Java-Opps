package HasA;

//One To One by using Constructor dependency
class Account {
	String accno;
	String accname;
	Account(String accno,String accname){
		this.accno=accno;
		this.accname=accname;
	}
}
class Employee{
	String empname;
	String empid;
	Account acc;
	Employee(String empname,String empid,Account acc){
		this.empname=empname;
		this.empid=empid;
		this.acc=acc;
	}
	
	public void display() {
		System.out.println("Employee Details");
		System.out.println("Employee Name  :"+empname);
		System.out.println("Employee Id    :"+empid);
		System.out.println("Employee Account Details");
		System.out.println("Account Name   :"+acc.accname);
		System.out.println("Account Number :"+acc.accno);
	}
	/*public String toString() {
		return "Employee Details\nEmployee Name\t:"+empname+"\nEmployee Id\t:"+empid+"\nEmployee Account Details\nAccount Name\t:"+acc.accname+"\nAccount Number\t:"+acc.accno+"";
	} */
}
public class OneToOne {
 
	public static void main(String[] args) {
		Account acc=new Account("57AFd876","Pavan");
		Employee emp=new Employee("Pavan","2020yr",acc);
		emp.display();
	//	System.out.println(emp);
		
		
	}
}
