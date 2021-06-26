package HasA;

//One to One by using Setter method Dependency

class Account1 {
	String accno;
	String accname;
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
}
class Employee1{
	String empname;
	String empid;
	Account1 acc1;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public Account1 getAcc1() {
		return acc1;
	}
	public void setAcc1(Account1 acc1) {
		this.acc1 = acc1;
	}
	public void display() {
		System.out.println("Employee Details");
		System.out.println("Employee Name  :"+getEmpname());
		System.out.println("Employee Id    :"+getEmpid());
		System.out.println("Employee Account Details");
		System.out.println("Account Name   :"+acc1.getAccname());
		System.out.println("Account Number :"+acc1.getAccno());
	}
}
public class OneToOne2 {

	public static void main(String[] args) {
	  Account1 ac=new Account1();
	  ac.setAccname("Pavan");
	  ac.setAccno("538FHk9");
	  Employee1 em=new Employee1();
	  em.setEmpid("A-11");
	  em.setEmpname("bypkr");
	  em.setAcc1(ac);
	  em.display();
	}
}
