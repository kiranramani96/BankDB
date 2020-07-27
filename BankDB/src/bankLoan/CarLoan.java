package bankLoan;


public class CarLoan extends Loan {

	public int loan(int SI, int Due) {
		int amount = 0;
		if(Due < 16) {			
			amount = SI * 18;
		}
		
		return amount;		
	}	
}
