package HasA;

// One To many using Constructor dependency
class Employee2{
	String eid;
	String ename;
	Employee2(String eid,String ename){
		this.eid=eid;
		this.ename=ename;
	}
}
class Department{
	String did;
	String dname;
	Employee2[] emp;
	Department(String did,String dname,Employee2[] emp){
		this.did=did;
		this.dname=dname;
		this.emp=emp;
	}
	public void getDepartments() {
		System.out.println("Departments Details");
		System.out.println("Department Id   :"+did);
		System.out.println("department name :"+dname);
		System.out.println("Employee Details");
		System.out.println("EID\tENAME");
		for(int i=0;i<emp.length;i++) {
			Employee2 e=emp[i];
			System.out.println(e.eid+"\t"+e.ename);
		}
	}
}
public class OneToMany {
	public static void main(String[] args) {
		Employee2 e=new Employee2("e-234","Yogi");
		Employee2 e1=new Employee2("e-235","pavan");
		Employee2[] emp=new Employee2[2];
		emp[0]=e;emp[1]=e1;
		Department dep=new Department("d-123","Admin",emp);
		dep.getDepartments();
	}

}
