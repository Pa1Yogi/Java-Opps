package HasA;

//Many To Many Using Constructor Dependency
class Courses{
	String cname;
	Courses(String cname){
		this.cname=cname;
	}
}
class Students{
	String sname;
    Courses[] cr;
    Students(String sname,Courses[] cr) {
		this.sname=sname;
		this.cr=cr;
	}
    public void getStudents() {
    	System.out.println("Student Details");
    	System.out.println("Student Name :"+sname);
    	System.out.println("Courses :");
    	for(int i=0;i<cr.length;i++) {
    		Courses c=cr[i];
    		System.out.println("\t"+c.cname);
    	}
    	System.out.println();
    }
}
public class ManyToMany {

	public static void main(String[] args) {
		Courses cr=new Courses("Java");
		Courses cr1=new Courses("Spring");
		Courses cr2=new Courses("Hibernate");
		Courses[] c= {cr,cr1,cr2,};
		Students st=new Students("S-ABC", c);
		Students st1=new Students("S-DEF", c);
		Students st2=new Students("S-GHI", c);
		st.getStudents();st1.getStudents();st2.getStudents();
		
	}
}
