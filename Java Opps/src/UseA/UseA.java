package UseA;

class Account {
	String Aname;
	String Atype;
	int Abalance;
	Account(String Aname1,String Atype1){
		Aname=Aname1;
		Atype=Atype1;
	}
}
class Transaction{
	String tid;
	String ttype;
	Transaction(String tid1,String ttype1){
		tid=tid1;
		ttype=ttype1;
	}
	void deposit(Account acc,int depAmt) {
		int intiAmt=acc.Abalance;
		int totalAmt=intiAmt+depAmt;
		acc.Abalance=totalAmt;
		System.out.println("Transaction Details");
		System.out.println("Transaction Id    :"+tid);
		System.out.println("Transaction  Type :"+ttype);
		System.out.println("Account Name  :"+acc.Aname);
		System.out.println("Account Type :"+acc.Atype);
		System.out.println("Initial Amount :"+intiAmt);
		System.out.println("Deposit Amount :"+depAmt);
		System.out.println("Total Amount   :"+acc.Abalance);
		System.out.println();
	}
	void withdraw(Account acc,int witAmt) {
		int intiAmt=acc.Abalance;
		int totAmt=intiAmt-witAmt;
		acc.Abalance=totAmt;
		System.out.println("Transaction Details");
		System.out.println("Transaction Id    :"+tid);
		System.out.println("Transaction  Type :"+ttype);
		System.out.println("Account Name  :"+acc.Aname);
		System.out.println("Account Type :"+acc.Atype);
		System.out.println("Initial Amount :"+intiAmt);
		System.out.println("WithDraw Amount :"+witAmt);
		System.out.println("Total Amount   :"+acc.Abalance);
	}
}

public class UseA {

	public static void main(String[] args) {
		Account acc=new Account("abc","Savings");
		Transaction tx=new Transaction("t-1", "Deposit");
		Transaction tx1=new Transaction("t-2", "withdraw");
		tx.deposit(acc, 5000);
		tx1.withdraw(acc, 2000);
		
	}

}
