package IsA;

// IS-A Inheritance--MultiLevel

class College{
	String cname;
}
class Department extends College{
	String dname;
}
class Employee1 extends Department {
	String ename;
    Employee1(String ename1,String dname1,String cname1){
    	ename=ename1;
    	dname=dname1;
    	cname=cname1;
    }
    
    void getEmployee() {
    	System.out.println("Employee Details");
    	System.out.println("Employee Name :"+ename);
    	System.out.println("Employee Department:"+dname);
    	System.out.println("Employee College  :"+cname);
    }
}
public class MultiLevel {

	public static void main(String[] args) {
		Employee1 em=new Employee1("Em-AA","CSE","JNTUK");
		em.getEmployee();
	}
}
