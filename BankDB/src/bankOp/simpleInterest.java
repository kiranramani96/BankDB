package bankOp;

public class simpleInterest {	
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
		}else {
			SI = super.interest(principal, time, percentage);
			SI = SI + (due*1000);
		}
		return SI;		
	}	
}