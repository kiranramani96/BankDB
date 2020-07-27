package runner;
import bankLoan.*;
import customerInfo.*;

class simpleInterest {	
	public int interest(int principal, int time, int percentage) {
			int SI = 0;
			SI = (principal * time * percentage)/100;			
			return SI;
	}
}
class interest1 extends simpleInterest {
	public int interest(int principal, int time, int percentage) {
		int SI = 0;
		SI = (principal * time * percentage)/100;			
		return SI;
	}	
}
class interest2 extends simpleInterest {
	public int interest(int principal, int time, int percentage, int due) {
		int SI = 0;
		if(due >= 16) {
			System.out.println("Due greater than or equal to 16 months, Fine to be paid ! ");
			return 0;
		}else {
			SI = super.interest(principal, time, percentage);
			SI = SI + (due*1000);
		}
		return SI;		
	}	
}


public class RunScript {
	
	public static String EligibilityforLoan(int id) {
		int Account_number= id;
		String Eligible = null;
		if(Account_number < 1000) {
			Eligible = "Personal Loan";
		}else if (Account_number > 1000 && Account_number < 1200) {
			Eligible = "Car Loan"; 
		}else if (Account_number > 1200) {
			Eligible = "Home Loan";
		}
		return Eligible;		
	}

	public static void main(String[] args) {		
		CustInformation obj1 = new  CustInformation();
		simpleInterest obj2 = new simpleInterest();
		interest1 obj3 = new interest1();
		interest2 obj4 = new interest2();
		PersonalLoan v1 = new PersonalLoan();
		HomeLoan v2 = new HomeLoan();
		CarLoan v3 = new CarLoan();
		obj1.setname("Kiran");
		String name = obj1.getname();
		System.out.println("Customer Name : "+ name);
		obj1.setid(1001);
		int id = obj1.getid();
		obj1.setdue(14);
 		int due = obj1.getdue();
 		String Eligibility = EligibilityforLoan(id);
 		System.out.println("Eligible for: " +  Eligibility);
 		int SI = 0;
 		int Loan_amount = 0;
 		switch(Eligibility) {
 			case "Personal Loan":
 				SI = obj2.interest(1000, 10, 10);
 				Loan_amount = v1.loan(SI, due);
 				System.out.println("Loan Amount Sanctioned - \nName: " + name + "\nID: " + id + "\nLoan Amount: " + Loan_amount + "\nInterest: " + SI);
 				break;
 			case "Car Loan":
 				SI = obj3.interest(1100, 10, 12);
 				Loan_amount = v2.loan(SI, due);
 				System.out.println("Loan Amount Sanctioned - \nName: " + name + "\nID: " + id + "\nLoan Amount: " + Loan_amount + "\nInterest: " + SI);
 				break; 			
 			case "Home Loan":
 				SI = obj4.interest(1100, 10, 12, due);
 				Loan_amount = v3.loan(SI, due);
 				System.out.println("Loan Amount Sanctioned - \nName: " + name + "\nID: " + id + "\nLoan Amount: " + Loan_amount + "\nInterest: " + SI);
 				break;
 		} 		
	}
}
