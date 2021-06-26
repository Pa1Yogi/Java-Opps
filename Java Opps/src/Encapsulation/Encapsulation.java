package Encapsulation;

 class Mobile {
     
	private String mobile_Name;
	private int mobile_Number;
	
	public void setMobile_Name(String name) {
		this.mobile_Name=name;
	}
	public void setMobile_Number(int number) {
		this.mobile_Number=number;
	}
	
	public String getMobile_Name() {
		return mobile_Name;
	}
	
	public int getMobile_Number() {
		return mobile_Number;
	}
	
  
}

public class Encapsulation{
	
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.setMobile_Name("MI");
		m.setMobile_Number(333);
		System.out.println(m.getMobile_Name());
		System.out.println(m.getMobile_Number());
	}
}
