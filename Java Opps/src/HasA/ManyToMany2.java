package HasA;

//Many To Many Using Setter Method Dependency
class Courses1{
	String cname;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	
}
class Students1{
	String sname;
    Courses1[] cr;
   
    public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Courses1[] getCr() {
		return cr;
	}

	public void setCr(Courses1[] cr) {
		this.cr = cr;
	}

	public void getStudents() {
    	System.out.println("Student Details");
    	System.out.println("Student Name :"+sname);
    	System.out.println("Courses :");
    	for(int i=0;i<cr.length;i++) {
    		Courses1 c=cr[i];
    		System.out.println("\t"+c.cname);
    	}
    	System.out.println();
    }
}
public class ManyToMany2 {

	public static void main(String[] args) {
		Courses1 cr1=new Courses1();
		 cr1.setCname("Java");
		 Courses1 cr2=new Courses1();
		 cr2.setCname("Spring");
		Courses1[] cr= {cr1,cr2};
		Students1 st=new Students1();
		st.setSname("S-ABC");
		st.setCr(cr);
		Students1 st1=new Students1();
		st1.setSname("S-DEF");
		st1.setCr(cr);
		st.getStudents();st1.getStudents();

		
		
		
	}
}
