package OOP;

public class AbstractionTest extends Abstraction {
	
	
	
	public  void Loan(){//5. Provide the implementations is nothing but override the methods in child classes.
		                //6. The abstract class contains declarations but for that declarations implementation is present in child classes. 
		System.out.println("***ICICI LOAN SYSTEM***");
	}
	
	public void InternetBanking(){
		System.out.println("***INTERNET BANKING***");//7. If you inherited the abstract class then that class 
		//of all abstract method must declared in child class.
	}
	
	public void Funds(){
		System.out.println("***Funds Method***");
	}
	
	public void MobileBanking(){
		System.out.println("***MOBILE BANKING SYSTEM***");
	}
	

	public static void main(String[] args) {

		AbstractionTest at=new AbstractionTest();
		at.Loan();
		at.Funds();
		at.MobileBanking();
		at.Debit();
		at.Credit();
		at.InternetBanking();
		
		Abstraction abs=new AbstractionTest();
		abs.Credit();
		abs.Debit();
		abs.Loan();
		abs.InternetBanking();
		
		
		

		
		
		
	}


}
