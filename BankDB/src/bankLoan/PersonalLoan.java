package bankLoan;

public class PersonalLoan extends Loan {
	public int loan(int SI, int Due) {
		int amount = 0;
		if(Due < 16) {			
			amount = SI * 10;
		}
		
		return amount;		
	}	
}

