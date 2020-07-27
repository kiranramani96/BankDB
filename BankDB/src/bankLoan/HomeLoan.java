package bankLoan;

public class HomeLoan extends Loan {
	public int loan(int SI, int Due) {
		int amount = 0;
		if(Due < 16) {			
			amount = SI * 15;
		}
		
		return amount;		
	}
}
