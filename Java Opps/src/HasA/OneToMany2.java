package HasA;

//One To many using Setter Method Dependency
class Employee3{
	String eid;
	String ename;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	}
class Department1{
	String did;
	String dname;
	Employee3[] emp;
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Employee3[] getEmp() {
		return emp;
	}

	public void setEmp(Employee3[] emp) {
		this.emp = emp;
	}

	public void getDepartments() {
		System.out.println("Departments Details");
		System.out.println("Department Id   :"+getDid());
		System.out.println("department name :"+getDname());
		System.out.println("Employee Details");
		System.out.println("EID\tENAME");
		for(int i=0;i<emp.length;i++) {
			Employee3 e=emp[i];
			System.out.println(e.getEid()+"\t"+e.getEname());
		}
	}
}
public class OneToMany2 {
 
	public static void main(String[] args) {
		Employee3 e1=new Employee3();
		Employee3 e2=new Employee3();
		e1.setEid("e-123");
		e1.setEname("E-ABC");
		e2.setEid("e-124");
		e2.setEname("E-DEF");
		Employee3[] emp= {e1,e2};
	    
	    Department1 dp=new Department1();
	    dp.setDid("d-123");
	    dp.setDname("D-ABC");
	    dp.setEmp(emp);
	    dp.getDepartments();
		}
}
