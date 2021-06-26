package HasA;

// Many To One Using Setter Method Dependency
class Branch1 {
	String bname;
	public void setBname(String bname) {
		this.bname=bname;
	}
	public String getBname() {
		return bname;
	}
}
class Student1{
	String sname;
	Branch1 br;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Branch1 getBr() {
		return br;
	}
	public void setBr(Branch1 br) {
		this.br = br;
	}
	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("Student Name   :"+getSname());
		System.out.println("Student Branch :"+br.getBname());
	}
}
public class ManyToOne2 {

	public static void main(String[] args) {
		Branch1 br=new Branch1();
		br.setBname("CSE");
		Student1 st=new Student1();
		Student1 st1=new Student1();
		st.setSname("S-1");
		st.setBr(br);
		st1.setSname("s-2");
		st1.setBr(br);
		st.getStudentDetails();
		st.getStudentDetails();
	}
	
}
