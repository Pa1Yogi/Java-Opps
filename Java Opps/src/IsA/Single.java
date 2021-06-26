package IsA;

// IS-A Inheritance--Single
class Section{
	String scname;
	void getSectionDetails() {
		System.out.println("Student Section :"+scname);
	}
}
class Student extends Section{
	String sname;
	Student(String sname1,String scname1){
		sname=sname1;
		scname=scname1;
	}
	void getStudentSection() {
		System.out.println("Student Details");
		System.out.println("Sudent Name     :"+sname);
		  getSectionDetails();
	}
}
public class Single {

	public static void main(String[] args) {
		Student st=new Student("S-AAA", "Section-A");
		st.getStudentSection();
	}
}
