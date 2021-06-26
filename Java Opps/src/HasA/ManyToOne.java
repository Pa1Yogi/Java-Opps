package HasA;

//Many To One Using Constructor Dependency
class Branch {
	String bname;
	Branch(String bname){
		this.bname=bname;
	}
}
class Student{
	String sname;
	Branch br;
	Student(String sname,Branch br){
		this.sname=sname;
		this.br=br;
	}
	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("Student Name   :"+sname);
		System.out.println("Student Branch :"+br.bname);
	}
}
public class ManyToOne {

	public static void main(String[] args) {
		Branch br=new Branch("CSE");
		Student st=new Student("S-111", br);
		Student st1=new Student("s-222", br);
		Student st2=new Student("s-333", br);
		st.getStudentDetails();
		st1.getStudentDetails();
		st2.getStudentDetails();
	}
}
